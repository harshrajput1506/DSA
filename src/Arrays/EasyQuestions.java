package Arrays;

import java.util.Arrays;

public class EasyQuestions {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        for(int i = 0; i<nums.length; i++){
            nums[i] = (int) Math.pow(nums[i], 2);
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
