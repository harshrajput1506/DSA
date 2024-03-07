package Arrays;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {

        int[] nums = {0,1,0,3,12};
        System.out.println(Arrays.toString(nums));

    }

    public static int[] moveZeroes(int[] nums) {
        int j = -1;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                j = i;
                break;
            }
        }
        for (int i = j+1; i<nums.length; i++){
            if(nums[i]!=0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }

        return nums;
    }

}
