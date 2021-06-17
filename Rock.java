package day2;

import java.util.Random;
import java.util.Scanner;

class Rock {

	public static void main(String[] args) {
		String personPlay;;
		String computersPlay = null;
		Scanner sc=new Scanner(System.in);
		Random generator=new Random();
		System.out.print("Enter the play:");
		personPlay=sc.next().toUpperCase();
		System.out.println("person play with:"+personPlay);
		int computerInt=generator.nextInt(3);
		switch(computerInt) {
		case 0:
			computersPlay="ROCK";
			
			break;
		case 1:
			computersPlay="PAPER";
			
			break;
		case 2:
			computersPlay="SCISSOR";
			
			break;
		}
		System.out.println("computer play with:"+computersPlay);
		if(personPlay.equalsIgnoreCase(computersPlay)) {
			System.out.println("it is tie..!");
		}
		else 
			if(personPlay.equalsIgnoreCase("rock")) {
		    if(computersPlay.equalsIgnoreCase("scissor"))
				System.out.println("rock crushed scissor");
				System.out.println("!!!..ROCK WIN..!!!");
			}
		else 
				if(personPlay.equalsIgnoreCase("scissor")) {
				if (computersPlay.equalsIgnoreCase("rock")) 
					System.out.println("rock crushed scissor");
					System.out.println("!!!..ROCK WIN..!!!");
				}
		else 
				if(personPlay.equalsIgnoreCase("paper")) {
				if(computersPlay.equalsIgnoreCase("rock")) 
					System.out.println("paper covers rock");
					System.out.println("!!!..PAPER WIN..!!!");
				}
		else
				if(personPlay.equalsIgnoreCase("rock")) {
				if(computersPlay.equalsIgnoreCase("paper"))
							System.out.println("paper covers rock");
							System.out.println("!!!..PAPER WIN..!!!");
						}
		else
			if(personPlay.equalsIgnoreCase("scissor")) {
			if(computersPlay.equalsIgnoreCase("paper"))
					System.out.println("scissor cuts paper");
					System.out.println("!!!..SCISSOR WIN..!!!");
				}
		else 
			if(personPlay.equalsIgnoreCase("paper")) {
			if(computersPlay.equalsIgnoreCase("scissor"))
					System.out.println("scissor cuts paper");
					System.out.println("!!!..SCISSOR WIN..!!!");
			}
		else 
		if(personPlay.equalsIgnoreCase("rock")) {
		if(computersPlay.equalsIgnoreCase("scissor"))
				System.out.println("rock break scissor");
				System.out.println("!!!..ROCK WIN..!!!");

}
}
}