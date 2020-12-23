package Project;

import java.util.*;

public class MngSys {
	Scanner s = new Scanner(System.in);
	
	

	

////////////////////////////////////////////////////////////////////////////////////
//--------------------------------------------------------------------���� ������
	ArrayList<Student> stu = new ArrayList<Student>();

	public void currentStudent() {
		stu.add(new Student("������", "��", "921014", "010-9874-3867", "�뼺��", 01, 60));
		stu.add(new Student("Ȳ�Ը�", "��", "921014", "010-9874-3867", "�뼺��", 01, 60));
		stu.add(new Student("����ȫ", "��", "921014", "010-9874-3867", "�뼺��", 01, 0));
		stu.add(new Student("������", "��", "921014", "010-9874-3867", "�뼺��", 01, 60));
		stu.add(new Student("������", "��", "921014", "010-9874-3867", "�뼺��", 01, 60));
	}

///////////////////////////////////////////////////////////////////////////////////////////////
//----------------------------------------------------------------------1-2������ �߰�
	public void addStudent() {

		System.out.println("-------------------------------------");

		System.out.print("�̸� : ");
		String name = s.next();

		System.out.print("����(��/��) : ");
		String gender = s.next();

		System.out.print("�������(ex:021212) : ");
		String birth = s.next();

		System.out.print("����ó(010-0000-0000) : ");
		String phnum = s.next();

		System.out.print("��������(�Ϲ�/�뼺��) : ");
		String type = s.next();

		System.out.println("��������(��ȣ����) : ");
		System.out.println("[01] Ǯ���� ������ �缺����");
		System.out.println("[02] ���ǵ�����(�������ۺ���)");
		System.out.println("[03] ȯ��(���׸���) 3D������");
		System.out.println("[04] AutoCAD �����");
		System.out.print(">> ");
		int lecture = s.nextInt();

		System.out.print("����(���Է� ó�� '0'�Է�) : ");
		int score = s.nextInt();

		System.out.println("-------------------------------------");

		stu.add(new Student(name, gender, birth, phnum, type, lecture, score));

		System.out.println("[system]������ ����� �Ϸ�Ǿ����ϴ�.");
		printStu();
		
		System.out.println("---------------");
		System.out.println("[1] �߰����");
		System.out.println("[2] �����޴�");
		System.out.println("[0] ����");
		System.out.println("---------------");

		System.out.print(">> ");
		int num = s.nextInt();

		switch (num) {
		case 1:
			addStudent();
			break;
		case 2:
			subMenu01();
			break;
		case 0:
			System.out.println("[system]���α׷��� �����մϴ�.");
			System.exit(0);
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			System.out.print(">> ");
			num = s.nextInt();
		}

	}
	
///////////////////////////////////////////////////////////////////////////////////////////////////
//----------------------------------------------------------------------------------���� ��� ������




