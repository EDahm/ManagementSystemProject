import java.util.Scanner;
class Calc {
	int a;
	int b;
	
	 void setValue(int a, int b) {
		 this.a = a;
		 this.b = b;
	 }
}

public class Mission1127 extends Calc{
	int a; int b;
 
	class Add{
		int calculate() {
			return a + b;
		}
	}
	class Sub{
		int calculate() {
			return a - b;
		}
	}
	class Mul{
		int calculate() {
			return a * b;
		}
	}
	class Div{
		double calculate() {
			return (double) a / b;
		}
	}

 
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("실행을 원하는 연산자를 선택해 주세요");
			System.out.println("[1] 더하기");
			System.out.println("[2] 빼기");
			System.out.println("[3] 곱하기");
			System.out.println("[4] 나누기");
			System.out.println("[etc] 종료");
			int op = s.nextInt();
	 
			System.out.println("계산을 원하는 두 정수를 입력 하세요>>");
			System.out.print("첫번째: ");
			int a = s.nextInt();
			System.out.print("두번째: ");
			int b = s.nextInt();

	 
			switch(op) {
		 		case 1: ;
		 		case 2: ;
		 		case 3: ;
		 		case 4: ;
		 		default: ;
			}
		}
	}
}

// +, -, *, /를 수행하는 각 클래스 Add Sub Mul Div를 만들어라 
//이들은 모두 다음 필드,메소드를 가진다.

//int 타입의 a,b필드: 피연산자
//void setValue(int a, int b) 피연산자를 객체 내에 설정한다.
//int calculate(): 해당 클래스의 목조ㅓㄱ에 맞는 연산을 실행하고 그결과를 리턴

//add,sub...클래스에 공통된 필드와 메소드가 존재하므로 새로운 추서ㅏㅇ 클래스 Calc를 정의하고 
//이들이 Calc를 상속받게 하라. main() 메소드에서 다음 실행 사례의 그림과 같이 키보드로부터 계산
//하고자하는 연산자와 두 정수를 입력받은 후, add...중에서 이 연산을 시행할 수 있는 객체 생성
//그뒤 setValue(), calculate()를 호출하여 그 결과 값을 화면에 출력하라



//++수정수정
