import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxTime = sc.nextInt();
        List<Integer> costs = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            int cost = sc.nextInt();
            int time = sc.nextInt();

            if (time <= maxTime)
                costs.add(cost);
        }

        if (costs.size() == 0) {
            System.out.println("TLE");
        } else {
            Collections.sort(costs);
            int minCost = costs.get(0);
            System.out.println(minCost);
        }
    }
}