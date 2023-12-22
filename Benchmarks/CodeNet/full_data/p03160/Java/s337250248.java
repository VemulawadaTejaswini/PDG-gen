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

        System.out.println(GetMinCost(n-1, height, cost));

        sc.close();
    }
    public static int GetMinCost(int n, int[] height, int[] cost) {
        if (n == 0) {
            return 0;
        }else if (n == 1) {
            return Math.abs(height[1]-height[0]);
        }else {
            return Math.min(GetMinCost(n-1, height, cost)+Math.abs(height[n]-height[n-1])
                                ,GetMinCost(n-2, height, cost)+Math.abs(height[n]-height[n-2]));
        }
    }
}