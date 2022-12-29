package nag;
import java.util.Scanner;
public class sample {
public static void main(String[] args)
{
System.out.println("Enter a number");
Scanner input = new Scanner(System.in);
int n = input.nextInt();
int sum = 0;
while (n > 0)
{
sum = sum + n % 10;
n = n/10;
}
System.out.println("The digit sum is: " + sum);
}
}


/////////////////////////////////////////////////////////////

import java.util.Scanner;

public class DigitSum 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number to find digitsum : ");
		int num=in.nextInt();
		int sum=num;
		int fin=0;
		int fin1=0;
		String temp=Integer.toString(num);
		int len=temp.length();
			for(int i=0;i<len;i++)
			{
				System.out.println("1 : " +sum%10);
				fin=fin+sum%10;
				if(Integer.toString(fin).length()!=1)
				{
					for(int j=0;j<=Integer.toString(fin).length();j++)
					{
						System.out.println("2 : " +fin%10);
						fin1=fin1+fin%10;
						fin=fin/10;
					}
					fin=fin1;
				}
				sum=sum/10;
			}
		System.out.println("3 : " +fin);
	}
}
