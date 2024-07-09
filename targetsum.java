public class targetsum {
    static int sum(int[] arr,int target){
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if(arr[i]+arr[j]+arr[k]==target){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        System.out.println(sum(array, 7));
    }
}

