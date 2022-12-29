import java.util.Scanner;

public class Multi {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while (true) {
      System.out.print("Enter the value of n for n-Square Matrix : ");
      int n = in.nextInt();
      if (n <= 0) {
        System.out.println("invalid input");
      } else {
        int sum = 0;
        while (n != 0) {
          sum = sum + n * n;
          n--;
        }
        System.out.println("The number square matrices are : " + sum);
      }
    }
  }
}


package nag;
import java.util.Scanner;
public class sample
{
public static void main(String[] args)
{
// Prompt user for input
Scanner in = new Scanner(System.in);
System.out.print("Enter value of n for the n-Square matrix: ");
int n = in.nextInt();
// Check for valid input
if (n <= 0)
{
System.out.println("Invalid input.");
System.exit(0);
}
// Calculate sum of squares
int sum = 0;
for(int i=1; i<=n; i++)
{
sum += i*i;
}
// Print result
System.out.println("Sum of squares of the "+n+"-Square matrix is: "+sum);
}
}
