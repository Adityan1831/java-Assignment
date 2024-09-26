package assignment_26;

import java.util.Scanner;

public class Assignment1 {

Scanner sc = new Scanner (System.in);
private int age;
private double sal;
void get() {
	System.out.println("Enter age  = " );
	age= sc.nextInt();
	System.out.println("enter sal = ");
	sal=sc.nextDouble();
}
void check() {
	if(((age>18)&&(age<=60))&&(sal<25000))
	System.out.println("Eligible for loan");

 else {
	System.out.println("Not Eligible for loan");
}
}
}