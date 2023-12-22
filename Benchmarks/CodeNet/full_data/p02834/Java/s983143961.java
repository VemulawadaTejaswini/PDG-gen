import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int u = sc.nextInt();
        int v = sc.nextInt();

        // u(Mr. Takahashi) has already visited
        boolean[] alreadyVisitedU = new boolean[n + 1];
        // v(Mr. Aoki) has already visited
        boolean[] alreadyVisitedV = new boolean[n + 1];

        // edge map
        Map<Integer, Set<Integer>> edge = new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            // add: a -> b
            if (!edge.keySet().contains(a)) {
                edge.put(a, new HashSet<>());
            }
            edge.get(a).add(b);
            // add: b -> a
            if (!edge.keySet().contains(b)) {
                edge.put(b, new HashSet<>());
            }
            edge.get(b).add(a);
        }

        // map: position -> depth
        Map<Integer, Integer> position2DepthMapU = new HashMap<>();
        Map<Integer, Integer> position2DepthMapV = new HashMap<>();
        dfs(alreadyVisitedU, edge, 0, u, position2DepthMapU);
        dfs(alreadyVisitedV, edge, 0, v, position2DepthMapV);
        System.out.println("u: " + position2DepthMapU);
        System.out.println("v: " + position2DepthMapV);

        // u < v のうち、maxのdepthを探す
        int ans = -1;
        for (int i : position2DepthMapU.keySet()) {
            int depthU = position2DepthMapU.get(i);
            int depthV = position2DepthMapV.get(i);
            if (depthU < depthV) {
                ans = Math.max(ans, depthV);
            }
        }
        ans--;
        System.out.println(ans);

        sc.close();
    }

    // return value: depth
    static void dfs(boolean[] alreadyVisited, Map<Integer, Set<Integer>> edge, int currentDepth, int currentPosition,
            Map<Integer, Integer> position2DepthMap) {
        if (alreadyVisited[currentPosition]) {
            return;
        }
        alreadyVisited[currentPosition] = true;
        position2DepthMap.put(currentPosition, currentDepth);
        for (int nextPosition : edge.get(currentPosition)) {
//            position2DepthMap.put(nextPosition, currentDepth + 1);
            dfs(alreadyVisited, edge, currentDepth + 1, nextPosition, position2DepthMap);
        }
        return;
    }

}
