import java.util.Scanner;

/**
 * Created by Harry on 3/31/20.
 */
//https://atcoder.jp/contests/dp/tasks/dp_a
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] cost = new int[n];
        for(int i=0; i<n; i++){
            cost[i] = scanner.nextInt();
        }
        System.out.println(findMinCost(n, cost));
    }

    public static int findMinCost(int n, int[] cost){
        int prev2 = 0;
        int prev1 = Math.abs(cost[1]-cost[0]);
        for(int i=2; i<n; i++){
            int cur = Math.min(prev1+Math.abs(cost[i-1]-cost[i]), prev2+Math.abs(cost[i-2]-cost[i]));
            prev2 = prev1;
            prev1 = cur;
        }
        return prev1;
    }
}