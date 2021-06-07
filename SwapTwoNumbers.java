package basic;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=120, second=220;
		System.out.println("--before swapping--");
		System.out.println("first number is="+first);
		System.out.println("second number is="+second);
		float temporary=first;
		first=second;
		second=(int) temporary;
		System.out.println("--after swapping--");
		System.out.println("first number is="+first);
		System.out.println("second number is="+second);
		

	}

}
