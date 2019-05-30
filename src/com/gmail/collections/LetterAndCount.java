package com.gmail.collections;

public class LetterAndCount {
	
	private char letter;
	private int count;
	public LetterAndCount(char letter) {
		this.letter = letter;
		this.count = 0;
	}
	public char getLetter() {
		return letter;
	}
	public void setLetter(char letter) {
		this.letter = letter;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + letter;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LetterAndCount other = (LetterAndCount) obj;
		if (letter != other.letter)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "[letter=" + letter + ", count=" + count + "]";
	}
	
	

}
