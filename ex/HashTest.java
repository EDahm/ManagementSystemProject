package ex;

import java.util.HashMap;
import java.util.Scanner;

public class HashTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashMap<String,Integer> nations = new HashMap<String,Integer>();
		System.out.println("���� �̸��� �α��� 10�� �Է��Ͻÿ�.(��:Korea 5000)");

	
		while(true) {
			System.out.println("���� �̸�, �α�>> ");
			String n = s.next();
			if(nations.equals("�׸�"))
			break;
			int p = s.nextInt();
			nations.put(n, p);
		}
		
		while(true) {
			System.out.print("�α� �˻�>> ");
			String n = s.next();
			if(n.equals("�׸�"))
				break;
			Integer p = nations.get(n);
		}
		
	}

}
 