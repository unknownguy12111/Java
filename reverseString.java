public class reverseString {
        public static void main(String[] args) {
            String original = "Hello , Tripti !!";
            char[] charArray = original.toCharArray();
            int left = 0;
            int right = charArray.length -1;
            while(left < right) {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            }
            String reversed = new String(charArray);
            System.out.println("Reversed Array: "+reversed);
        }
}
