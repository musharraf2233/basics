package day2;

public class employee {
	int empId;
	String empName;
	void method(int id,String name) {
		this.empId=id;
		this.empName=name;
		System.out.println("ID="+id+" "+"NAME="+name);
		
	}

}
class company{
	public static void main(String[] args) {
	employee emp1=new employee();
	employee emp2=new employee();
	emp1.method(1,"musharraf");
	emp2.method(2, "gafoor");
	}
	
}
