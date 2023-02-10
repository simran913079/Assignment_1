package Asssignment;

import java.util.Scanner;

public class Question_1 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int a=1,b=2,c=3,d=4;
		int e=1,f=2,g=3,h=4;
		Scanner s1 =new Scanner(System.in);
		System.out.println("Enter a Student Roll No : ");
		int roll=s1.nextInt();
		if(e==roll) 
		{
			System.out.println("You are in Sapphire team");
		}
		else if(f==roll)
		{
			System.out.println("You are Pearl !");
		}
		else if(g==roll)
		{
			System.out.println("You are Ruby !");
		}
		else if(h==roll) 
		{
			System.out.println("You are Emerald !");
		}
		if(roll<=25) 
		{
			while(a<=25)
			{
				a=a+4;
				if(a==roll) 
				{
					
					System.out.println("You are in Sapphire Team");
				}	
			}
			while(b<=25) 
			{
				b=b+4;
				if(b==roll )
				{
					System.out.println("You are in Pearl Team");
				}
			}
			while(c<=25) 
			{
				c=c+4;
				if(c==roll)
				{
					System.out.println("You are in Ruby Team");
				}
			}
			while(d<=25) 
			{
				d=d+4;
				if(d==roll)
				{
					
					System.out.println("You are in Emerald Team");
				}
			}
			
		}

	}

}
