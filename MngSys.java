package Project;

import java.util.*;

public class MngSys {
	Scanner s = new Scanner(System.in);

////////////////////////////////////////////////////////////////////////////////////
//--------------------------------------------------------------------기존 수강생
	ArrayList<Student> stu = new ArrayList<Student>();

	public void currentStudent() {
		stu.add(new Student("김말이", "여", "961014", "010-1111-1111", "취성패", 02, 80));
		stu.add(new Student("배나무", "여", "980919", "010-2222-2222", "일반", 01, 90));
		stu.add(new Student("남도산", "남", "920112", "010-3333-3333", "취성패", 01, 0));
		stu.add(new Student("서달미", "여", "921010", "010-4444-4444", "일반", 03, 75));
		stu.add(new Student("한지평", "남", "860405", "010-5555-5555", "일반", 04, 40));
		stu.add(new Student("원인재", "여", "890630", "010-6666-6666", "일반", 03, 97));
		stu.add(new Student("이철산", "남", "930228", "010-7777-7777", "일반", 02, 50));
		stu.add(new Student("김용산", "남", "940806", "010-8888-8888", "취성패", 02, 0));
		stu.add(new Student("정사하", "여", "931225", "010-9999-9999", "취성패", 04, 0));
		stu.add(new Student("천서진", "여", "970721", "010-1010-1010", "일반", 01, 85));
		stu.add(new Student("주단태", "남", "980106", "010-1111-1010", "취성패", 03, 0));
		stu.add(new Student("이규진", "남", "000514", "010-1212-1212", "취성패", 04, 0));
	}

///////////////////////////////////////////////////////////////////////////////////////////////
//-------------------------------------------------------------------------1-1-1전체수강생조회
	public void printStu() {

		System.out.println("---------------------------------------------------------");

		for (int i = 0; i < stu.size(); i++) {
			System.out.print(stu.get(i).name + "/" + stu.get(i).gender + "/" + stu.get(i).birth + "/" + stu.get(i).phnum
					+ "/" + stu.get(i).type + "/");

			switch (stu.get(i).lecture) {
			case 01:
				System.out.println("풀스택 개발자 양성과정");
				break;
			case 02:
				System.out.println("출판디자인(디지털퍼블리싱)");
				break;
			case 03:
				System.out.println("환경(인테리어) 3D디자인");
				break;
			case 04:
				System.out.println("AutoCAD 투상법");
				break;
			}
		}

		System.out.println("---------------------------------------------------------");

	}

////////////////////////////////////////////////////////////////////////////////////////
//---------------------------------------------------------------------------1-1-2개인 조회
	public void searchPer() {
		int count = 0;
		System.out.println("조회할 수강생의 이름을 입력해 주세요.");
		System.out.print(">> ");
		String searchStr = s.next();
		System.out.println("---------------------------------------------------------");
		for (int i = 0; i < stu.size(); i++) {
			if (stu.get(i).name.equals(searchStr)) {
				prnPer(i);
				count++;
			}

		}
		if (count == 0)
			System.out.println("[system]해당 수강생은 존재하지 않습니다.");
		System.out.println("---------------------------------------------------------");

		prnMenu();
		System.out.print(">> ");
		int num = s.nextInt();

		if (num == 1)
			searchPer();
		else
			upper02(num);

		System.out.println();

	}

/////////////////////////////////////////////////////////////////////////////////////////
//--------------------------------------------------------------------------1-1-2 개인조회
	public void prnPer(int i) {
		System.out.print(stu.get(i).name + "/" + stu.get(i).gender + "/" + stu.get(i).birth + "/" + stu.get(i).phnum
				+ "/" + stu.get(i).type + "/");

		switch (stu.get(i).lecture) {
		case 01:
			System.out.println("풀스택 개발자 양성과정");
			break;
		case 02:
			System.out.println("출판디자인(디지털퍼블리싱)");
			break;
		case 03:
			System.out.println("환경(인테리어) 3D디자인");
			break;
		case 04:
			System.out.println("AutoCAD 투상법");
			break;
		}

	}

///////////////////////////////////////////////////////////////////////////////////////////////
//------------------------------------------------------------------------1-1-3 수강유형별
	public void printType() {
		int count = 0;
		System.out.println("조회할 수강 유형을 입력해 주세요.(일반/취성패)");
		System.out.print(">> ");
		String searchStr = s.next();

		System.out.println("---------------------------------------------------------");
		for (int i = 0; i < stu.size(); i++) {
			if (stu.get(i).type.equals(searchStr)) {
				prnPer(i);
				count++;
			}
		}
		if (count == 0)
			System.out.println("[system]" + searchStr + " 유형은 존재하지 않습니다.");

		System.out.println("---------------------------------------------------------");

		prnMenu();
		System.out.print(">> ");
		int num = s.nextInt();

		if (num == 1)
			printType();
		else
			upper02(num);

		System.out.println();

	}

////////////////////////////////////////////////////////////////////////////////////////
//-----------------------------------------------------1-1-4 강좌별
	public void printLec() {
		int count = 0;
		System.out.println("조회할 강좌코드를 입력해 주세요.");
		System.out.println("----------------------------");
		lectureMenu();
		System.out.println("----------------------------");
		System.out.print(">> ");
		int searchInt = s.nextInt();
		
		if (searchInt < 1 || searchInt > 4) {
			System.out.println("[system]존재하지 않는 강좌코드입니다.");
			printLec();
		}

		System.out.println("---------------------------------------------------------");

		for (int i = 0; i < stu.size(); i++) {
			if (stu.get(i).lecture == searchInt) {
				prnPer(i);
				count++;
			}
		}
		if (count == 0)
			System.out.println("[system]해당 강좌를 수강 중인 수강생은 없습니다.");

		System.out.println("---------------------------------------------------------");
		
		prnMenu();
		System.out.print(">> ");
		int num = s.nextInt();

		if (num == 1)
			printLec();
		else
			upper02(num);

		System.out.println();

	}

////////////////////////////////////////////////////////////////////////////////////////
//-----------------------------------------------------1-1-4 강좌별

