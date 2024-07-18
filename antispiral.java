//printing the matrix in the antispiral order.
import java.util.*;
public class antispiral {
    static void spiral(int [][]matrix,int r,int c){
        int TopROw = 0 ,  bottomrow = r-1 , leftcol = 0 , rightcol = c-1;
        int toalelements = 0;
        while(toalelements < r*c){
            //LeftCol = toprow to bottomrow
            for (int i= TopROw; i <=bottomrow && toalelements < r*c; i++){
                System.out.print(matrix[i][leftcol]+" ");
                toalelements++;
            }
            leftcol++;
            //BottomRow = leftcol to rightcol
            for (int j = leftcol; j <= rightcol && toalelements < r*c; j++) {
                System.out.print(matrix[bottomrow][j]+" ");
                toalelements++;
            }
            bottomrow--;
            //RightCol = bottomrow to topRow
            for (int i = bottomrow; i >= TopROw && toalelements < r*c; i--) {
                System.out.print(matrix[i][rightcol]+" ");
                toalelements++;
            }
            rightcol--;
            //TopROw = rightcol to leftcol
            for (int j = rightcol; j >= leftcol && toalelements < r*c; j--) {
                System.out.print(matrix[TopROw][j]+" ");
                toalelements++;
            }
            TopROw++;
        }
    }
    static void printmatrix(int [][]matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the rows and column: ");
    int r = sc.nextInt();
    int c = sc.nextInt();
    int total = r*c;
    System.out.println("Enter "+total+" values: ");
    int matrix[][] = new int [r][c];
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix.length; j++) {
            matrix[i][j] = sc.nextInt();
        }
    }
    System.out.println("Original Matrix :");
    printmatrix(matrix);
    System.out.println("AntiSpriral order of the original matrix  :");
    spiral(matrix, r, c);
    }
}