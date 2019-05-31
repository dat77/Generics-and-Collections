package com.gmail.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LetterStatistic implements Comparator<LetterAndCount>  {
	
	List<LetterAndCount> letters = new ArrayList<>();
	
	public LetterStatistic() {
		for (char i = 'a'; i <= 'z'; i++) {
			letters.add(new LetterAndCount(i));
		}
	}

	@Override
	public String toString() {
		letters.sort(this);
		StringBuilder sb = new StringBuilder();
		letters.forEach(x -> sb.append(x + "\n"));
		return sb.toString();
	}
	
	public void incLetter(char ch) {
		letters.forEach(t -> {
				if (ch==t.getLetter()) {
					t.setCount(t.getCount()+1);
				}
		});
	}
	
	public void countLetter(String str) {
		char[] chars = str.replaceAll("[^a-zA-Z]", "")
				.toLowerCase()
				.toCharArray();
		for (char c : chars) {
			incLetter(c);
		}
	}

	@Override
	public int compare(LetterAndCount o1, LetterAndCount o2) {
		if (o1.getCount()>o2.getCount()) {
			return -1;
		} else if (o2.getCount()>o1.getCount()) {
			return 1;
		}
		return 0;
	}

}
