package nag;
//Interface Declaration
interface Parent1
{
public void print_Parent1();
}
interface Parent2
{
public void print_Parent2();
}
//Class implementing the interfaces
class Child implements Parent1, Parent2
{
public void print_Parent1()
{
System.out.println("This is the Parent1 class.");
}
public void print_Parent2()
{
System.out.println("This is the Parent2 class.");
}
}
//Main class
class sample
{
public static void main(String[] args)
{
Child c = new Child();
c.print_Parent1();
c.print_Parent2();
}
}

///////////////////////////////////////////
import java.util.Scanner;
interface vehicleone{
		int  speed=90;
		public void distance();
}

interface vehicletwo{
		int distance=100;
		public void speed();
}

class Vehicle  implements vehicleone,vehicletwo{
	public void distance(){
		int  distance=speed*100; 
		System.out.println("distance travelled is "+distance);
	}
	public void speed(){
		int speed=distance/100;
	}
}

class MultipleInheritanceUsingInterface{
	public static void main(String args[]){
		System.out.println("Vehicle");
		obj.distance();
		obj.speed();
	}
}
interface vehicleone{
	int  speed=90;
	public void distance();
}

interface vehicletwo{
	int distance=100;
	public void speed();
}

class Vehicle  implements vehicleone,vehicletwo{
	public void distance(){
		int  distance=speed*100; 
		System.out.println("distance travelled is "+distance);
	}
	public void speed(){
		int speed=distance/100;
	}
}

class MultipleInheritanceUsingInterface{
	public static void main(String args[]){
		System.out.println("Vehicle");
		obj.distance();
		obj.speed();
	}
}
