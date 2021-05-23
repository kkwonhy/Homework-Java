package homework;

public class UpcastingEX {

	public static void main(String[] args) {
		Person p;
		Student s = new Student("홍길동");
		p = s;

		System.out.println(p.name);
		((Student) p).grade = "A"; // 컴파일 오류
		((Student) p).dept = "Com"; // 컴파일 오류
	}
}