	public void printLec02(int num) {
		int count = 0;
		int searchInt = num;

		System.out.println("---------------------------------------------------------");

		for (int i = 0; i < stu.size(); i++) {
			if (stu.get(i).lecture == searchInt) {
				prnPer(i);
				count++;
			}
		}
		if (count == 0)
			System.out.println("[system]해당 강좌를 수강 중인 수강생은 없습니다.");

		System.out.println("---------------------------------------------------------");

	}
	
	
////////////////////////////////////////////////////////////////////////////////////////////////////
//---------------------------------------------------------------------------1-1-5 성적조회
	public void searchScore02() {
		char pass;
		int count = 0;

		System.out.println("성적을 조회할 수강생의 이름을 입력하세요.");
		System.out.print(">> ");
		String name = s.next();

		for (int i = 0; i < stu.size(); i++) {
			if (stu.get(i).score > 70) {
				pass = 'O';
			} else {
				pass = 'X';
			}

			if (name.equals(stu.get(i).name)) {
				count++;
				if (stu.get(i).score == 0) {
					System.out.println(name + " 수강생의 성적은 현재 '미입력'상태입니다.");
					System.out.print("성적을 입력하시겠습니까?(Y/N) ");
					char ans = s.next().charAt(0);

					if (ans == 'y' || ans == 'Y') {
						System.out.println("---------------------");
						insertScore02(name);
						researchMenu02(); return;
					} else if (ans == 'n' || ans == 'N') {
						researchMenu02(); return;
					} else {
						System.out.println("잘못 입력하셨습니다.");
						researchMenu02(); return;
					}

				} else {
					System.out.println("------------------------------------");
					System.out.println("이름 : " + stu.get(i).name);

					switch (stu.get(i).lecture) {
					case 01:
						System.out.println("수강중인 강좌 : 풀스택 개발자 양성과정");
						break;
					case 02:
						System.out.println("수강중인 강좌 : 출판디자인(디지털퍼블리싱)");
						break;
					case 03:
						System.out.println("수강중인 강좌 : 환경(인테리어) 3D디자인");
						break;
					case 04:
						System.out.println("수강중인 강좌 : AutoCAD 투상법");
						break;
					}

					System.out.println("점수 : " + stu.get(i).score);
					System.out.println("수료가능여부 : " + pass);
					System.out.println("------------------------------------");
				}
			}
		}

		if (count == 0)
			System.out.println("[system]" + name + "(와)과 일치하는 수강생이 없습니다.");
		
		researchMenu02(); 
		
	}

///////////////////////////////////////////////////////////////////////////////////////
//--------------------------------------------------강좌별 조회 마무리 1
	public void endLec() {
		prnMenu();
		System.out.print(">> ");
		int num = s.nextInt();

		if (num == 1)
			printLec();
		else
			upper02(num);

		System.out.println();
	}

//////////////////////////////////////////////////////////////////////////////////////////////////
//------------------------------------------------------------------------1-1 수강생조회 마무리
	public void prnMenu() {
		System.out.println("---------------");
		System.out.println("[1] 추가조회");
		System.out.println("[2] 상위메뉴");
		System.out.println("[0] 종료");
		System.out.println("---------------");

	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////
//----------------------------------------------------------------------------1-1 수강생조회 마무리
	public void upper02(int num) {
		switch (num) {
		case 2:
			subsubMenu();
			break;
		case 0:
			System.out.println("[system]프로그램을 종료합니다.");
			System.exit(0);
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			System.out.print(">> ");
			upper02(s.nextInt());
		}
	}

///////////////////////////////////////////////////////////////////////////////////////////////
//-------------------------------------------------------------------------1상위메뉴 
	public void upper01(int num) {
		switch (num) {
		case 2:
			subMenu01();
			break;
		case 0:
			System.out.println("[system]프로그램을 종료합니다.");
			System.exit(0);
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			System.out.print(">> ");
			upper01(s.nextInt());
		}
	}

///////////////////////////////////////////////////////////////////////////////////////////////
//----------------------------------------------------------------------1-2수강생 등록
	public void addStudent() {

		System.out.println("수강생 관리 - 수강생 등록");

		System.out.println("-------------------------------------");

		System.out.print("이름 : ");
		String name = s.next();

		System.out.print("성별(남/여) : ");
		String gender = s.next();

		System.out.print("생년월일(ex:021212) : ");
		String birth = s.next();

		System.out.print("연락처(010-0000-0000) : ");
		String phnum = s.next();

		System.out.print("수강유형(일반/취성패) : ");
		String type = s.next();

		System.out.println("수강강좌(번호선택) : ");
		lectureMenu();
		System.out.print(">> ");
		int lecture = s.nextInt();
		
		if (lecture < 1 || lecture > 4) {
			System.out.println("잘못 입력하셨습니다.");
			System.out.println("수강강좌(번호선택) : ");
			lectureMenu();
			System.out.print(">> ");
			lecture = s.nextInt();
		}

		System.out.print("성적(미입력 처리 '0'입력) : ");
		int score = s.nextInt();

		System.out.println("-------------------------------------");

		stu.add(new Student(name, gender, birth, phnum, type, lecture, score));

		System.out.println("[system]수강생 등록이 완료되었습니다.");
		printStu();

		System.out.println("---------------");
		System.out.println("[1] 추가등록");
		System.out.println("[2] 상위메뉴");
		System.out.println("[0] 종료");
		System.out.println("---------------");

		System.out.print(">> ");
		int num = s.nextInt();

		if (num == 1)
			addStudent();
		else
			upper01(num);

	}

//////////////////////////////////////////////////////////////////////////////////////
//----------------------------------------------------------------1-3 수강생 수정
	public void resetStu() {
		System.out.println("수강생 관리 - 수강생 수정");
		System.out.println("---------------------------");
		System.out.print("수정할 수강생의 이름 : ");
		String setStu = s.next();
		int count = 0;
		for (int i = 0; i < stu.size(); i++) {
			if (stu.get(i).name.equals(setStu)) {
				System.out.println("수정할 항목을 선택해주세요.");
				System.out.println("---------------------------");
				System.out.println("[1]이름");
				System.out.println("[2]성별(남/여)");
				System.out.println("[3]생일(991231)");
				System.out.println("[4]번호(010-1234-5678)");
				System.out.println("[5]수강 유형(일반/취성패)");
				System.out.println("[6]수강강좌");
				System.out.println("---------------------------");
				System.out.print(">> ");
				int setM = s.nextInt();

				if (setM < 1 || setM > 6) {
					System.out.println("잘못 입력하셨습니다.");
					continue;
				}

				System.out.println("수정할 값을 입력해주세요.");
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
					lectureMenu();
					System.out.print("강의번호 선택>> ");
					stu.get(i).lecture = s.nextInt();
					break;
				}

				System.out.println("[system]수정이 완료되었습니다.");
				count++;
				printStu();
				break;
			}

		}
		if (count == 0)
			System.out.println("[system]" + setStu + "(와)과 일치하는 수강생이 없습니다.");

		System.out.println("---------------");
		System.out.println("[1] 추가수정");
		System.out.println("[2] 상위메뉴");
		System.out.println("[0] 종료");
		System.out.println("---------------");

		System.out.print(">> ");
		int num = s.nextInt();

		if (num == 1)
			resetStu();
		else
			upper01(num);

	}

///////////////////////////////////////////////////////////////////////////////////////////////
//-------------------------------------------------------------------------1-4 수강생삭제
	public void removeStu() {
		System.out.println("수강생 관리 - 수강생 삭제");
		printStu();
		System.out.print("삭제할 수강생의 이름을 입력해주세요>> ");
		String remStu = s.next();
		int count = 0;

		for (int i = 0; i < stu.size(); i++) {
			if (stu.get(i).name.equals(remStu)) {
				stu.remove(i);
				count++;
			}
		}
		if (count == 0)
			System.out.println("[system]" + remStu + "(와)과 일치하는 수강생이 없습니다.");
		else
			System.out.println("\n[system]삭제가 완료되었습니다.");

		printStu();

		System.out.println("---------------");
		System.out.println("[1] 추가삭제");
		System.out.println("[2] 상위메뉴");
		System.out.println("[0] 종료");
		System.out.println("---------------");

		System.out.print(">> ");
		int num = s.nextInt();

		if (num == 1)
			removeStu();
		else
			upper01(num);
	}

////////////////////////////////////////////////////////////////////////////////////////////////////
//---------------------------------------------------------------------------1-5-1 성적입력
	public void insertScore() {
		int count = 0;
		
		System.out.println("수강생 관리 - 성적관리 - 성적 입력");
		System.out.println("---------------------------");
		System.out.print("성적을 입력할 수강생의 이름 : ");
		String setStu = s.next();

		for (int i = 0; i < stu.size(); i++) {
			if (stu.get(i).name.equals(setStu)) {
				count++;
				
				System.out.println(setStu + "의 성적을 입력해주세요.");
				System.out.print(">> ");

				stu.get(i).score = s.nextInt();
				System.out.println("[system]성적 입력이 완료되었습니다.");
				break;
			}
		}
		
		if (count == 0) System.out.println("[system]" + setStu + "(와)과 일치하는 수강생이 없습니다.");
		

		System.out.println("---------------");
		System.out.println("[1] 추가입력");
		System.out.println("[2] 상위메뉴");
		System.out.println("[0] 종료");
		System.out.println("---------------");

		System.out.print(">> ");
		int num = s.nextInt();

		switch (num) {
		case 1: insertScore(); break;
		case 2: subsubMenu02(); break;
		case 0:
			System.out.println("[system]프로그램을 종료합니다.");
			System.exit(0); break;
		}
	}

////////////////////////////////////////////////////////////////////////////////////////////////////
//---------------------------------------------------------------------------1-5-1 성적입력
	public void insertScore02(String name) {
		String setStu = name;

		for (int i = 0; i < stu.size(); i++) {
			if (stu.get(i).name.equals(setStu)) {
				System.out.println(setStu + "의 성적을 입력해주세요.");
				System.out.print(">> ");

				stu.get(i).score = s.nextInt();
				System.out.println("[system]성적 입력이 완료되었습니다.");
				break;
			}
		}


	}

////////////////////////////////////////////////////////////////////////////////////////////////////
//---------------------------------------------------------------------------1-5-2 성적조회
	public void searchScore() {
		char pass;
		int count = 0;

		System.out.println("성적을 조회할 수강생의 이름을 입력하세요.");
		System.out.print(">> ");
		String name = s.next();

		for (int i = 0; i < stu.size(); i++) {
			if (stu.get(i).score > 70) {
				pass = 'O';
			} else {
				pass = 'X';
			}

			if (name.equals(stu.get(i).name)) {
				count++;
				if (stu.get(i).score == 0) {
					System.out.println(name + " 수강생의 성적은 현재 '미입력'상태입니다.");
					System.out.print("성적을 입력하시겠습니까?(Y/N) ");
					char ans = s.next().charAt(0);

					if (ans == 'y' || ans == 'Y') {
						System.out.println("---------------------");
						insertScore02(name); 
						researchMenu(); return;
					} else if (ans == 'n' || ans == 'N') {
						researchMenu(); return;
					} else {
						System.out.println("잘못 입력하셨습니다.");
						researchMenu(); return;
					}

				} else {
					System.out.println("------------------------------------");
					System.out.println("이름 : " + stu.get(i).name);

					switch (stu.get(i).lecture) {
					case 01:
						System.out.println("수강중인 강좌 : 풀스택 개발자 양성과정");
						break;
					case 02:
						System.out.println("수강중인 강좌 : 출판디자인(디지털퍼블리싱)");
						break;
					case 03:
						System.out.println("수강중인 강좌 : 환경(인테리어) 3D디자인");
						break;
					case 04:
						System.out.println("수강중인 강좌 : AutoCAD 투상법");
						break;
					}

					System.out.println("점수 : " + stu.get(i).score);
					System.out.println("수료가능여부 : " + pass);
					System.out.println("------------------------------------");
				}
			}
		}
		
		if (count == 0) System.out.println("[system]" + name + "(와)과 일치하는 수강생이 없습니다.");
		researchMenu();
	}

//////////////////////////////////////////////////////////////////////////////////////////
//-------------------------------------------------------------------------------성적조회 마무리
	public void researchMenu() {
		System.out.println("---------------");
		System.out.println("[1] 추가조회");
		System.out.println("[2] 상위메뉴");
		System.out.println("[0] 종료");
		System.out.println("---------------");

		System.out.print(">> ");
		int num = s.nextInt();

		if (num == 1)
			searchScore();
		else
			upper01(num);
	}
	
//////////////////////////////////////////////////////////////////////////////////////////
//-------------------------------------------------------------------------------1-1-5 성적조회 마무리
	public void researchMenu02() {
		System.out.println("---------------");
		System.out.println("[1] 추가조회");
		System.out.println("[2] 상위메뉴");
		System.out.println("[0] 종료");
		System.out.println("---------------");

		System.out.print(">> ");
		int num = s.nextInt();

		if (num == 1)
			searchScore02();
		else
			upper02(num);
	}


////////////////////////////////////////////////////////////////////////////////////
//------------------------------------------------------------------강의 목록(강의 추가시 여기로)

