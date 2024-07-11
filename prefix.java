import java.util.Scanner;

public class prefix {
    static void pref(int []arr){
        for (int i = 1; i < arr.length; i++) {
            arr[i]= arr[i-1]+arr[i];
        }
    }
    static void printArray(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Befor prefix sum: ");
        printArray(arr);
        pref(arr);
        System.out.println("After Prefix sum: ");
        printArray(arr);
    }
}

