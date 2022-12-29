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
