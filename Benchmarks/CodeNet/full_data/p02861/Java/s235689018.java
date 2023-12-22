import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main
{
    private static void dfs(int n, int[][] points, ArrayList<Integer> route, List<Double> result)
    {
        if (route.size() == n) {
            double sum = 0;
            int[] last = null;
            for (int i : route) {
                int[] pos = points[i];
                if (last != null) {
                    sum += Math.sqrt(Math.pow(pos[0] - last[0], 2) + Math.pow(pos[1] - last[1], 2));
                }
                last = pos;
            }
            result.add(sum);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (route.contains(i)) {
                continue;
            }
            ArrayList<Integer> newRoute = new ArrayList<>(route);
            newRoute.add(i);
            dfs(n, points, newRoute, result);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] points = new int[n][];
        for (int i = 0; i < n; i++) {
            points[i] = new int[] { sc.nextInt(), sc.nextInt() };
        }

        List<Double> result = new ArrayList<>();
        dfs(n, points, new ArrayList<>(), result);

        double sum = 0;
        for (double x : result) {
            sum += x;
        }

        System.out.println(sum / result.size());
    }
}
