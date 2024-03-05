package StringsDSA;

public class StringMain {
    public static void main(String[] args) {
        // String  - cabaabac, aabccabba
        System.out.println(minimumLength("cabaabac"));

    }

    // 1750. Minimum Length of String After Deleting Similar Ends
    public static int minimumLength(String s) {
        int left = 0;
        int right = s.length()-1;
        System.out.println(right);


        while (left<right && s.charAt(left) == s.charAt(right)){
            char common = s.charAt(left);
            while (left<=right && s.charAt(left) == common){
                left++;
            }
            while (right>=left && s.charAt(right) == common){
                right--;
            }

        }

        return right - left + 1;
    }

}
