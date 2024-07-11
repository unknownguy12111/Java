import java.util.Scanner;
public class rotate {
    static int[] rotateArray(int [] a,int k){
        int n = a.length;
        k = k%n;
        int [] ans = new int[n];
        int j = 0;
        for (int i = n-k; i < n; i++) {
            ans[j++]=a[i];
        }
        for (int i = 0; i < n-k; i++) {
            ans[j++]=a[i];
        }
        return ans;
    }
    static void printArray(int []ans){
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int [5];
        System.out.println("Enter the value of an array:-");
        for (int i = 0; i < a.length; i++) {
            a[i]= sc.nextInt();
        }
        System.out.println("Enter the value of k(rotaion):");
        int k = sc.nextInt();
        System.out.println("ORIGINAL ARRAY:");
        printArray(a);
        System.out.println("ROTATED ARRAY:");
        int [] rotatedarray = rotateArray(a , k);
        printArray(rotatedarray);
    }
}
