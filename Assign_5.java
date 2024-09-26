package Assignment_26;

import java.util.Scanner;

public class Assign_5 {
	
	private String bachelorD;
	private String criminalC;
	
	public void accpet()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("You Have Bachlore's Degree(Yes/No) : ");
		bachelorD=sc.next();
		
		System.out.print("Criminal Case on You : ");
		criminalC=sc.next();
	}
	
	public void display()
	{
		System.out.println("Bachelor's Degree    : "+bachelorD);
		System.out.println("Criminal Case on You : "+criminalC);
	}
	
	public void check()
	{
		if(bachelorDegree.equalsIgnoreCase("yes") && criminalCase.equalsIgnoreCase("no"))
		{
			System.out.println("You Are Eligible for Job");
		}
		else
		{
			System.out.println("You Are Not Eligible for Job");
		}
		
	}

}
