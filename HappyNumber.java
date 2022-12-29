import java.util.Scanner;
//import java.util.concurrent.Callable;

	interface A
{
	interface B
{
	public int callMe(int sum);
}
}


public class Main implements A
	{
		int fin1=0;
		int sum=0;
		
		public static void main(String[] args)
		{
			Scanner in=new Scanner(System.in);
			System.out.print("Enter the number to be tested as happy or unhappy : ");
			int num=(int)Math.pow(in.nextInt(), 2);
			System.out.println(num);
			Main p=new Main();
			while(num>9)
			{
				System.out.println(p.callMe(num));
				num=p.callMe(num);
			}
			if(num==1)
				System.out.println("Its a happy number : )");
			else
				System.out.println("Its unhappy :(");		
		}
	   public 	int callMe(int sum)
		{
			int fin=0;
			String temp=Integer.toString(sum);
			int len=temp.length();

				for(int i=0;i<len;i++)
				{
					
					System.out.println("1 : " +(int)Math.pow(sum%10,2));
					fin=fin+(int)Math.pow(sum%10,2);
					sum=sum/10;
				}
				sum=fin;
				return sum;
		}
	}


////////////////////////////////////////////////////////////////////////



package nag;
import java.util.Scanner;
public class sample
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number to check if it is a happy number or not:");
int num = sc.nextInt();
if (num <= 0)
{
System.out.println("Please enter a valid number");
return;
}
HappyNumberChecker checker = new HappyNumberChecker();
checker.checkHappyNumber(num);
}
}
Interface NumberChecker
{
boolean checkNumber(int num);
}
class HappyNumberChecker implements NumberChecker
{
public void checkHappyNumber(int num)
{
if (checkNumber(num))
{
System.out.println(num + " is a happy number");
}
else
{
System.out.println(num + " is not a happy number");
}
}
@Override
public boolean checkNumber(int num)
{
int sumOfSquares = 0;
while (true)
{
while (num > 0)
{
int digit = num % 10;
sumOfSquares += digit * digit;
num /= 10;
}
if (sumOfSquares == 1)
{
return true;
}
else if (sumOfSquares == 4)
{
return false;
}
else
{
num = sumOfSquares;
sumOfSquares = 0;
}
}
}
}