	ArrayList<Class> lecture = new ArrayList<Class>();

	public void classList() {
		lecture.add(new Class("풀스택 개발자 양성과정", "이춘희, 박미", "월-금 / 09:20 - 18:00", "302호", "2020-10-15 ~ 2021-03-11"));
		lecture.add(new Class("출판디자인(디지털퍼블리싱)", "김철수", "월-금 / 10:00 - 14:00", "501호", "2020-12-01 ~ 2021-01-31"));
		lecture.add(new Class("환경(인테리어) 3D디자인", "박철수", "월,수,금 / 13:10 - 17:00", "303호", "2020-11-04 ~ 2021-12-24"));
		lecture.add(new Class("AutoCAD 투상법", "장철수", "화,목,토 / 11:10 - 16:00", "502호", "2020-10-14 ~ 2021-11-30"));
	}

///////////////////////////////////////////////////////////////////////////////////////////
//----------------------------------------------------------------2-n 강의 세부사항 출력
	public void printClass(int num) {
		System.out.println("개설강좌 조회 - 상세조회");
		System.out.println("-------------------------------------");
		System.out.println("강의명 : " + lecture.get(num - 1).name);
		System.out.println("담당강사 : " + lecture.get(num - 1).professor);
		System.out.println("시간표 : " + lecture.get(num - 1).time);
		System.out.println("강의실 : " + lecture.get(num - 1).classroom);
		System.out.println("기간 : " + lecture.get(num - 1).date);
		System.out.println("-------------------------------------");
		System.out.println("[1] 수강생 명단 조회");
		System.out.println("[2] 다른 강좌 조회");
		System.out.println("[3] 상위메뉴");
		System.out.println("[0] 종료");
		System.out.println("-------------------------------------");
		System.out.print(">> ");
		int pcNum = s.nextInt();

		System.out.println();
		switch (pcNum) {
		case 1:
			printLec02(num);
			upperOrOthers();
			break;
		case 2:
			subMenu02();
			break;
		case 3:
			start();
			break;
		case 0:
			System.out.println("[system]프로그램을 종료합니다.");
			System.exit(0);
			break;
		default : 
			System.out.println("[system]잘못 입력하셨습니다.");
			System.out.println(); start(); break;
		}

	}

	
///////////////////////////////////////////////////////////////////////////////////////////
//----------------------------------------------------------------2-n-1 수강생 명단 조회 마무리 메뉴
	public void upperOrOthers() {
		System.out.println("---------------");
		System.out.println("[1] 다른 강좌 조회");
		System.out.println("[2] 상위메뉴");
		System.out.println("[0] 종료");
		System.out.println("---------------");
		
		System.out.print(">> ");
		int num = s.nextInt();

		System.out.println();
		
		switch (num) {
		case 1:
			subMenu02(); break;
		case 2:
			start(); break;
		case 0:
			System.out.println("[system]프로그램을 종료합니다.");
			System.exit(0); break;
		default:
			System.out.println("[system]잘못 입력하셨습니다.");
			upperOrOthers(); break;
		}
	}

//--------------------------------------------------------------------------메뉴메뉴

////////////////////////////////////////////////////////////////////////////////////
//--------------------------------------------------------------------상위메뉴, 종료
	public void upperORexit() {
		System.out.println("---------------");
		System.out.println("[1] 상위메뉴");
		System.out.println("[0] 종료");
		System.out.println("---------------");

	}


////////////////////////////////////////////////////////////////////////////////////
//--------------------------------------------------------------------등록, 수정 삭제 상위메뉴, 종료

