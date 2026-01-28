import java.util.Scanner;

public class MatrixMultiplication {
    public static int[][] multiply(int[][] A, int[][] B, int n) {

        int[][] C = new int[n][n];     // O(n^2)

        for (int i = 0; i < n; i++) {          // O(n)
            for (int j = 0; j < n; j++) {      // O(n)
                C[i][j] = 0;                   // O(1)
                for (int k = 0; k < n; k++) {  // O(n)
                    C[i][j] += A[i][k] * B[k][j]; // O(1)
                }
            }
        }
        return C;  // O(1)
    }
    public static void printMatrix(int[][] M, int n) {
        for (int i = 0; i < n; i++) {       // O(n)
            for (int j = 0; j < n; j++) {   // O(n)
                System.out.print(M[i][j] + " "); // O(1)
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);   // O(1)

        System.out.print("Enter order of matrix: "); // O(1)
        int n = in.nextInt();                  // O(1)

        int[][] A = new int[n][n];             // O(n^2)
        int[][] B = new int[n][n];             // O(n^2)

        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < n; i++) {           // O(n)
            for (int j = 0; j < n; j++) {       // O(n)
                A[i][j] = in.nextInt();         // O(1)
            }
        }

        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < n; i++) {           // O(n)
            for (int j = 0; j < n; j++) {       // O(n)
                B[i][j] = in.nextInt();         // O(1)
            }
        }

        int[][] C = multiply(A, B, n);          // O(n^3)

        System.out.println("Resultant Matrix:");
        printMatrix(C, n);                      // O(n^2)
    }

    // ------------------- Time Complexity Analysis -------------------
    /*
     * Three nested loops:
     *   Outer loop  → n
     *   Middle loop → n
     *   Inner loop  → n
     *
     * Total operations = n × n × n = n^3
     *
     * Time Complexity = O(n^3)
     */
    
    // ------------------- Recurrence Relation -------------------
    /*
     * Using Divide and Conquer approach:
     *
     * A matrix of size n x n is divided into 4 sub-matrices of size (n/2).
     * To compute C:
     *   8 multiplications of (n/2 x n/2) matrices
     *   O(n^2) additions
     *
     * Recurrence:
     *   T(n) = 8T(n/2) + cn^2
     */

    // ------------------- Substitution Method -------------------
    /*
     * T(n) = 8T(n/2) + cn^2
     *
     * = 8[8T(n/4) + c(n/2)^2] + cn^2
     * = 64T(n/4) + 2cn^2 + cn^2
     * = 64T(n/4) + 3cn^2
     *
     * After k levels:
     *   T(n) = 8^k T(n / 2^k) + kcn^2
     *
     * Stop when:
     *   n / 2^k = 1  →  k = log n
     *
     * T(n) = n^3 T(1) + cn^2 log n
     * T(n) = O(n^3)
     */

    // ------------------- Complexity (short) -------------------
    /*
     * Matrix Multiplication:
     *   Time Complexity: O(n^3)
     *   Space Complexity: O(n^2)
     */
}
