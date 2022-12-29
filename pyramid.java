package nag;
import java.util.Scanner;
public class sample
{
public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the number of levels for the number pyramid :");
int levels = scanner.nextInt();
int number = 1;
for (int i = 1; i <= levels; i++)
{
for (int j = 1; j <= levels - i; j++)
{
System.out.print(" ");
}
for (int k = 1; k <= i; k++)
{
System.out.print(number + " ");
Number++;
}
number--;
for (int l = 1; l < i; l++)
{
number--;
System.out.print(number + " ");
}
System.out.println("");
}
}
}


//////////////////////////////////////////////////////////////////



import java.util.Scanner;

public class Pyramid 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number of levels for the number pyramid : ");
		int levels=in.nextInt();
		for(int row=1;row<levels+1;row++)
		{
			for(int space=row;space<levels;space++)
			{
				System.out.print("  ");
			}
			for(int col=row;col<=2*row-1;col++)
			{
				System.out.print(col+" ");
			}
			for(int k=2*row-2;k>=row;k--)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}
