package Project;

import java.util.*;

public class MngSys {

	ArrayList<Student> stu = new ArrayList<Student>();

	public void currentStudent() {
		stu.add(new Student("������", "��", 921014, "010-9874-3867", "�뼺��", 01, 60));
		stu.add(new Student("Ȳ�Ը�", "��", 921014, "010-9874-3867", "�뼺��", 01, 60));
		stu.add(new Student("����ȫ", "��", 921014, "010-9874-3867", "�뼺��", 01, 60));
		stu.add(new Student("������", "��", 921014, "010-9874-3867", "�뼺��", 01, 60));
		stu.add(new Student("������", "��", 921014, "010-9874-3867", "�뼺��", 01, 60));
	}

	public void addStudent() {
		Scanner s = new Scanner(System.in);

		System.out.print("�̸� : ");
		String name = s.next();

		System.out.print("����(��/��) : ");
		String gender = s.next();

		System.out.print("�������(ex:021212) : ");
		int birth = s.nextInt();

		System.out.print("����ó(010-0000-0000) : ");
		String phnum = s.next();

		System.out.print("��������(�Ϲ�/�뼺��) : ");
		String type = s.next();

		System.out.println("��������(��ȣ����)");
		System.out.println("[01]Ǯ���� ������ �缺����");
		System.out.println("[02]���ǵ�����(�������ۺ���)");
		System.out.println("[03]ȯ��(���׸���) 3D������");
		System.out.println("[04]AutoCAD �����");
		System.out.println("[05]�繫���� �� ���伥 Ȱ��");
		System.out.println("[06]�������� ITQ�ڰ���(�ѱ�/����/PPT) ���");
		int lecture = s.nextInt();

		System.out.print("���� : ");
		int score = s.nextInt();

		stu.add(new Student(name, gender, birth, phnum, type, lecture, score));

	}

	public void printStu() {

		for (int i = 0; i < stu.size(); i++) {
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
	}
}
