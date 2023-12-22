
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(stdin.readLine());
        
        Map<Integer, Map<Integer, Integer>> weights 
            = IntStream.range(0, n)
                       .boxed()
                       .collect(Collectors.toMap(Function.identity(), unused -> new HashMap<>()));
        for (int i = 0; i < n - 1; i++) {
            String[] line = stdin.readLine().split(" ");
            int u = Integer.parseInt(line[0]) - 1;
            int v = Integer.parseInt(line[1]) - 1;
            int w = Integer.parseInt(line[2]);
            weights.get(u).put(v, w);
            weights.get(v).put(u, w);
        }
        
        // 頂点0からの距離をそれぞれ求める。
        int[] distances = new int[n];
        Arrays.fill(distances, -1);
        distances[0] = 0;
        
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        
        while (!stack.isEmpty()) {
            int current = stack.pop();
            for (Entry<Integer, Integer> e : weights.get(current).entrySet()) {
                int next = e.getKey();
                if (distances[next] == -1) {
                    distances[next] = distances[current] + e.getValue();
                    stack.push(next);
                }
            }
        }
        
        Arrays.stream(distances).map(i -> i % 2).forEach(System.out::println);
    }
}