	public void prnLect() {
		System.out.println("��������(��ȣ����)");
		System.out.println("[01]Ǯ���� ������ �缺����");
		System.out.println("[02]���ǵ�����(�������ۺ���)");
		System.out.println("[03]ȯ��(���׸���) 3D������");
		System.out.println("[04]AutoCAD �����");
		System.out.println("[05]�繫���� �� ���伥 Ȱ��");
		System.out.println("[06]�������� ITQ�ڰ���(�ѱ�/����/PPT) ���");
	}

/////////////////////////////////////////////////////////////////////////////////////
//--------------------------------------------------------------------������ 1�� ��ȸ
	public void prnPer(int i) {
		System.out.print("�л�" + (i + 1) + " : " + stu.get(i).name + "/" + stu.get(i).gender + "/" + stu.get(i).birth
				+ "/" + stu.get(i).phnum + "/" + stu.get(i).type + "/");

		switch (stu.get(i).lecture) {
		case 01:
			System.out.println("Ǯ���� ������ �缺����");
			break;
		case 02:
			System.out.println("���ǵ�����(�������ۺ���)");
			break;
		case 03:
			System.out.println("���ǵ�����(�������ۺ���)");
			break;
		case 04:
			System.out.println("AutoCAD �����");
			break;
		case 05:
			System.out.println("�繫���� �� ���伥 Ȱ��");
			break;
		case 06:
			System.out.println("�������� ITQ�ڰ���(�ѱ�/����/PPT) ���");
			break;
		}
	}
	
	
	
///////////////////////////////////////////////////////////////////////////////////////////////
//-------------------------------------------------------------------------1-1-1��ü��������ȸ
	public void printStu() {

		System.out.println("---------------------------------------------------------");

		for (int i = 0; i < stu.size(); i++) {
			prnPer(i);
		}

		System.out.println("---------------------------------------------------------");

	}
	

//////////////////////////////////////////////////////////////////////////////////////
//----------------------------------------------------------------1-3 ������ ����
	public void resetStu() {
		System.out.print("������ �������� �̸� : ");
		String setStu = s.next();

		for (int i = 0; i < stu.size(); i++) {
			if (stu.get(i).name.equals(setStu)) {
				System.out.println("������ �׸��� �������ּ���.");
				System.out.println("---------------------------");
				System.out.println("[1]�̸�");
				System.out.println("[2]����(����/����)");
				System.out.println("[3]����(991231)");
				System.out.println("[4]��ȣ(010-1234-5678)");
				System.out.println("[5]���� ����(�Ϲ�/�뼺��)");
				System.out.println("[6]��������");
				System.out.println("---------------------------");
				System.out.print(">> ");
				int setM = s.nextInt();

				if (setM < 1 || setM > 6) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					continue;
				}
				
				System.out.println("������ ���� �Է����ּ���.");
				System.out.print(">> ");

				switch (setM) {
				case 1:
					stu.get(i).name = s.next();
					break;
				case 2:
					stu.get(i).gender = s.next();
					break;
				case 3:
					stu.get(i).birth = s.next();
					break;
				case 4:
					stu.get(i).phnum = s.next();
					break;
				case 5:
					stu.get(i).type = s.next();
					break;
				case 6:
					classList();
					System.out.print("���ǹ�ȣ ����>> ");
					stu.get(i).lecture = s.nextInt();
					break;
				}
				
				System.out.println("[system]������ �Ϸ�Ǿ����ϴ�.");
				printStu();
				break;
			}
			else
				System.out.println(setStu + "��(��) �������� �ƴմϴ�."); break;

		}
		
		System.out.println("---------------");
		System.out.println("[1] �߰�����");
		System.out.println("[2] �����޴�");
		System.out.println("[0] ����");
		System.out.println("---------------");

		System.out.print(">> ");
		int num = s.nextInt();

		switch (num) {
		case 1:
			resetStu();
			break;
		case 2:
			subMenu01();
			break;
		case 0:
			System.out.println("[system]���α׷��� �����մϴ�.");
			System.exit(0);
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			System.out.print(">> ");
			num = s.nextInt();
		}
		

	}

///////////////////////////////////////////////////////////////////////////////////////////////
//-------------------------------------------------------------------------1-4 ����������
	public void removeStu() {
		printStu();
		System.out.print("������ �������� �̸��� �Է����ּ���>> ");
		String remStu = s.next();

		for (int i = 0; i < stu.size(); i++) {
			if (stu.get(i).name.equals(remStu))
				stu.remove(i);
		}
		System.out.println("\n[system]������ �Ϸ�Ǿ����ϴ�.");
		printStu();

		System.out.println("---------------");
		System.out.println("[1] �߰�����");
		System.out.println("[2] �����޴�");
		System.out.println("[0] ����");
		System.out.println("---------------");

		System.out.print(">> ");
		int num = s.nextInt();

		switch (num) {
		case 1:
			removeStu();
			break;
		case 2:
			subMenu01();
			break;
		case 0:
			System.out.println("[system]���α׷��� �����մϴ�.");
			System.exit(0);
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			System.out.print(">> ");
			num = s.nextInt();
		}

	}
	

	
