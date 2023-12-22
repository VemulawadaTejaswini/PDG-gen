import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        //Build graph
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for(int i = 0 ; i < M ; i++){
            int source = scan.nextInt();
            int target = scan.nextInt();
            graph.putIfAbsent(source, new ArrayList<>());
            graph.get(source).add(target);
        }

        int longestPath = 0;
        for(int vertex = 1 ; vertex <= N ;vertex++){
            longestPath = Math.max(longestPath, dfs(graph, vertex, new HashMap<>()));
        }
        System.out.println(longestPath);
    }

    private static int dfs(Map<Integer, List<Integer>> graph, Integer vertex, Map<Integer, Integer> cache) {
        if(cache.containsKey(vertex)){
            return cache.get(vertex);
        }

        int longestFromHere = 0;
        if(graph.get(vertex) != null) {
            for(Integer neighbour : graph.get(vertex)) {
                longestFromHere = Math.max(longestFromHere, 1+dfs(graph, neighbour, cache));
            }
        }
        cache.put(vertex, longestFromHere);
        return cache.get(vertex);
    }
}