	public void upperORexit01() {
		System.out.print(">> ");
		int num = s.nextInt();

		switch (num) {
		case 1:
			subMenu01();
			break;
		case 0:
			System.out.println("[system]프로그램을 종료합니다.");
			System.exit(0);
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			upperORexit01();
		}
	}

////////////////////////////////////////////////////////////////////////////////////
//--------------------------------------------------------------------조회 상위메뉴, 종료
	public void upperORexit02() {
		System.out.print(">> ");
		int num = s.nextInt();

		switch (num) {
		case 1:
			subsubMenu();
			break;
		case 0:
			System.out.println("[system]프로그램을 종료합니다.");
			System.exit(0);
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			upperORexit02();
		}

	}

////////////////////////////////////////////////////////////////////////////////////
//--------------------------------------------------------------------성적 상위메뉴, 종료
	public void upperORexit03() {
		System.out.print(">> ");
		int num = s.nextInt();

		switch (num) {
		case 1:
			subsubMenu02();
			break;
		case 0:
			System.out.println("[system]프로그램을 종료합니다.");
			System.exit(0);
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			upperORexit03();
		}

	}

///////////////////////////////////////////////////////////////////////////////////
//-----------------------------------------------------------2번 클릭시 나타나는 개설강좌목록
	public void lectureMenu() {
		System.out.println("[1] 풀스택 개발자 양성과정");
		System.out.println("[2] 출판디자인(디지털퍼블리싱)");
		System.out.println("[3] 환경(인테리어) 3D디자인");
		System.out.println("[4] AutoCAD 투상법");
	}

//////////////////////////////////////////////////////////////////////////////
//--------------------------------------------------------------메뉴시작
	public void start() {//////////////////////// 시작

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
				System.out.println("[system]잘못 입력하셨습니다.");
				System.out.println();
				continue;
			}

