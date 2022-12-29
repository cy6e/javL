public class Video 
{
     String mName;
     boolean status;
     double rating;
	 public Video(String mName, boolean status, double rating) 
	 {
		super();
		this.mName = mName;
		this.status = status;
		this.rating = rating;	
	 }
	public String getmName()
	{
		return mName;
	}
	public void setmName(String mName) 
	{
		this.mName = mName;
	}
	public boolean isStatus()
	{
		return status;
	}
	public void setStatus(boolean status) 
	{
		this.status = status;
	}
	public double getRating() 
	{
		return rating;
	}
	public double setRating(double rating) 
	{
		return this.rating = rating;
	}     
}

Methods Class File : VideoMethods.java

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class VideoMethods 
{
	List<Video> MovieList = new ArrayList<Video>();
  public void AddMovies()
  {  
	  Scanner in=new Scanner(System.in);
	  System.out.print("Enter the name of the movie:");
	  String mName=in.nextLine();
	  System.out.print("Enter the status of the movie(True/False):");
	  boolean status=in.nextBoolean();
	  System.out.print("Enter the ratings for the movie(0-5):");
	  double rating=in.nextDouble();
	  Video v=new Video(mName, status, rating);
	  MovieList.add(v);
	    System.out.println("Library Initialized");
  }
	  public void DisplayAll()
	  {
		  if(MovieList.isEmpty())
		  {
			  System.out.println("No movies in the library");
		  }
		  for(Video m : MovieList)
		  {
			  System.out.println("Movie : " +m.getmName()+"  "+"Status : "+m.isStatus()+"  "+"Rating "+m.getRating());
		  }		
	  }
     
       boolean RentOut(String name)
      {
    	  for(Video m :MovieList)
    	  {
    		  if(m.getmName().equalsIgnoreCase(name))
    		  {
    			  if(m.isStatus())
    			  {
    				  m.setStatus(false);
    				  return true;
    			  }		  
    		  }
    		  return false;  
    	  }
		return false;	  
      }
       
      public void CollectIn(String name,double rat)
      {
    	  boolean flag=false;
    	  for(Video m :MovieList)
    	  {
    		  if(m.getmName().equalsIgnoreCase(name))
    		  { 
    				  m.setStatus(true);
    				  flag=true;
    		          Math.round(m.setRating((m.getRating() + rat)/2)); 
    		  }
    	  }
    	  if(!flag)
    	  {
    		  System.out.println("Requested Movie not rented out");
    	  } 	  
      }
}

Main Class File: VideoMain.java

import java.util.Scanner;

public class VideoMain 
{
	public static void main(String args[])
	{
		VideoMethods mm = new VideoMethods();
		while(true)
		{
				System.out.println("%%%%%%%% VIDEO LIBRARY CENTER %%%%%%%%");
				int n;
				Scanner in = new Scanner(System.in);
				System.out.println("1.ADD MOVIES");
				System.out.println("2.DISPLAY MOVIES");
				System.out.println("3.RENT OUT");
				System.out.println("4.COLLECT BACK ");
	
				System.out.println("PLEASE ENTER YOUR OPTION");
				n = in.nextInt();
				switch(n)
				{
					case 1:mm.AddMovies();
					break;
					case 2:mm.DisplayAll();
					break;
					case 3:System.out.print("Enter the movie you want to rent.");
					in.nextLine();
					if(mm.RentOut(in.nextLine()))
					{
						System.out.println("Rent out successfull");
					}
					else
					{
						System.out.println("Sorry!! Not Available");
					}
					break;
					case 4:System.out.println("Enter the name and the ratings of the movie"); 
					in.nextLine();
					mm.CollectIn(in.nextLine(),in.nextDouble());  
					break;
				}
		}
	}
}


///////////////////////////////////////
main.java

