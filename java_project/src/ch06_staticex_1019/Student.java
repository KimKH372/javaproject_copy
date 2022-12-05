package ch06_staticex_1019;

import ch05_test_1202.Person;

public class Student {
	
	// static이라는 키워드를 사용해서, 전역 변수로 사용, 정적 변수, 다르게 표현하면 리소스라고 함
	public static int serialNum = 1000;
	// 인스턴스 변수 -> 객체를 생성해서 접근 (none static 변수)
	int studentID;
	String studentName;
	int grade;
	String address;
	
	// 해당 메서들의 리턴 타입이 String
	// 활용한다면
	// ex) String kkh = new Student();
	// ex) String s1 = kkh.getStudentName();
	
	public String getStudentName(){
		return studentName;
	}
	
	// 활용?
		// Person p1 = getPersonInfo();
		// Person p2 = new Person();
		public Person getPersonInfo() {
			return new Person();
		}
	
	public void setStudentName(String name){
		studentName = name;
	}

	public static int getSerialNum() {
		int i = 10;
	//	studentName = "aaa";
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
}
