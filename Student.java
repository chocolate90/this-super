package this_.basic;

public class Student extends Person {

	
	String studentId;
	
	// 이름 나이 학번을 전달 받아서 초기화 하는 생성자 this 키워드를 사용
	
	Student(String name, int age, String studentId) {
		this.name = name;
		this.age = age;
		this.studentId = studentId;
	}
	
	
	String info() {
		return "이름: " + name + " 나이: " + age + " 학번:" + studentId;
	}
}