////////////////////////////////////////////////////////////////////////////////////////////////////
//---------------------------------------------------------------------------1-5-1 �����Է�
	public void insertScore() {
		System.out.print("������ �Է��� �������� �̸� : ");
		String setStu = s.next();

		for (int i = 0; i < stu.size(); i++) {
			if (stu.get(i).name.equals(setStu)) {
				System.out.println(setStu + "�� ������ �Է����ּ���.");
				System.out.print(">> ");

				stu.get(i).score = s.nextInt();
				break;
			}

		}
		System.out.println("[system]���� �Է��� �Ϸ�Ǿ����ϴ�.");

		upperORexit();
		upperORexit03();
	}
	
	

	
	
////////////////////////////////////////////////////////////////////////////////////////////////////
//---------------------------------------------------------------------------1-5-2 ������ȸ
	public void searchScore() {
		char pass;

		System.out.println("������ ��ȸ�� �������� �̸��� �Է��ϼ���.");
		System.out.print(">> ");
		String name = s.next();
		for (int i = 0; i < stu.size(); i++) {
			if (stu.get(i).score > 70) {
				pass = 'O';
			} else {
				pass = 'X';
			}
			if(stu.get(i).score == 0) {
				System.out.println(name + " �������� ������ ���� '���Է�'�����Դϴ�.");
			}

			if (stu.get(i).score > 0 && name.equals(stu.get(i).name)) {

				System.out.println("------------------------------------");
				System.out.println("�̸� : " + stu.get(i).name);

				switch (stu.get(i).lecture) {
				case 01:
					System.out.println("�������� ���� : Ǯ���� ������ �缺����");
					break;
				case 02:
					System.out.println("�������� ���� : ���ǵ�����(�������ۺ���)");
					break;
				case 03:
					System.out.println("�������� ���� : ���ǵ�����(�������ۺ���)");
					break;
				case 04:
					System.out.println("�������� ���� : AutoCAD �����");
					break;
				}

				System.out.println("���� : " + stu.get(i).score);
				System.out.println("���ᰡ�ɿ��� : " + pass);
				System.out.println("------------------------------------");
				break;
			}
		}
	}

////////////////////////////////////////////////////////////////////////////////////
//------------------------------------------------------------------���� ���

	ArrayList<Class> lecture = new ArrayList<Class>();

	public void classList() {
		lecture.add(new Class("Ǯ���� ������ �缺����", "������, �ڹ�", "��-�� / 09:20 - 18:00", "302ȣ", "2020-10-15 ~ 2021-03-11"));
		lecture.add(new Class("���ǵ�����(�������ۺ���)", "��ö��", "��-�� / 10:00 - 14:00", "501ȣ", "2020-12-01 ~ 2021-01-31"));
		lecture.add(new Class("ȯ��(���׸���) 3D������", "��ö��", "��,��,�� / 13:10 - 17:00", "303ȣ", "2020-11-04 ~ 2021-12-24"));
		lecture.add(new Class("AutoCAD �����", "��ö��", "ȭ,��,�� / 11:10 - 16:00", "502ȣ", "2020-10-14 ~ 2021-11-30"));
	}

