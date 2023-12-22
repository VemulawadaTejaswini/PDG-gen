import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int t = Integer.parseInt(sc.next());
        Integer[] cost = new Integer[n];
        Integer[] time = new Integer[n];
        for (int i = 0; i < n; i++) {
            cost[i] = Integer.parseInt(sc.next());
            time[i] = Integer.parseInt(sc.next());
        }

        int minCost = 1001;
        for (int i = 0; i < n; i++) {
            if (time[i] <= t) {
                minCost = Math.min(minCost, cost[i]);
            }
        }

        System.out.println(minCost > 1000 ? "TLE" : minCost);
    }
}