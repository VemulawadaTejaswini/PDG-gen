

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int[] cost;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] height = new int[n];
        cost = new int[n];
        Arrays.fill(cost,-1);
//        int[] c = new int[n];
        for(int i = 0; i < n; i++){
            height[i] = scanner.nextInt();
        }
        System.out.println(frog(height, n-1, k));
//        for(int i = 1; i < n; i++){
//            int min = Integer.MAX_VALUE;
//            for(int j = i - 1; j > -1 && j >= i - k; j--){
//                min = Math.min(min, c[j]+Math.abs(h[j]-h[i]));
//            }
//            c[i] = min;
//        }
//        System.out.println(c[n-1]);
    }

    public static int frog(int[] height, int n, int k){
        if(cost[n]==-1){
            int res;
            if(n<k){
                res = Math.abs(height[n]-height[0]);
            }else{
                int min = Integer.MAX_VALUE;
                for(int i = 1; i <= k ; i++){
                    min = Math.min(min, frog(height, n-i, k) + Math.abs(height[n]-height[n-i]));
//                    System.out.println(min);
                }
                res = min;
            }
            cost[n] = res;
        }
        return cost[n];
    }
}
