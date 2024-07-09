public class unique {
    static int uniqueValue(){
        int [] arr = {4,5,5,2,2};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    arr[i]=0;
                    arr[j]=0;
                }
            }
        }
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("UNique element :"+uniqueValue());
    }
}