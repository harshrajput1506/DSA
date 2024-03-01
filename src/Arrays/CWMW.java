package Arrays;

public class CWMW {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};  //len = 9
        int area = 0;
        int left  = 0;
        int right = (height.length)-1;

        while (left < right){
            area = Math.max(area, (Math.min(height[left], height[right]) * (right-left)));

            if(height[left] < height[right])  left++;
            else right--;
        }

        System.out.println(area);

    }
}
