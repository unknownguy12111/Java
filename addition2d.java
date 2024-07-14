import java.util.*;

public class addition2d {
    static void multiply(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (c1 != r2) {
            System.out.println("Wrong dimension - multiplication not possible");
            return;
        }
        int[][] mul = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    mul[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("Multiplication of two matrices:");
        printArray(mul);
    }

    static void add(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (r1 != r2 || c1 != c2) {
            System.out.println("Addition not possible:(");
            return;
        }
        int[][] sum = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Addition of two matrices:");
        printArray(sum);
    }

    static void printArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns for the first matrix:");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        System.out.println("Enter the values for the first matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the number of rows and columns for the second matrix:");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];
        System.out.println("Enter the values for the second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix 1:");
        printArray(a);
        System.out.println("Matrix 2:");
        printArray(b);

        System.out.println("Multiplication of matrix a and b:");
        multiply(a, r1, c1, b, r2, c2);

        System.out.println("Addition of matrix a and b:");
        add(a, r1, c1, b, r2, c2);

        sc.close();
    }
}
