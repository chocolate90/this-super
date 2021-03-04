package this_.basic;

public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person("홍길동", 20);
		
		Person p2 = new Person("홍길동");
		
		Person p3 = new Person();
		
		System.out.println(p.info());
		System.out.println(p2.info());
		System.out.println(p3.info());
		
		Student s = new Student("홍길자", 22, "02");
		
		System.out.println(s.info());
		
		Teacher t = new Teacher("아이유", 27, "음악");
		
		System.out.println(t.info());
		
		Employee e = new Employee("유인나", 34, "IT");
		
		System.out.println(e.info());
				
	}
}
