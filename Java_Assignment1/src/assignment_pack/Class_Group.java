package assignment_pack;

import java.util.Scanner;

public class Class_Group {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the RollNo.:");
		int roll=sc.nextInt();
		if(roll%2==0)
		{
			if(roll%4==0)
				System.out.println("Emerald Group");
			else
				System.out.println("Perl Group");
		}
			
		else 
			{
				if(roll%4==3 )
					System.out.println("Rubby Group");
				else if(roll==1 || roll%4==1)
					System.out.println("Sapphire Group");
			}
		
}
}
