import java.util.*;
import java.io.*;

public class Main {
	static HashMap<Integer, int[]> graph = new HashMap<>();
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		HashSet<Integer> starts = new HashSet<>();
		for (int i = 1; i <= n; i++) {
		    String[] line = br.readLine().split(" ", n - 1);
		    int prev = getCode(i, Integer.parseInt(line[0]), n);
		    starts.add(prev);
		    for (int j = 1; j < n - 1; j++) {
		        int next = getCode(i, Integer.parseInt(line[j]), n);
		        if (!graph.containsKey(prev)) {
		            graph.put(prev, new int[]{next, 0});
		        }
		        graph.get(prev)[1] = next;
		        prev = next;
		    }
		}
		int max = 0;
		HashMap<Integer, Integer> visitedMap = new HashMap<>();
		for (int x : starts) {
		    int y = search(visitedMap, x, 1, new HashSet<Integer>());
		    if (y == Integer.MAX_VALUE) {
		        System.out.println(-1);
		        return;
		    }
		    max = Math.max(max, y);
		}
		System.out.println(max);
	}
	
	static int search(HashMap<Integer, Integer> visited, int code, int day, HashSet<Integer> circuit) {

	    if (visited.containsKey(code)) {
	        int d = visited.get(code);
	        if (d > day) {
	            return day;
	        }
	    }
	    visited.put(code, day);
	    if (!graph.containsKey(code)) {
	        return day;
	    }
	    int max = 0;
	    for (int x : graph.get(code)) {
	        if (x == 0) {
	            continue;
	        }
    	    if (circuit.contains(x)) {
    	        return Integer.MAX_VALUE;
    	    }
    	    circuit.add(x);
	        max = Math.max(search(visited, x, day + 1, circuit), max);
	        circuit.remove(x);
	    }
	    return max;
	}
	
	static int getCode(int x, int y, int base) {
	    return Math.min(x, y) * (base + 1) + Math.max(x, y);
	}
}
