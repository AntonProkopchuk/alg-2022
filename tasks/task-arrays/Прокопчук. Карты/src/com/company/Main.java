//Сармулейно Артем
//2Б2
//Задача 1

/*
 * Напишите программу, которая должна имитировать раздачу карт для игры в покер.
 * Программа получает число n, задаваемое с консоли пользователем, и раздает карты на n игроков (по 5 карт каждому)
 * из рассортированной колоды. Разделяйте пять карт, выданных каждому игроку, пустой строкой.
 * Объект карты реализуется классом PlayingCard.
 */

package com.company;

import ru.bgpu.task.arrays.PlayingCard;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введите кол-во игроков: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        if (x < 0 || x > 10) {
            System.out.println("Кол-во игроков не может быть меньше нуля или больше 10");
            System.exit(0);
        }
        int position = 0;
        PlayingCard[] cards = new PlayingCard[52];
        for (int z = 0; z < PlayingCard.SUITS_LIST.length; z++) {
            for (int c = 0; c < PlayingCard.RANK_LIST.length; c++) {
                cards[position] = new PlayingCard(PlayingCard.SUITS_LIST[z], PlayingCard.RANK_LIST[c]);
                position++;
            }
        }
        int[] randomValues = GenerateRandomArray(n);
        position = 0;
        for (int z = 0; z < x; z++) {
            System.out.printf("Карты игрока [%d]", z + 1);
            System.out.println();
            for (int c = 0; c < 5; c++) {
                System.out.println(cards[randomValues[position]].toString());
                position++;
            }
        }
    }

    private static int[] GenerateRandomArray(int x) {
        int[] randomArray = new int[x * 5];
        Random random = new Random();
        int randomValue;
        boolean trigger = false;
        for (int z = 0; z < randomArray.length; ) {
            randomValue = random.nextInt(52);
            for (int c = 0; c < randomArray.length; ) {
                if (randomArray[c] == randomValue) {
                    trigger = true;
                    break;
                }
                c++;
            }
            if (!trigger) {
                randomArray[z] = randomValue;
                z++;
            }
            trigger = false;
        }
        return randomArray;
    }
}