///////////////////////////////////////////////////////////////////////////////////////////
//----------------------------------------------------------------2-n ���� ���λ��� ���
	public void printClass(int num) {
		System.out.println("-------------------------------------");
		System.out.println("���Ǹ� : " + lecture.get(num - 1).name);
		System.out.println("��簭�� : " + lecture.get(num - 1).professor);
		System.out.println("�ð�ǥ : " + lecture.get(num - 1).time);
		System.out.println("���ǽ� : " + lecture.get(num - 1).classroom);
		System.out.println("�Ⱓ : " + lecture.get(num - 1).date);
		System.out.println("-------------------------------------");

		System.out.println("[1] ������ ��� ��ȸ");
		System.out.println("[2] �ٸ� ���� ��ȸ");
		System.out.println("[3] �����޴�");
		System.out.println("[0] ����");
		System.out.println("-------------------------------------");
		System.out.print(">> ");
		int pcNum = s.nextInt();
		int count = 0;
		
		System.out.println();
		switch (pcNum) {
			case 1:
				for (int i = 0; i < stu.size(); i++) {
					if (stu.get(i).lecture == num) {
						prnPer(i);
						count++;
					}
				}  if(count == 0) {System.out.println("�ش� ���´� ���� �������� �����ϴ�.");} break;
		case 2:
			subMenu02();
			break;
		case 3:
			start();
			break;
		case 0:
			System.out.println("[system]���α׷��� �����մϴ�.");
			System.exit(0);
			break;
		}

	}

//--------------------------------------------------------------------------�޴��޴�

////////////////////////////////////////////////////////////////////////////////////
//--------------------------------------------------------------------�����޴�, ����
	public void upperORexit() {
		System.out.println("---------------");
		System.out.println("[1] �����޴�");
		System.out.println("[0] ����");
		System.out.println("---------------");

	}
	
////////////////////////////////////////////////////////////////////////////////////
//--------------------------------------------------------------------�߰���ȸ
	public void research() {
		System.out.println("---------------");
		System.out.println("[1] �߰���ȸ");
		System.out.println("[2] �����޴�");
		System.out.println("[0] ����");
		System.out.println("---------------");

	}

	
	
////////////////////////////////////////////////////////////////////////////////////
//--------------------------------------------------------------------�߰� ��ȸ ����
	public void prnSearch() {
		System.out.print(">> ");
		int num = s.nextInt();

		switch (num) {
		case 1:
			//������ȸ �޼ҵ�
			break;
		case 2:
			subsubMenu();
			break;
		case 0:
			System.out.println("[system]���α׷��� �����մϴ�.");
			System.exit(0);
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			System.out.print(">> ");
			num = s.nextInt();
		}
	}


////////////////////////////////////////////////////////////////////////////////////
//--------------------------------------------------------------------�߰� ��ȸ ����������
	public void typeSearch() {
		System.out.print(">> ");
		int num = s.nextInt();

		switch (num) {
		case 1:
			//���������� �޼ҵ�
			break;
		case 2:
			subsubMenu();
			break;
		case 0:
			System.out.println("[system]���α׷��� �����մϴ�.");
			System.exit(0);
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			System.out.print(">> ");
			num = s.nextInt();
		}
	}
	

	
////////////////////////////////////////////////////////////////////////////////////
//--------------------------------------------------------------------�߰� ��ȸ ���º�
	public void lecSearch() {
		System.out.print(">> ");
		int num = s.nextInt();

		switch (num) {
		case 1:
			//���º� �޼ҵ�
			break;
		case 2:
			subsubMenu();
			break;
		case 0:
			System.out.println("[system]���α׷��� �����մϴ�.");
			System.exit(0);
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			System.out.print(">> ");
			num = s.nextInt();
		}
}	
	
	
	
////////////////////////////////////////////////////////////////////////////////////
//--------------------------------------------------------------------�߰� ��ȸ ����
	public void scoreSearch() {
		System.out.print(">> ");
		int num = s.nextInt();

		switch (num) {
		case 1:
			//���������� �޼ҵ�
			break;
		case 2:
			subsubMenu();
			break;
		case 0:
			System.out.println("[system]���α׷��� �����մϴ�.");
			System.exit(0);
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			System.out.print(">> ");
			num = s.nextInt();
		}
}

////////////////////////////////////////////////////////////////////////////////////
//--------------------------------------------------------------------���, ���� ���� �����޴�, ����
	
	public void upperORexit01() {
		System.out.print(">> ");
		int num = s.nextInt();

		switch (num) {
		case 1:
			subMenu01();
			break;
		case 0:
			System.out.println("[system]���α׷��� �����մϴ�.");
			System.exit(0);
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			System.out.print(">> ");
			num = s.nextInt();
		}
	}

