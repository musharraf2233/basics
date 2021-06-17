package day2;
class Student{
	String name,city;
	int age;
	static int m;
	void printData() {
		System.out.println("student name :"+name);
		System.out.println("student city:"+city);
		System.out.println("student age:"+age );
	}
}
public class STest {

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		s1.name="gafoor";
		s1.city="keelakarai";
		s1.age=23;
		s2.name="musharraf";
		s2.city="chennai";
		s2.age=21;
		s2.printData();
		s1.printData();
		s1.m=20;
		s2.m=22;
		Student.m=27;
		System.out.println("s1.m:"+s1.m);
		System.out.println("s2.m:"+s2.m);
		System.out.println("student.m:"+Student.m);

	}

}
