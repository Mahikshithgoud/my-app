package day3;

import java.util.Scanner;

public class prog3 {

	public static void main(String[] args) {
	int count=0;	// TODO Auto-generated method stub
Scanner a=new Scanner(System.in);
System.out.println("enter any digit");
int n=a.nextInt();
for(int i=2;i<=n;i++)
{
	if(n%i==0) count++; }
if(count==1)
		System.out.println("it is not a prime number");
	else 
		System.out.println("it is a prime number");
	

	}

}
