package ru.tasks.tasklist.main;

import ru.taskListSourse.tasklist;

public class Main {
	public static void main(String[] args)
  {
		TaskList<Integer> taskList = new TaskList<>();
		for (int i = 0; i < 100; i++)
    {
			taskList.add(i);
		}
		for (Integer item : taskList)
    {
			System.out.println(item);
		}
		taskList.clear();
	}
}
