package Arrays;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {1,1,5};


    }

    public int[] nextPermutation(int[] nums){
        int index  = -1;
        int len = nums.length;

        for (int i = len-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            Arrays.sort(nums);
            return nums;

        }

        for (int i = len-1; i>index; i--){
            if(nums[index]<nums[i]){
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                break;
            }
        }

        nums = reverse(nums, index+1, len-1);
        return nums;

    }

    public int[] reverse(int[] nums, int start, int end){
        while (start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return nums;
    }
}
