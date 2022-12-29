import java.util.Scanner;


 class Matrix{
    	public  void printArray() 
    	{
  	  int array[][]={{1,3,4},{2,4,3},{3,4,5}};    
    
//creating another matrix to store transpose of a matrix  
int transpose[][]=new int[3][3];  //3 rows and 3 columns  
    
//Code to transpose a matrix  
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
transpose[i][j]=array[j][i];  
}    
}    
  
System.out.println("Printing Matrix without transpose:");  
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
System.out.print(array[i][j]+" ");    
}    
System.out.println();//new line    
}    
System.out.println("Printing Matrix After Transpose:");  
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
System.out.print(transpose[i][j]+" ");    
}    
System.out.println();//new line    
}
}
}


 public class Even_Odd extends Matrix { 
  
    	// Print array method 
 	   public void printArray() 
  	  { 
     		   super.printArray();
      		  int a[]={1,2,5,6,3,2};  
System.out.println("Odd Numbers:");  
for(int i=0;i<a.length;i++){  
if(a[i]%2!=0){  
System.out.println(a[i]);  
}  
 }  
System.out.println("Even Numbers:");  
for(int i=0;i<a.length;i++){  
if(a[i]%2==0){  
System.out.println(a[i]);  
}  
     }  
    } 
    public static void main(String[] args) 
    { 
        Even_Odd k = new Even_Odd();
        k.printArray();
    }
}



/////////////////////////////////////////////////////////////////////////////////////

package nag;
public class sample
{
public static void main(String[] args)
{
int[][] matrix = { {1,2,3}, {4,5,6}, {7,8,9} };
printTranspose(matrix);
printOddAndEven(matrix);
}
// Method to print the transpose of a matrix
static void printTranspose(int[][] matrix)
{
System.out.println("Printing the transpose of the matrix:");
for (int i = 0; i < matrix[0].length; i++)
{
for (int j = 0; j < matrix.length; j++)
{
System.out.print(matrix[j][i] + " ");
}
System.out.println();
}
}
// Method to print odd and even elements of the matrix
static void printOddAndEven(int[][] matrix)
{
System.out.println("Printing the odd and even elements of the matrix:");
for (int i=0; i < matrix.length; i++)
for (int j = 0; j < matrix[0].length; j++)
{
if (matrix[i][j] % 2 == 0)
{
System.out.print("Even element: " + matrix[i][j]);
}
else
{
System.out.print("Odd element: " + matrix[i][j]);
}
System.out.println();
} } } }
