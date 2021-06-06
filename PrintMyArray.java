package com.generics;

public class PrintMyArray <E> {
	E[] myArray;
	
	public PrintMyArray(E[] myArray) {
		this.myArray = myArray;
	}
	
	public static <E> void toPrint(E[] inputArray) {
		for(E element : inputArray) {
			System.out.printf("%s",  element);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4};
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' }; 
		
		new PrintMyArray<Integer>(intArray).toPrint();
		new PrintMyArray<Double>(doubleArray).toPrint();
		new PrintMyArray<Character>(charArray).toPrint();
	}
	
	public void toPrint() {
		PrintMyArray.toPrint(this.myArray);
	}
}
