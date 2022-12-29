import java.util.*;
public class Multi{
    public static void matrix(int firstMatrix[][], int secondMatrix[][])
    {
        int rows = 2, columns = 3;
        int[][] sum = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        // Displaying the result
        System.out.println("Sum of two matrices is: ");
        for(int[] row : sum) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        
      }
    }
    public static void main(String[] args) {
        int rows = 2, columns = 3;
        int[][] firstMatrix = { {2, 3, 4}, {5, 2, 3} };
        int[][] secondMatrix = { {-4, 5, 3}, {5, 6, 3} };
        matrix(firstMatrix,secondMatrix);

        // Adding Two matrices
        
        }
    }


///////////////////////////////////////////////////////////


public class MatrixAdd
{
public static void main(String[] args) {
// Declare and initialize the matrices
Int[ ][ ] matrix1 = {{1, 2, 3}, {4, 5, 6}};
Int[ ][ ] matrix2 = {{6, 5, 4}, {3, 2, 1}};
// Call the addMatrices method and store the result in a new matrix
Int[ ][ ] matrixSum = addMatrices(matrix1, matrix2);
// Print the result
for (int i = 0; i < matrixSum.length; i++)
{
for (int j = 0; j < matrixSum[ i ].length; j++)
{
System.out.print(matrixSum[ i ][ j ] + " ");
}
System.out.println();
}
}
// Method to add two matrices
public static int[ ][ ] addMatrices(int[ ][ ] matrix1, int[ ][ ] matrix2)
{
// Create a new matrix to store the sum
Int[ ][ ] matrixSum = new int[matrix1.length] [matrix1[0].length];
// Iterate through the rows and columns and add the corresponding elements
for (int i = 0; i < matrix1.length; i++)
{
for (int j = 0; j < matrix1[i].length; j++)
{
matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];
}
}
// Return the new matrix
return matrixSum;
}
}
