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
			System.out.println("������ ���ϴ� �����ڸ� ������ �ּ���");
			System.out.println("[1] ���ϱ�");
			System.out.println("[2] ����");
			System.out.println("[3] ���ϱ�");
			System.out.println("[4] ������");
			System.out.println("[etc] ����");
			int op = s.nextInt();
	 
			System.out.println("����� ���ϴ� �� ������ �Է� �ϼ���>>");
			System.out.print("ù��°: ");
			int a = s.nextInt();
			System.out.print("�ι�°: ");
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

// +, -, *, /�� �����ϴ� �� Ŭ���� Add Sub Mul Div�� ������ 
//�̵��� ��� ���� �ʵ�,�޼ҵ带 ������.

//int Ÿ���� a,b�ʵ�: �ǿ�����
//void setValue(int a, int b) �ǿ����ڸ� ��ü ���� �����Ѵ�.
//int calculate(): �ش� Ŭ������ �����ä��� �´� ������ �����ϰ� �װ���� ����

//add,sub...Ŭ������ ����� �ʵ�� �޼ҵ尡 �����ϹǷ� ���ο� �߼����� Ŭ���� Calc�� �����ϰ� 
//�̵��� Calc�� ��ӹް� �϶�. main() �޼ҵ忡�� ���� ���� ����� �׸��� ���� Ű����κ��� ���
//�ϰ����ϴ� �����ڿ� �� ������ �Է¹��� ��, add...�߿��� �� ������ ������ �� �ִ� ��ü ����
//�׵� setValue(), calculate()�� ȣ���Ͽ� �� ��� ���� ȭ�鿡 ����϶�

