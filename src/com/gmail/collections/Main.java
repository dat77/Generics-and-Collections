package com.gmail.collections;

import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

import com.gmail.io.FileHandler;

public class Main {

	public static void main(String[] args) {

		/**
		 * 1) Написать метод, который создаст список, положит в него 10 элементов, затем
		 * удалит первые два и последний, а затем выведет результат на экран.
		 */
		testArrayList();

		/**
		 * 4) Шелдон, Леонард, Воловиц, Кутрапалли и Пенни стоят в очереди за «двойной
		 * колой». Как только человек выпьет такой колы, он раздваивается и оба
		 * становятся в конец очереди, чтобы выпить еще стаканчик. Напишите программу,
		 * которая выведет на экран состояние очереди в зависимости от того, сколько
		 * стаканов колы выдал аппарат с чудесным напитком. Например, если было выдано
		 * только два стакана, то очередь выглядит как: [Volovitc, Kutrapalli, Penny,
		 * Sheldon, Sheldon, Leonard, Leonard]
		 */
		testArrayDeque(3);

		/**
		 * 3) Считайте из файла текст на английском языке, вычислите относительную
		 * частоту повторения каждой буквы и выведите на экран результат в порядке
		 * убывания относительной частоты повторения.
		 */

		LetterStatistic letStat = new LetterStatistic();
		letStat.countLetter(FileHandler.readFromFile(new File("Lolita.txt")));
		System.out.println(letStat);

	}

	public static void testArrayList() {
		List<Double> listOfDouble = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			listOfDouble.add(31.1 * i / 3);
		}

		listOfDouble.forEach(x -> System.out.format("%.2f ", x));
		System.out.println();
		listOfDouble.remove(0);
		listOfDouble.remove(0);
		listOfDouble.remove(listOfDouble.size() - 1);

		listOfDouble.forEach(System.out::println);
	}

	public static void testArrayDeque(int countOfGlasses) {

		Deque<String> colaDrinkers = new ArrayDeque<>();
		colaDrinkers.push("Penny");
		colaDrinkers.push("Koothrappali");
		colaDrinkers.push("Wolowitz");
		colaDrinkers.push("Leonard");
		colaDrinkers.push("Sheldon");

		for (int i = 0; i < countOfGlasses; i++) {
			String person = colaDrinkers.pop();
			colaDrinkers.addLast(person);
			colaDrinkers.addLast(person);
		}

		System.out.println(Arrays.toString(colaDrinkers.toArray()));

	}

}
