import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, List<Integer>> graph = new HashMap<>(n);
        for (int i = 1; i <= n; i++) {
            graph.put(i, new ArrayList<>());
        }

        for (int r = 0; r < n - 1; r++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        boolean[] claimedCache = new boolean[n + 1];
        Queue<Integer> fennecFringe = new LinkedList<>();
        fennecFringe.add(1);
        int fennecCount = 1;
        Queue<Integer> snukeFringe = new LinkedList<>();
        snukeFringe.add(n);
        int snukeCount = 1;

        while (!fennecFringe.isEmpty() && !snukeFringe.isEmpty()) {
            // Fennec goes first
            Queue<Integer> fennecNextFringe = new LinkedList<>();
            for (Integer f : fennecFringe) {
                if (!claimedCache[f]) {
                    fennecCount++;
                    claimedCache[f] = true;
                    for (Integer neighbor : graph.get(f)) {
                        if (!claimedCache[neighbor]) {
                            fennecNextFringe.add(neighbor);
                        }
                    }
                }
            }
            fennecFringe = fennecNextFringe;

            Queue<Integer> snukeNextFringe = new LinkedList<>();
            for (Integer f : snukeFringe) {
                if (!claimedCache[f]) {
                    snukeCount++;
                    claimedCache[f] = true;
                    for (Integer neighbor : graph.get(f)) {
                        if (!claimedCache[neighbor]) {
                            snukeNextFringe.add(neighbor);
                        }
                    }
                }
            }
            snukeFringe = snukeNextFringe;
        }

        System.out.println(fennecCount > snukeCount ? "Fennec" : "Snuke");
    }
}
