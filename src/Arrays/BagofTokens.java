package Arrays;

import java.util.Arrays;

public class BagofTokens {
    public static void main(String[] args) {
        int[] tokens = {100,200,300,400}; //Input
        int power = 200; //Input

        int score = 0, max = 0;
        int left = 0, right = tokens.length-1;

        Arrays.sort(tokens);
        while (left<=right){
            if(power>=tokens[left]){
                power -= tokens[left];
                score++;
                left++;
                max = Math.max(max, score);
            } else if (score>0) {
                power+=tokens[right];
                score--;
                right--;
            } else break;
        }

        System.out.println("Your Max Score is "+max);
    }
}
