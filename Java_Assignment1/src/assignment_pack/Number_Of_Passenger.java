package assignment_pack;

import java.util.Scanner;

public class Number_Of_Passenger {
	public static void main(String[] args)
	{ 
		int p=0,totalPass=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row.:");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++)
		{
			System.out.println("Enter the total passenger in row" + i +":");
			p=sc.nextInt();
			totalPass +=p;
		}
		System.out.println("Total No of Row is" + row + "and total No of Passenger is " + totalPass);
	}
}
