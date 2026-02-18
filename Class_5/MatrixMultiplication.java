import java.util.*;
public class MatrixMultiplication {
    public static int[][] inputMatrix(Scanner scanner, int rows, int cols, String matrixName) {
        int[][] matrix = new int[rows][cols];
        System.out.println("\nEnter elements for " + matrixName + " (" + rows + "x" + cols + "):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }
    public static void printMatrix(int[][] matrix, String matrixName) {
        System.out.println("\n" + matrixName + ":");
        for (int[] row : matrix) {
            System.out.print("  ");
            for (int element : row) {
                System.out.printf("%6d ", element);
            }
            System.out.println();
        }
    }
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;
        if (cols1 != rows2) {
            return null;
        }
        int[][] result = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("============================================================");
        System.out.println("Matrix Multiplication");
        System.out.println("============================================================");
        System.out.println("\nFirst Matrix (A):");
        System.out.print("Enter number of rows: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols1 = scanner.nextInt();
        System.out.println("\nSecond Matrix (B):");
        System.out.print("Enter number of rows: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols2 = scanner.nextInt();
        if (cols1 != rows2) {
            System.out.println("\n============================================================");
            System.out.println("ERROR: Matrix multiplication not possible!");
            System.out.println("Number of columns in A (" + cols1 + ") must equal");
            System.out.println("number of rows in B (" + rows2 + ")");
            System.out.println("============================================================");
            scanner.close();
            return;
        }
        int[][] matrixA = inputMatrix(scanner, rows1, cols1, "Matrix A");
        int[][] matrixB = inputMatrix(scanner, rows2, cols2, "Matrix B");
        System.out.println("\n============================================================");
        System.out.println("INPUT MATRICES");
        System.out.println("============================================================");
        printMatrix(matrixA, "Matrix A (" + rows1 + "x" + cols1 + ")");
        printMatrix(matrixB, "Matrix B (" + rows2 + "x" + cols2 + ")");
        int[][] result = multiplyMatrices(matrixA, matrixB);
        System.out.println("\n============================================================");
        System.out.println("RESULT");
        System.out.println("============================================================");
        printMatrix(result, "Matrix A × B (" + rows1 + "x" + cols2 + ")");
        System.out.println("\n============================================================");
        scanner.close();
    }
}
