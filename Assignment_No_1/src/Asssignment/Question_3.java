package Asssignment;

import java.util.Scanner;

public class Question_3
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int k1,k2,k3;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter 3 angles");
			k1 = sc.nextInt();
			k2 = sc.nextInt();
			k3= sc.nextInt();
		}
		if((k1+k2+k3) == 180)
		{
		if(k1 == k2 && k2 == k3 && k1 == k3)
		 {
		System.out.println("Prize 3");
		}
		else if(k1 == 90 || k2 ==90 || k3 == 90) 
		{
		System.out.println("Prize 2");
		}
		else 
		{
			System.out.println("Prize 1");
		}
		}
		else
		{
		System.out.println("No prize");
		}
	}

}
