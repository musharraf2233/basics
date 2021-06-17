package day2;

import java.text.NumberFormat;
import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	float currentSalary;
	float raise = 0.0f;
	float newSalary=0.0f;
	String rating;
	System.out.println("Enter the current salary:");
	currentSalary=sc.nextFloat();
	System.out.println("Enter the perfome rating(Excelent,Good,Poor)");
	rating=sc.next();
	if (rating.equalsIgnoreCase("excelent")) {
		raise=(6f/currentSalary)*100;
		newSalary=currentSalary+raise;
	}
	else
		if(rating.equalsIgnoreCase("good")) {
			raise=(4f/currentSalary)*100;
			newSalary=currentSalary+raise;
		}
		else
			if(rating.equalsIgnoreCase("poor")) {
				raise=(1.5f/currentSalary)*100;
				newSalary=currentSalary+raise;
			}
	NumberFormat money=NumberFormat.getCurrencyInstance();
	System.out.println("current salary:"+money.format(currentSalary));
	System.out.println("amount of your raise:"+money.format(raise));
	System.out.println("your new salary:"+money.format(newSalary));
	}
}
