package Project;

import java.util.ArrayList;

public class Class {
	String name;
	String professor;
	String time;
	String classroom;
	String date;

	public Class() {}

	public Class(String name, String professor, String time, String classroom, String date) {
		this.name = name;
		this.professor = professor;
		this.time = time;
		this.classroom = classroom;
		this.date = date;
	}

	public void classList() {
		ArrayList<Class> stuList = new ArrayList<Class>();

		stuList.add(new Class("Ǯ���� ������ �缺����", "������", "�� ~ �� / 09:20 - 17:00", "302ȣ", "2020-10-15 ~ 2021-03-11"));
		stuList.add(new Class("���ǵ�����(�������ۺ���)", "��ö��", "�� ~ �� / 09:30 - 13:00", "501ȣ", "2020-11-09 ~ 2020-12-31"));
		stuList.add(new Class("ȯ��(���׸���) 3D������", "��ö��", "�� ~ �� / 10:00 - 15:00", "502ȣ", "2020-12-01 ~ 2021-02-11"));
		stuList.add(new Class("AutoCAD �����", "��ö��", "�� ~ �� / 11:00 - 17:00", "303ȣ", "2020-09-30 ~ 2020-11-30"));
		stuList.add(new Class("�繫���� �� ���伥 Ȱ��", "��ö��", "��,��,�� / 10:00 - 12:00", "401ȣ", "2020-11-11 ~ 2020-12-11"));
		stuList.add(new Class("�������� ITQ�ڰ���(�ѱ�/����/PPT) ���", "��ö��", "ȭ,�� / 09:30 - 11:00", "503ȣ", "2020-12-21 ~ 2021-01-10"));
	}
}