package com.gmail.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class LetterStatistic {
	
	TreeSet<LetterAndCount> letters = new TreeSet<>(new Comparator<LetterAndCount>() {

		@Override
		public int compare(LetterAndCount o1, LetterAndCount o2) {
			if (o1.getCount() > o2.getCount()) {
				return 1;
			}else if (o1.getCount() < o2.getCount()) {
				return -1;
			}else {
				return 0;	
			}
		}
		
	});
	
	public LetterStatistic() {
		for (int i = 'a'; i <= 'z'; i++) {
			letters.add(new LetterAndCount((char) i));			
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Count: "+letters.size());
		letters.forEach(x -> sb.append(x));
//		for (LetterAndCount letterAndCount : letters) {
//			sb.append(letterAndCount);
//		}
		return sb.toString();
	}
	
	

}
