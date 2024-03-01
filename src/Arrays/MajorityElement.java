package Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
        System.out.println(nums[(nums.length/2)+1]);
    }
}
