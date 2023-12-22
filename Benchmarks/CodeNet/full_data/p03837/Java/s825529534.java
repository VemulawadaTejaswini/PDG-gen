import java.util.*;

/**
 * Created by sonetsuyoshi on 2016/07/31.
 */
public class Main {
    static int n;
    static int m;
    static int[][] distances;
    static boolean[][] connected;
    static boolean[][] used;

    static void start(int node) {
        Set<Integer> visiting = new HashSet<>();
        boolean[] visited = new boolean[n];
        int[] distance = new int[n];
        for(int i = 0; i < n; i++) distance[i] = Integer.MAX_VALUE;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            map.put(i, new ArrayList<>());
        }
        distance[node] = 0;
        visiting.add(node);

        while(visiting.size() > 0) {
            int id = -1;
            int minDistance = Integer.MAX_VALUE;
            for(int i: visiting) {
                if(distance[i] < minDistance) {
                    id = i;
                    minDistance = distance[id];
                }
            }

            visiting.remove(id);
            visited[id] = true;

            for(int i = 0 ; i < n; i++) {
                if(connected[id][i] && !visited[i]) {
                    int newDistance = distance[id] + distances[id][i];
                    if(newDistance < distance[i]) {
                        map.put(i, Arrays.asList(id));
                    } else if(newDistance == distance[i]) {
                        map.get(i).add(id);
                    }
                    visiting.add(i);
                    distance[i] = Math.min(newDistance, distance[i]);
                }
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j: map.get(i)) {
                used[i][j] = true;
                used[j][i] = true;
            }
        }

    }

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        distances = new int[n][n];
        connected = new boolean[n][n];
        used = new boolean[n][n];

        for(int i = 0 ; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            int c = sc.nextInt();
            distances[a][b] = c;
            distances[b][a] = c;
            connected[a][b] = true;
            connected[b][a] = true;
        }

        for(int i = 0 ; i < n; i++) {
            start(i);
        }

        int count = 0;
        for(int i = 0 ; i < n; i++) {
            for(int j = 0; j < i; j++) {
                if(connected[i][j] && !used[i][j])count++;
            }
        }

        System.out.println(count);
    }
}