package ex;

import java.util.HashMap;
import java.util.Scanner;

public class HashTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashMap<String,Integer> nations = new HashMap<String,Integer>();
		System.out.println("나라 이름과 인구를 10개 입력하시오.(예:Korea 5000)");

	
		while(true) {
			System.out.println("나라 이름, 인구>> ");
			String n = s.next();
			if(nations.equals("그만"))
			break;
			int p = s.nextInt();
			nations.put(n, p);
		}
		
		while(true) {
			System.out.print("인구 검색>> ");
			String n = s.next();
			if(n.equals("그만"))
				break;
			Integer p = nations.get(n);
		}
		
	}

}
 