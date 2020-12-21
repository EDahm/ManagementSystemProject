package Project;

import java.util.*;

public class MngSys {
	Scanner s = new Scanner(System.in);

//--------------------------------------------------------------------기존 수강생
	ArrayList<Student> stu = new ArrayList<Student>();

	public void currentStudent() {
		stu.add(new Student("정혜윤", "여", 921014, "010-9874-3867", "취성패", 01, 60));
		stu.add(new Student("황규리", "여", 921014, "010-9874-3867", "취성패", 01, 60));
		stu.add(new Student("차재홍", "여", 921014, "010-9874-3867", "취성패", 01, 60));
		stu.add(new Student("정혜윤", "여", 921014, "010-9874-3867", "취성패", 01, 60));
		stu.add(new Student("정혜윤", "여", 921014, "010-9874-3867", "취성패", 01, 60));
	}

//----------------------------------------------------------------------수강생 추가
	public void addStudent() {

		System.out.print("이름 : ");
		String name = s.next();

		System.out.print("성별(남/여) : ");
		String gender = s.next();

		System.out.print("생년월일(ex:021212) : ");
		int birth = s.nextInt();

		System.out.print("연락처(010-0000-0000) : ");
		String phnum = s.next();

		System.out.print("수강유형(일반/취성패) : ");
		String type = s.next();

		System.out.println("수강강좌(번호선택)");
		System.out.println("[01] 풀스택 개발자 양성과정");
		System.out.println("[02] 출판디자인(디지털퍼블리싱)");
		System.out.println("[03] 환경(인테리어) 3D디자인");
		System.out.println("[04] AutoCAD 투상법");
		System.out.println("[05] 사무행정 및 포토샵 활용");
		System.out.println("[06] 국가공인 ITQ자격증(한글/엑셀/PPT) 취득");
		int lecture = s.nextInt();

		System.out.print("성적 : ");
		int score = s.nextInt();

		stu.add(new Student(name, gender, birth, phnum, type, lecture, score));

	}

//-------------------------------------------------------------------------전체수강생조회
	public void printStu() {

		for (int i = 0; i < stu.size(); i++) {
			System.out.print("학생" + (i + 1) + " : " + stu.get(i).name + "/" + stu.get(i).gender + "/" + stu.get(i).birth
					+ "/" + stu.get(i).phnum + "/" + stu.get(i).type + "/");

			switch (stu.get(i).lecture) {
			case 01:
				System.out.println("풀스택 개발자 양성과정");
				break;
			case 02:
				System.out.println("출판디자인(디지털퍼블리싱)");
				break;
			case 03:
				System.out.println("출판디자인(디지털퍼블리싱)");
				break;
			case 04:
				System.out.println("AutoCAD 투상법");
				break;
			case 05:
				System.out.println("사무행정 및 포토샵 활용");
				break;
			case 06:
				System.out.println("국가공인 ITQ자격증(한글/엑셀/PPT) 취득");
				break;
			}
		}
	}
	
	
	  public void removeStu() {
		  System.out.println("---------------------------------------------------------");
		  printStu();
		  System.out.println("---------------------------------------------------------");
		  System.out.print("삭제할 수강생의 이름을 입력해주세요>>");
	      String remStu = s.next();
	      
	      for (int i = 0; i < stu.size(); i++) {
			if(stu.get(i).name.equals(remStu))
				stu.remove(i);
		}
	      System.out.println("\n[system] 삭제가 완료되었습니다.");
	      printStu();
	      
	   }

	  
	  
////////////////////////////////////////////////////////////////////////////////////
//------------------------------------------------------------------강의 목록
	  
		ArrayList<Class> lecture = new ArrayList<Class>();
		
