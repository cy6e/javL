package nag;
import java.util.Scanner;
public class sample {
public static void main(String[] args)
{
int rno, ph, rem, sum=0;
String name, pw;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Room Number : ");
rno=sc.nextInt();
System.out.println("Enter Mobile Number : ");
ph=sc.nextInt();
System.out.println("Enter Name of the Customer : ");
name=sc.next();
char[] sym = {'$', '#', '@', '!', '%', '^', '&', '*', '<', '>'};
int len=name.length();
int c=(int)(Math.random()*10);
while(rno!=0)
{
rem=rno%10;
sum=sum+rem;
rno=rno/10;
if(sum>=10)
{
rno=sum;
sum=0;
}
}
pw=""+name.charAt(0)+(ph%10)+sum+sym[c]+name.charAt(len-1);
System.out.println("Generated Unique Password : "+pw);
}
}

//////////////////////////////////////////



import java.util.Scanner;

public class UniquePassword 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String name;
		String pw=new String();
		long ph;int rno,rem,sum=0;
		System.out.println("Enter the name : ");
		name=s.next();
		System.out.println("Enter the room no : ");
		rno=s.nextInt();
		int rno1=rno;
		System.out.println("Enter the phone number : ");
		ph=s.nextLong();
		char []sym={')','!','@','#','$','%','^','&','*','('};
		do
		{
			while(rno!=0)
			{
				rem=rno%10;
				sum=sum+rem;
				rno=rno/10;
			}
			if(sum>=10)
			{
				rno=sum;
				sum=0;
			}
		}while(rno!=0);
		
		int c=rno1/100;
		int len=name.length();
		int pos=0;
		for(int i=0;i<len;i++)
		{
			if(c==i)
			{
				pos=i;
				System.out.println("Password is : ");
			}
		}
		pw=""+name.charAt(0)+(ph%10)+sum+sym[c]+name.charAt(len-1);
		System.out.println(pw);
	}
}
