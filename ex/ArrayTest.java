package ex;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		ArrayList<Character> grade = new ArrayList<Character>();
		Scanner s = new Scanner(System.in);

		System.out.println("6개 학점('A','B','C','D','F') 입력>> ");
		for (int i = 0; i < 6; i++) {
			char g = s.next().charAt(0);
			grade.add(g);

		}

		int sum = 0;
		for (int i = 0; i < grade.size(); i++) {
			char g = grade.get(i);

			switch(g) {
			case 'A': sum+= 4;
			case 'B': sum+= 3;
			case 'C': sum+= 2;
			case 'D': sum+= 1;
			case 'F': sum+= 0;
			}

		}
		
		double avr = (double)sum/grade.size();
		System.out.printf("평균>> %.2f", avr);

	}
}


