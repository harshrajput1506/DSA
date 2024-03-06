package Arrays;

public class RotateArray {
    public static void main(String[] args) {

        // Rotate array to the right by k position
        int[] nums = {1,2,3,4,5,6,7};  // Output = {5,6,7,1,2,3,4}
        // 0 -> 3, 1-> 4, 2-> 5, 3 -> 6 //
        // 4 -> 0, 5 -> 1, 6 -> 2 // Shifting
        // 0 -> 3, 1 -> 4,
        rotateBF(nums, 3);
        printArray(nums);
        rotateOptimal(nums, 3);

    }

    public static void  rotateBF(int[] nums, int position){
        int n = nums.length;
        position = n-(position%n);
        int[] temp = new int[position];
        // Add elements of kth position
        for(int i = 0; i<position; i++){
            temp[i] = nums[i];
        }
        //Shifting
        for(int i = position; i<n; i++){
            nums[i-position] = nums[i];
        }

        // Add temp again
        for(int i = n-position; i<n; i++){
            nums[i] = temp[i-(n-position)];
        }

    }

    public static void rotateOptimal(int[] nums, int position){
        position = position%nums.length;
        int last = nums.length-1;
        nums = reverse(nums, 0, last-position);
        nums = reverse(nums, nums.length-position, last);
        nums = reverse(nums, 0, last);
        printArray(nums);

    }

    public static int[] reverse(int[] nums, int start, int end){
        while (start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

        return nums;
    }

    public static void printArray(int[] nums){
        for (int i = 0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }
}

