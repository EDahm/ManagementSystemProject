package ex;

import java.util.Scanner;
import java.util.Vector;

public class VectorTest {

	public static void Max(Vector<Integer> v) {
		int max = v.get(0);
		for(int i=1; i<v.size(); i++) {
			if(max < v.get(i))  
				max = v.get(i);
		}

		System.out.println("���� ū ���� " + max);
	}
	
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		Scanner s = new Scanner(System.in);

		System.out.println("����(-1�� �Էµɶ�����)>>> ");
		while(true) {
			int n = s.nextInt();
			if(n == -1)
				break;
			v.add(n);
		}

		
		Max(v);



	}

}