package nag;
//Main.java
//define the Main class
public class Main {
// define the main method
// the main method is the entry point of the program and is called when the program is
run
public static void main(String[] args) {
// create a new InventoryCentralSystem object and assign it to a variable called system
InventoryCentralSystem system = new InventoryCentralSystem();
// add three Video objects to the inventory list using the addVideo method of the system
object
system.addVideo("The Shawshank Redemption", true, 5);
system.addVideo("The Godfather", true, 5);
system.addVideo("The Godfather: Part II", true, 5);
// display the details of all the Video objects in the inventory list using the
displayInventory method of the system object
system.displayInventory();
// rent out the Video object with the name "The Shawshank Redemption" using the
rentVideo method of the system object
system.rentVideo("The Shawshank Redemption");
// display the details of all the Video objects in the inventory list again using the
displayInventory method of the system object
system.displayInventory();
}
}


//////////////////////////////////////////////////////
video.java

package nag;
//Video.java
//define the Video class
public class Video {
// instance variables to store the name, availability, and rating of the video
// the name and rating variables are of type String and int, respectively
// the available variable is of type boolean
private String name;
private boolean available;
private int rating;
// constructor to initialize the instance variables
// the constructor has three parameters: a String for the name, a boolean for the
availability, and an int for the rating
// the constructor assigns the values of the parameters to the instance variables
public Video(String name, boolean available, int rating) {
this.name = name;
this.available = available;
this.rating = rating;
}
// getter method to get the value of the name instance variable
// the method returns the value of the name variable
public String getName() {
return name;
}
// setter method to set the value of the name instance variable
// the method has a parameter of type String
// the method assigns the value of the parameter to the name variable
public void setName(String name) {
this.name = name;
}
// getter method to get the value of the availability instance variable
// the method returns the value of the available variable
public boolean isAvailable() {
return available;
}
// setter method to set the value of the availability instance variable
// the method has a parameter of type boolean
// the method assigns the value of the parameter to the available variable
public void setAvailable(boolean available) {
this.available = available;
}
// getter method to get the value of the rating instance variable
// the method returns the value of the rating variable
public int getRating() {
return rating;
}
// setter method to set the value of the rating instance variable
// the method has a parameter of type int
// the method assigns the value of the parameter to the rating variable
public void setRating(int rating) {
this.rating = rating;
}
}
//////////////////////////////////////////////
inventory.java
package nag;
//InventoryCentralSystem.java
//import the ArrayList class from the java.util package
import java.util.ArrayList;
//define the InventoryCentralSystem class
public class InventoryCentralSystem {
// instance variable to store a list of Video objects
private ArrayList<Video> inventory;
// constructor to initialize the inventory variable
public InventoryCentralSystem() {
// create a new ArrayList object and assign it to the inventory variable
inventory = new ArrayList<Video>();
}
// method to add a Video object to the inventory list
// the method has three parameters: a String for the name, a boolean for the availability,
and an int for the rating
// the method creates a new Video object with the given parameters and adds it to the
inventory list
public void addVideo(String name, boolean available, int rating) {
Video video = new Video(name, available, rating);
inventory.add(video);
}
// method to display the details of all the Video objects in the inventory list
public void displayInventory() {
// iterate through the inventory list and print the details of each Video object
for (Video video : inventory) {
System.out.println("Movie: " + video.getName() + ", Available: " + video.isAvailable() + ",
Rating: " + video.getRating());
}
}
//method to rent out a Video object from the inventory list
// the method has a parameter of type String for the name of the video
// the method iterates through the inventory list and finds the Video object with the given
name
// if the Video object is available, the method sets its availability to false and prints a
success message
// if the Video object is not available or not found, the method prints an error message
public void rentVideo(String name) {
for (Video video : inventory) {
if (video.getName().equals(name) && video.isAvailable()) {
video.setAvailable(false);
System.out.println("Movie rented successfully: " + video.getName());
return;
}
}
System.out.println("Sorry, the movie is not available for rent.");
}
}
