package nag;
public class sample
{
//Overloaded sum(). This sum takes two int parameters
public int sum(int a, int b)
{
return a+b;
}
//Overloaded sum(). This sum takes three int parameters
public int sum(int a, int b, int c)
{
return a+b+c;
}
//Overloaded sum(). This sum takes two double parameters
public double sum(double a, double b)
{
return a+b;
}
public static void main(String args[])
{
sample obj = new sample();
System.out.println(obj.sum(10,10));
System.out.println(obj.sum(10,10,10));
System.out.println(obj.sum(10.5,10.5));
}
}

//////////////////////////////////////////////////////////////////

import java.util.Scanner;
class HelperService {

   		 private String formatNumber(int value) {
       	 return String.format("%d", value);
    }

   		 private String formatNumber(double value) {
       	 return String.format("%.3f", value);
   	 }

  		  private String formatNumber(String value) {
       	 return String.format("%.2f", Double.parseDouble(value));
    }

   		 public static void main(String[] args) {
        		HelperService hs = new HelperService();
       		 System.out.println(hs.formatNumber(500));
       		 System.out.println(hs.formatNumber(89.9934));
       		 System.out.println(hs.formatNumber("550"));
    }
}
