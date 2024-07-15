import java.util.*;
public class pascalTriangle {
    static void generatePascal(int n){
        int [][] triangle = new int [n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if(j == 0 || j == i){
                    triangle[i][j] = 1;
                }
                else{
                    triangle[i][j] = triangle[i-1][j] + triangle [i-1][j-1];
                }
                System.out.print(triangle[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of rows for pascal triangle :");
        int num = sc.nextInt();
        generatePascal(num);
    }
}
