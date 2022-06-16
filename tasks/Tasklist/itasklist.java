package ru.bgpu.task.list;

import java.util.Collection;

public interface ITaskList<E> extends Iterable<E> 
{

    /**
     * Метод добавляет в конец списка новый элемент
     */
    void add(E e);

    /**
     * Метод добавляет в конец списка элементы из переданной коллекции
     */
    void addAll(Collection<? extends E> collection);

    /**
     * Удаление из списка всех значений
     */
    void clear();

    /**
     * Получение элемента списка по индексу
     */
    E get(int index);

    /**
     * Проверка на заполненность списка
     */
    boolean isEmpty();

    /**
     * Проверка на принодлежность элемента списку
     */
    boolean contains(E value);

    /**
     * Удаление элемента списка по индексу
     */
    E remove(int index);

    /**
     * Получение длинны списка
     */
    int size();

    /**
     * Удаление элемента списка по индексу
     */
    ITaskList<E> subList(int fromIndex, int toIndex);

    /**
     * Превращение списка в массив
     */
    Object[] toArray();
}
