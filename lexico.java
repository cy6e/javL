package nag;
import java.util.Scanner;
public class sample
{
public static void main(String[ ] args)
{
Scanner sc = new Scanner(System.in);
String[ ] inputStrings = new String[5];
System.out.println("Enter 5 strings: ");
// Accepting the strings from the user
for(int i=0; i<5; i++)
{
inputStrings[i] = sc.nextLine();
}
// Sorting the strings in lexicographical order
for (int i = 0; i < 5; i++)
{
for (int j = i + 1; j < 5; j++)
{
if (inputStrings[i] . compareTo(inputStrings[j])>0)
{
String temp = inputStrings[i];
inputStrings[i] = inputStrings[j];
inputStrings[j] = temp;
}
}
}
// Printing the strings
System.out.println("Strings in lexicographical order: ");
for(int i=0; i<5; i++)
{
System.out.println(inputStrings[i]);
}
sc.close();
}
}

///////////////////////////////////////////////////////////////////////
import java.util.Arrays;
import java.util.Scanner;

public class Lexicographical 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		String[] ls=new String[5];
		System.out.println("Enter five strings : ");
		System.out.print("First : ");
		ls[0]=in.next();
		System.out.print("Second : ");
		ls[1]=in.next();
		System.out.print("Third : ");
		ls[2]=in.next();
		System.out.print("Fourth : ");
		ls[3]=in.next();
		System.out.print("Fifth : ");
		ls[4]=in.next();
		Arrays.sort(ls);
		for(int i=0;i<5;i++)
		{
			System.out.println(ls[i]);
		}
	}
}
