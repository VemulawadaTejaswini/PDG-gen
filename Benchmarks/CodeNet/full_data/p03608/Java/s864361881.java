import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main
{
    private static class Dst
    {
        final int dst;
        final int cost;

        public Dst(int dst, int cost)
        {
            this.dst = dst;
            this.cost = cost;
        }
    }

    private static Integer walk(int cur, int cost, ArrayList<Integer> cities, ArrayList<Integer> hist, Map<Integer, List<Dst>> route)
    {
        cities.remove(Integer.valueOf(cur));

//System.out.println(String.format("cur=%d, cost=%d", cur, cost));
        if (cities.isEmpty()) {
//System.out.println("Goal");
            return cost;
        }

        if (!route.containsKey(cur)) {
            return null;
        }

        int minCost = Integer.MAX_VALUE;
        for (Dst next : route.get(cur)) {
            if (!hist.contains(next.dst)) {
                ArrayList<Integer> newHist = new ArrayList<>(hist);
                newHist.add(cur);
                Integer resultCost = walk(next.dst, cost + next.cost, new ArrayList<>(cities), newHist, route);
                if (resultCost != null && resultCost < minCost) {
                    minCost = resultCost;
                }
            }
        }
        return minCost;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int r = sc.nextInt();

        ArrayList<Integer> cities = new ArrayList<>();
        for (int i = 0; i < r; i++) {
            cities.add(sc.nextInt());
        }

        Map<Integer, List<Dst>> route = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            {
                List<Dst> dst = route.computeIfAbsent(a, k -> new ArrayList<>());
                dst.add(new Dst(b, c));
            }
            {
                List<Dst> dst = route.computeIfAbsent(b, k -> new ArrayList<>());
                dst.add(new Dst(a, c));
            }
        }

        int minCost = Integer.MAX_VALUE;
        for (int city : cities) {
            ArrayList<Integer> newCities = new ArrayList<>(cities);
            ArrayList<Integer> hist = new ArrayList<>();
            Integer cost = walk(city, 0, newCities, hist, route);
            if (cost != null && cost < minCost) {
                minCost = cost;
            }
        }
        System.out.println(minCost);
    }
}