			System.out.println();

			switch (menuNum) {
			case 0:
				System.out.println("[system]프로그램을 종료합니다.");
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

//////////////////////////////////////////////////////////////////////////////
//-------------------------------------------------------------1번 수강생 관리

	public void subMenu01() {// 수강생 관리 메뉴
		System.out.println("수강생 관리");
		System.out.println("---------------");
		System.out.println("[1] 수강생 조회");/////////// 조회
		System.out.println("[2] 수강생 등록");// 관리1
		System.out.println("[3] 수강생 수정");// 관리2
		System.out.println("[4] 수강생 삭제");// 관리3
		System.out.println("[5] 성적관리");
		System.out.println("[0] 상위메뉴");
		System.out.println("----------------");
		System.out.print(">> ");
		int subNum = s.nextInt();

		if (subNum < 0 || subNum > 5) {
			System.out.println("[system]잘못 입력하셨습니다.");
			System.out.println();
			subMenu01();
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

//////////////////////////////////////////////////////////////////////////////
//--------------------------------------------------------------1-1 수강생조회

	public void subsubMenu() {
		System.out.println("수강생 관리 - 수강생 조회");
		System.out.println("---------------");
		System.out.println("[1] 전체 수강생 조회");
		System.out.println("[2] 개인 수강생 조회");
		System.out.println("[3] 수강 유형별 조회");
		System.out.println("[4] 강좌별 조회");
		System.out.println("[5] 성적 조회");
		System.out.println("[0] 상위메뉴");
		System.out.println("----------------");
		System.out.print(">> ");
		int subsubNum = s.nextInt();

		if (subsubNum < 0 || subsubNum > 5) {
			System.out.println("[system]잘못 입력하셨습니다.");
			System.out.print(">> ");
			subsubNum = s.nextInt();
		}

		System.out.println();
		switch (subsubNum) {
		case 1:
			System.out.println("수강생 관리 - 수강생 조회 - 전체 수강생 조회");
			System.out.println("---------------------------------------------------------");
			System.out.println("총 수강생 수 : " + stu.size() + "명");
			printStu();
			upperORexit();
			upperORexit02();
			break;
		case 2:
			searchPer();
			break;
		case 3:
			printType();
			break;
		case 4:
			printLec();
			break;
		case 5:
			searchScore02();
//			researchMenu02();
			break;
		case 0:
			subMenu01();
			break;
		}
	}

//////////////////////////////////////////////////////////////////////////////
//--------------------------------------------------------------1-5 성적관리
	public void subsubMenu02() {
		System.out.println("수강생 관리 - 성적관리");
		System.out.println("---------------");
		System.out.println("[1] 성적 입력");
		System.out.println("[2] 성적 조회");
		System.out.println("[0] 상위메뉴");
		System.out.println("----------------");
		System.out.print(">> ");
		int subsubNum02 = s.nextInt();

		if (subsubNum02 < 0 || subsubNum02 > 2) {
			System.out.println("[system]잘못 입력하셨습니다.");
			System.out.println();
			subsubMenu02();
		}

		System.out.println();
		switch (subsubNum02) {
		case 1:
			insertScore();
			upperORexit();
			upperORexit03();
			break;
		case 2:
			searchScore();
//			researchMenu();
			break;
		case 0:
			subMenu01();
			break;
		}
	}

//////////////////////////////////////////////////////////////////////////////
//-------------------------------------------------------------- 2 개설강좌목록

	public void subMenu02() {
		System.out.println("상세 강좌 정보 보기(강좌코드 입력)");
		System.out.println("-------------------------------------");
		lectureMenu();
		System.out.println("-------------------------------------");
		System.out.print(">> ");
		int subNum2 = s.nextInt();

		if (subNum2 < 0 || subNum2 > 4) {
			System.out.println("[system]잘못 입력하셨습니다.");
			System.out.println();
			subMenu02();
		}

		System.out.println();
		if (subNum2 == 0) {
			start();
		}

		if (subNum2 >= 1 && subNum2 <= 4) {
			classList();
			printClass(subNum2);
		}

	}
}
