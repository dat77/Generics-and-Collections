package com.gmail.collections;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		/**
		 * 1) Написать метод, который создаст список, положит в него 10 элементов, затем
		 * удалит первые два и последний, а затем выведет результат на экран.
		 */
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
	

}
