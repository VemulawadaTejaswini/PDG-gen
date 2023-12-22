import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    static int count = 0;
    static int heights[];
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        heights = new int[n];

        for(int i = 0; i < n; i++){
            heights[i] = sc.nextInt();
        }
        while(true){

            int sum = 0;
            for(int i = 0; i < heights.length; i++){
                sum += heights[i];
            }
            if(sum == 0){
                System.out.println(count);
                break;
            }
            reduceHeight(heights);
            //System.out.println(count + ":" + sum);

        }

    }

    private static void reduceHeight(int[] heights) {
        int min = 0;
        int max = heights.length;
        for(int i = 0; i < heights.length; i++){
            if(heights[i] > 0){
                min = i;
                break;
            }
        }

        for(int i = min; i < heights.length; i++){
            if(heights[i] == 0){
                max = i;
                break;
            }
        }
        for(int i = min; i < max; i++){
            heights[i] = heights[i] - 1;
        }

        count++;

    }


}