package Inheritance;

import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Square[] square = new Square[10];
		for (int i = 0; i < square.length; i++) {	
			System.out.println("Enter Length of the square"+(i+1));
			int s = scanner.nextInt();	
			square[i] = new Square(s);
		}
		for (Square square1 : square) {
			square1.printArea();
		}
	}
}
