package nag;
public class sample {
public static void main(String[] args) {
// Step 2: initialize array in try block
try {
int[] a = new int[5];
// Step 3: print a[6]
System.out.println(a[6]);
}
// Step 4: catch ArrayIndexOutOfBoundsException
catch (ArrayIndexOutOfBoundsException e) {
System.out.println("ArrayIndexOutOfBoundsException caught!");
}
// Step 5: expression divide by zero
int x = 10;
int y = 0;
try {
int result = x / y;
System.out.println(result);
}
// Step 6: catch ArithmeticException
catch (ArithmeticException e) {
System.out.println("ArithmeticException caught!");
}
// Step 7: End
}
}

//////////////////////////////////////////////////////////////////

import java.util.*;
public class Main {
	public static void main (String[] args) {
        try{
                try{
                    int[] a={1,2,3};
                    System.out.println(a[3]);
                }
   catch(ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("Out of bounds");
                }
              System.out.println(4/0);
        }
       catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException : divide by 0");
        }
	}
    }
