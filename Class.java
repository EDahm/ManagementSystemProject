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

		stuList.add(new Class("풀스택 개발자 양성과정", "이춘희", "월 ~ 금 / 09:20 - 17:00", "302호", "2020-10-15 ~ 2021-03-11"));
		stuList.add(new Class("출판디자인(디지털퍼블리싱)", "이철수", "월 ~ 금 / 09:30 - 13:00", "501호", "2020-11-09 ~ 2020-12-31"));
		stuList.add(new Class("환경(인테리어) 3D디자인", "삼철수", "월 ~ 금 / 10:00 - 15:00", "502호", "2020-12-01 ~ 2021-02-11"));
		stuList.add(new Class("AutoCAD 투상법", "사철수", "월 ~ 금 / 11:00 - 17:00", "303호", "2020-09-30 ~ 2020-11-30"));
		stuList.add(new Class("사무행정 및 포토샵 활용", "오철수", "월,수,금 / 10:00 - 12:00", "401호", "2020-11-11 ~ 2020-12-11"));
		stuList.add(new Class("국가공인 ITQ자격증(한글/엑셀/PPT) 취득", "육철수", "화,목 / 09:30 - 11:00", "503호", "2020-12-21 ~ 2021-01-10"));
	}
}