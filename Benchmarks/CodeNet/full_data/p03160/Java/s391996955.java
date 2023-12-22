import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] height = new int[n];
        int[] cost = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }
        cost[0] = 0;
        for (int i = 1; i < n; i++) {
            if (n == 1) {
                cost[i] = Math.abs(height[i]-height[i-1]);
            } else {    
                cost[i] = Math.min(cost[i-1] +Math.abs(height[i]-height[i-1]), 
                cost[i-2] + Math.abs(height[i]-height[i-2]));
            }
        }
        System.out.println(cost[n-1]);
        sc.close();
    }
}