		public void classList(){
			lecture.add(new Class("풀스택 개발자 양성과정", "이춘희, 박미", "월-금 / 09:20 - 18:00", "302호", "2020-10-15 ~ 2021-03-11"));
			lecture.add(new Class("출판디자인(디지털퍼블리싱)", "김철수", "월-금 / 10:00 - 14:00", "501호", "2020-12-01 ~ 2021-01-31"));
			lecture.add(new Class("환경(인테리어) 3D디자인", "박철수", "월,수,금 / 13:10 - 17:00", "303호", "2020-11-04 ~ 2021-12-24"));
		}
		
		
//----------------------------------------------------------------강의 세부사항
		public void printClass(int num) {
			System.out.println("-------------------------------------");
			System.out.println("강의명 : " + lecture.get(num-1).name);
			System.out.println("담당강사 : " + lecture.get(num-1).professor);
			System.out.println("시간표 : " + lecture.get(num-1).time);
			System.out.println("강의실 : " + lecture.get(num-1).classroom);
			System.out.println("기간 : " + lecture.get(num-1).date);
			System.out.println("-------------------------------------");
			
			System.out.println("[1] 수강생 명단 조회");
			System.out.println("[0] 상위메뉴");
			System.out.println("-------------------------------------");
			System.out.print(">> ");
			int pcNum = s.nextInt();
			
			System.out.println();
			switch (pcNum) {
//			case 1:
//				subsubMenu();
//				break;
			case 0:
				subMenu02();
				break;
			}
			
		}
	  
	  
//--------------------------------------------------------------------------MENU
	  
	  
	public void lectureMenu() {
		System.out.println("[1] 풀스택 개발자 양성과정");
		System.out.println("[2] 출판디자인(디지털퍼블리싱)");
		System.out.println("[3] 환경(인테리어) 3D디자인");
		System.out.println("[4] AutoCAD 투상법");
		System.out.println("[5] 사무행정 및 포토샵 활용");
		System.out.println("[6] 국가공인 ITQ자격증(한글/엑셀/PPT) 취득");
		System.out.println("[0] 상위메뉴");
	}
	
	public void start() {

		while (true) {
			System.out.println("[[MENU]]");
			System.out.println("---------------");
			System.out.println("[1] 수강생 관리");
			System.out.println("[2] 개설강좌 조회");
			System.out.println("[0] 종료");
			System.out.println("----------------");
			System.out.print(">> ");
			int menuNum = s.nextInt();

			if (menuNum < 0 || menuNum > 2) {
				System.out.println("[system] 잘못 입력하셨습니다.");
				System.out.println();
				continue;
			}

			System.out.println();

			switch (menuNum) {
			case 0:
				System.out.println("[system] 프로그램을 종료합니다.");
				System.exit(0);
				break;
			case 1:
				subMenu01();
				break;
			case 2:
				subMenu02();
				break;
			}
		}
	}

	public void subMenu01() {

		while (true) {
			System.out.println("---------------");
			System.out.println("[1] 수강생 조회");
			System.out.println("[2] 수강생 등록");
			System.out.println("[3] 수강생 수정");
			System.out.println("[4] 수강생 삭제");
			System.out.println("[0] 상위메뉴");
			System.out.println("----------------");
			System.out.print(">> ");
			int subNum = s.nextInt();

			if (subNum < 0 || subNum > 4) {
				System.out.println("[system] 잘못 입력하셨습니다.");
				System.out.println();
				continue;
			}

			System.out.println();

			switch (subNum) {
			case 1:
				subsubMenu();
				break;
			case 0:
				start();
				break;
			}
		}
	}

	public void subsubMenu() {
		while (true) {
			System.out.println("---------------");
			System.out.println("[1] 전체 수강생 조회");
			System.out.println("[2] 수강 유형별 조회");
			System.out.println("[3] 강좌별 조회");
			System.out.println("[4] 성적 조회");
			System.out.println("[0] 상위메뉴");
			System.out.println("----------------");
			System.out.print(">> ");
			int subsubNum = s.nextInt();

			if (subsubNum < 0 || subsubNum > 4) {
				System.out.println("[system] 잘못 입력하셨습니다.");
				System.out.println();
				continue;
			}

			System.out.println();
			switch (subsubNum) {
			case 0:
				subMenu01();
				break;
			}
		}
	}

	public void subMenu02() {
		while (true) {
			System.out.println("-------------------------------------");
			lectureMenu();
			System.out.println("-------------------------------------");
			System.out.print(">> ");
			int subNum2 = s.nextInt();

			if (subNum2 < 0 || subNum2 > 6) {
				System.out.println("[system] 잘못 입력하셨습니다.");
				System.out.println();
				continue;
			}

			System.out.println();
			if (subNum2 == 0) {
				start();
				break;
			}
			
			if (subNum2 >= 1 && subNum2 <= 6) {
				classList();
				printClass(subNum2);
			}
			

		}
	}
}
