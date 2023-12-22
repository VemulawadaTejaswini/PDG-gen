
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int tVertex = scanner.nextInt();
        final int aVertex = scanner.nextInt();

        final List<Integer>[] tree = new List[n + 1];
        for (int i = 1; i < tree.length; i++) {
            tree[i] = new ArrayList<>();
        }
        for (int i = 0; i < n - 1; i++) {
            final int a = scanner.nextInt();
            final int b = scanner.nextInt();
            tree[a].add(b);
            tree[b].add(a);
        }

        final List<Integer> route = new ArrayList<>();
        final boolean[] isVisited = new boolean[n + 1];
        isVisited[tVertex] = true;
        search(tree, tVertex, aVertex, route, isVisited);

        Arrays.fill(isVisited, false);
        for (int i = route.size() / 2; i < route.size(); i++) {
            isVisited[route.get(i)] = true;
        }

        final List<Integer> routeFromA = new ArrayList<>();
        final List<Integer> routeFromA2 = searchLongest(tree, route.get(route.size() / 2), routeFromA, isVisited);

        System.out.println(routeFromA2.size() + (route.size() - 1) / 2 - 2);
    }

    private static List<Integer> searchLongest(final List<Integer>[] tree, final int current, final List<Integer> route, final boolean[] isVisited) {
        isVisited[current] = true;
        route.add(current);
        List<Integer> longest = new ArrayList<>(route);
        for (final int next : tree[current]) {
            if (isVisited[next]) {
                continue;
            }

            final List<Integer> tmp = searchLongest(tree, next, route, isVisited);
            if (tmp.size() > longest.size()) {
                longest = Collections.unmodifiableList(tmp);
            }
        }
        route.remove(route.size() - 1);
        return longest;
    }

    private static boolean search(final List<Integer>[] tree, final int current, final int dest, final List<Integer> route, final boolean[] isVisited) {
        isVisited[current] = true;
        route.add(current);
        if (current == dest) {
            return true;
        }
        for (final int next : tree[current]) {
            if (isVisited[next]) {
                continue;
            }

            if (search(tree, next, dest, route, isVisited)) {
                return true;
            }
        }
        route.remove(route.size() - 1);
        return false;
    }
}
