import java.util.*;
public class transpose {
    static int[][] findtranspose(int [][]matrix, int r ,int c){
        int [][]ans = new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j]= matrix[j][i];
            }
        }
        return ans;
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

        System.out.println("Enter the number of rows and columns of the matrix:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] a = new int[r][c];
        int totalnum = r*c;
        System.out.println("Enter the "+ totalnum +" values :");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 1:");
        printArray(a);
        System.out.println("Transpose of matrix a is :");
        int [][]ans = findtranspose(a, r, c);
        printArray(ans);
    }
}