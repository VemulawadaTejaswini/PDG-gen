import java.util.*;
import java.io.*;
/**
 *  @author citizen11
 *  Problem C
 *  Cat Snuke and a Voyage
 */
public class Main {
    public static void main(String[] args) {
        Reader.init(System.in);
        try {
            int N = Reader.nextInt();
            int M = Reader.nextInt();
            int[][] pairs = new int[M][2];
            for (int i = 0; i < M; i++) {
                pairs[i][0] = Reader.nextInt();
                pairs[i][1] = Reader.nextInt();
            }
            solve(N, M, pairs);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    static class Island {
        public int number;
        public int distanceFromOne;

        public Island(int number, int distance) {
            this.number = number;
            this.distanceFromOne = distance;
        }
    }

    public static void solve(int N, int M, int[][] pairs) {
        Map<Integer, List<Integer>> graph = createGraph(N, M, pairs);
        Set<Integer> visited = new HashSet<>();
        Deque<Island> queue = new LinkedList<>();
        queue.add(new Island(1, 0));
        boolean isPossible = false;
        while (!queue.isEmpty()) {
            Island island = queue.poll();
            if (!visited.contains(island.number)) {
                if (island.number == N && island.distanceFromOne <= 2) {
                    isPossible = true;
                    break;
                }
                visited.add(island.number);
                if (island.distanceFromOne > 2) {
                    continue;
                }
                for (int v : graph.get(island.number)) {
                    int dist = island.distanceFromOne;
                    queue.add(new Island(v, dist + 1));
                }
            }
        }
        if (isPossible) {
            System.out.println("POSSIBLE");
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }

    private static Map<Integer, List<Integer>> createGraph(int N, int M, int[][] pairs) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            graph.put(i, new ArrayList<Integer>());
        }
        for (int i = 0; i < pairs.length; i++) {
            graph.get(pairs[i][0]).add(pairs[i][1]);
            graph.get(pairs[i][1]).add(pairs[i][0]);
        }
        return graph;
    }
}

class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    static void init(InputStream input) {
        reader = new BufferedReader(
                     new InputStreamReader(input));
        tokenizer = new StringTokenizer("");
    }

    static String next() throws IOException {
        while (!tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(
                   reader.readLine());
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }
}