////////////////////////////////////////////////////////////////////////////////////
//--------------------------------------------------------------------��ȸ �����޴�, ����
	public void upperORexit02() {
		System.out.print(">> ");
		int num = s.nextInt();

		switch (num) {
		case 1:
			subsubMenu();
			break;
		case 0:
			System.out.println("[system]���α׷��� �����մϴ�.");
			System.exit(0);
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			System.out.print(">> ");
			num = s.nextInt();
		}

	}
	
	
////////////////////////////////////////////////////////////////////////////////////
//--------------------------------------------------------------------���� �����޴�, ����
	public void upperORexit03() {
		System.out.print(">> ");
		int num = s.nextInt();

		switch (num) {
		case 1:
			subsubMenu02();
			break;
		case 0:
			System.out.println("[system]���α׷��� �����մϴ�.");
			System.exit(0);
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			System.out.print(">> ");
			num = s.nextInt();
		}

	}

///////////////////////////////////////////////////////////////////////////////////
//-----------------------------------------------------------2�� Ŭ���� ��Ÿ���� �������¸��
	public void lectureMenu() {
		System.out.println("[1] Ǯ���� ������ �缺����");
		System.out.println("[2] ���ǵ�����(�������ۺ���)");
		System.out.println("[3] ȯ��(���׸���) 3D������");
		System.out.println("[4] AutoCAD �����");
		System.out.println("[0] �����޴�");
	}

//////////////////////////////////////////////////////////////////////////////
//--------------------------------------------------------------�޴�����
	public void start() {

		while (true) {
			System.out.println("[[MENU]]");
			System.out.println("---------------");
			System.out.println("[1] ������ ����");
			System.out.println("[2] �������� ��ȸ");
			System.out.println("[0] ����");
			System.out.println("----------------");
			System.out.print(">> ");
			int menuNum = s.nextInt();

			if (menuNum < 0 || menuNum > 2) {
				System.out.println("[system]�߸� �Է��ϼ̽��ϴ�.");
				System.out.println();
				continue;
			}

			System.out.println();

			switch (menuNum) {
			case 0:
				System.out.println("[system]���α׷��� �����մϴ�.");
				System.exit(0);
				break;
			case 1:
				subMenu01();    /////////////////////////////////////// 1�� ���ý�$$$$$$
				break;
			case 2:
				subMenu02();  //////////////////////////////// 2�� ���ý�#######
				break;
			}
		}
	}

//////////////////////////////////////////////////////////////////////////////
	
//-------------------------------------------------------------1�� ������ ����$$$$$$$

	public void subMenu01() {

		while (true) {
			System.out.println("---------------");
			System.out.println("[1] ������ ��ȸ");
			System.out.println("[2] ������ ���");
			System.out.println("[3] ������ ����");
			System.out.println("[4] ������ ����");
			System.out.println("[5] ��������");
			System.out.println("[0] �����޴�");
			System.out.println("----------------");
			System.out.print(">> ");
			int subNum = s.nextInt();

			if (subNum < 0 || subNum > 5) {
				System.out.println("[system]�߸� �Է��ϼ̽��ϴ�.");
				System.out.println();
				continue;
			}

			System.out.println();

			switch (subNum) {
			case 1:
				subsubMenu();
				break;
			case 2:
				addStudent();
				break;
			case 3:
				resetStu();
				break;
			case 4:
				removeStu();
				break;
			case 5:
				subsubMenu02();
				break;
			case 0:
				start();
				break;
			}
		}
	}

