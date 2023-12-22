import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        List<Route> routes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            routes.add(new Route(sc.nextInt(), sc.nextInt()));
        }

        List<Route> sorted = routes.stream()
                .sorted(Comparator.comparing(Route::getCost))
                .collect(Collectors.toList());

        for (int i = 0; i < n; i++) {
            if (sorted.get(i).getTime() <= t) {
                System.out.println(sorted.get(i).getCost());
                return;
            }
        }
        System.out.println("TLE");
    }

    static class Route {
        int cost;
        int time;

        public Route(int cost, int time) {
            this.cost = cost;
            this.time = time;
        }

        public int getCost() {
            return cost;
        }

        public int getTime() {
            return time;
        }
    }
}
