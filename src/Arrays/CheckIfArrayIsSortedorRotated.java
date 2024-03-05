package Arrays;

import java.util.Arrays;

public class CheckIfArrayIsSortedorRotated {

    public static void main(String[] args) {
    }
    public boolean check(int[] nums) {
        int len = nums.length;
        int k = 0;

        for(int x = 0; x<len; ++x){
            if(nums[x] > nums[(x+1)%len]) {
                k++;
            }
            if(k>1){
                return false;
            }

        }

        return true;

    }
}