//////////////////////////////////////////////////////////////////////////////
//--------------------------------------------------------------1-1 ��������ȸ

	public void subsubMenu() {
			System.out.println("---------------");
			System.out.println("[1] ��ü ������ ��ȸ");
			System.out.println("[2] ���� ������ ��ȸ");
			System.out.println("[3] ���� ������ ��ȸ");
			System.out.println("[4] ���º� ��ȸ");
			System.out.println("[5] ���� ��ȸ");
			System.out.println("[0] �����޴�");
			System.out.println("----------------");
			System.out.print(">> ");
			int subsubNum = s.nextInt();
			String searchStr ="";
			int count = 0;

			if (subsubNum < 0 || subsubNum > 5) {
				System.out.println("[system]�߸� �Է��ϼ̽��ϴ�.");
				System.out.print(">> ");
				subsubNum = s.nextInt();
			}

			System.out.println();
			switch (subsubNum) {
			case 1:
				System.out.println("�� ������ �� : " + stu.size() + "��");
				printStu();
				upperORexit();
				upperORexit02();
				break;
			case 2:
				System.out.println("��ȸ�� �л��� �̸��� �Է��� �ּ���.");
				searchStr = s.next();
				for (int i = 0; i < stu.size(); i++) {
					if (stu.get(i).name.equals(searchStr)) {
						prnPer(i);
						count++;
					}
						
				} if (count == 0) System.out.println("�ش��ϴ� �л��� �����ϴ�.");
				break;
				//�̸���////////////////////////////////////////////////////////////////
			case 3:
				System.out.println("��ȸ�� ���� ������ �Է��� �ּ���.");
				searchStr = s.next();
				for (int i = 0; i < stu.size(); i++) {
					if (stu.get(i).type.equals(searchStr)){
						prnPer(i);
						count++;
					}
				} if (count == 0) System.out.println("�ش��ϴ� �л��� �����ϴ�.");
				break;
				
				//���� ������
          case 4: 
        	  System.out.println("��ȸ�� ���¸��� �Է��� �ּ���.");
        	  prnLect();
        	  int searchInt = s.nextInt();
  			for (int i = 0; i < stu.size(); i++) {
				if (stu.get(i).lecture == searchInt){
					prnPer(i);
					count++;
				}
			} if (count == 0) System.out.println("�ش��ϴ� �л��� �����ϴ�.");
			break;
				// ���º�
			case 5:
				searchScore();
				upperORexit();
				upperORexit02();
				break;
			case 0:
				subMenu01();
				break;
			}
			
	}

//////////////////////////////////////////////////////////////////////////////
//--------------------------------------------------------------1-5 ��������
	public void subsubMenu02() {
		while (true) {
			System.out.println("---------------");
			System.out.println("[1] ���� �Է�");
			System.out.println("[2] ���� ��ȸ");
			System.out.println("[0] �����޴�");
			System.out.println("----------------");
			System.out.print(">> ");
			int subsubNum02 = s.nextInt();

			if (subsubNum02 < 0 || subsubNum02 > 2) {
				System.out.println("[system]�߸� �Է��ϼ̽��ϴ�.");
				System.out.println();
				continue;
			}

			System.out.println();
			switch (subsubNum02) {
			case 1:
				insertScore();
				upperORexit();
				upperORexit03();
			case 2:
				searchScore();
				upperORexit();
				upperORexit03();
			case 0:
				subMenu01();
				break;
			}
		}
	}

//////////////////////////////////////////////////////////////////////////////
//--------------------------------------------------------------2 �������¸��

	public void subMenu02() {//////////////////////////////////////////////////2�� ���� ���� ######
		while (true) {
			System.out.println("�󼼰��� ���� ����(�����ڵ� �Է�)");
			System.out.println("-------------------------------------");
			lectureMenu();
			System.out.println("-------------------------------------");
			System.out.print(">> ");
			int subNum2 = s.nextInt();

			if (subNum2 < 0 || subNum2 > 4) {
				System.out.println("[system]�߸� �Է��ϼ̽��ϴ�.");
				System.out.println();
				continue;
			}

			System.out.println();
			if (subNum2 == 0) {
				start();
				break;
			}

			if (subNum2 >= 1 && subNum2 <= 4) {////////////////////////////////////////
				classList();
				printClass(subNum2);
			}

		}
	}
}