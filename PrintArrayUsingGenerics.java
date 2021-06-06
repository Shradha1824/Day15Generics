package com.generics;

public class PrintArrayUsingGenerics {
	
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
		
		PrintArray.toPrint(intArray);
		PrintArray.toPrint(doubleArray);
		toPrint(charArray);
	}
}