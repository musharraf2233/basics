package day2;

import java.util.Scanner;

final class Ladder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int a=sc.nextInt();
		for (int i = 0; i <a; i++) {
			for (int j = 0; j <= i; j++) 
				System.out.print(j);
			for (int k = 0; k>=1 ; k--)
				System.out.print(k);
			System.out.print("\n");
		}
		

	}

}
