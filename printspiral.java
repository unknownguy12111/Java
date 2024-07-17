import java.util.*;
public class printspiral {
    static void spiral(int [][]matrix,int r,int c){
        int TopROw = 0 ,  bottomrow = r-1 , leftcol = 0 , rightcol = c-1;
        int toalelements = 0;
        while(toalelements < r*c){
            //TopROw = leftcol to rightcol
            for (int j = 0; j <= rightcol && toalelements < r*c ; j++) {
                System.out.print(matrix[TopROw][j]+" ");
                toalelements++;
            }
            TopROw++;
            //RightCol = toprow to bottomrow
            for (int i = TopROw; i <= bottomrow && toalelements < r*c; i++) {
                System.out.print(matrix[i][rightcol]+" ");
                toalelements++;
            }
            rightcol--;
            //BottomRow = rightcol to leftcol
            for (int j = rightcol; j >= leftcol && toalelements < r*c; j--) {
                System.out.print(matrix[bottomrow][j]+" ");
                toalelements++;
            }
            bottomrow--;
            //LeftCol = bottomrow to toprow
            for (int i= bottomrow; i >TopROw && toalelements < r*c; i--){
                System.out.print(matrix[i][leftcol]+" ");
                toalelements++;
            }
            leftcol++;
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
    System.out.println("Spriral order :");
    spiral(matrix, r, c);
    }
}
