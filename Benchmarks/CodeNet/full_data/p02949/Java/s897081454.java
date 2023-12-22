import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int p = sc.nextInt();
		
		ArrayList<HashMap<Integer, Integer>> graph = new ArrayList<>();
		for (int i = 0; i < n; i++) {
		    graph.add(new HashMap<>());
		}
		for (int i = 0; i < m; i++) {
		    graph.get(sc.nextInt() - 1).put(sc.nextInt() - 1, sc.nextInt());
		}
		PriorityQueue<Path> queue = new PriorityQueue<>();
		queue.add(new Path(-1, 0, 0));
		int[] income = new int[n];
		Arrays.fill(income, Integer.MIN_VALUE);
		while (queue.size() > 0) {
		    Path x = queue.poll();
		    if (income[x.idx] >= x.value) {
		        continue;
		    }
		    income[x.idx] = x.value;
		    for (Map.Entry<Integer, Integer> entry : graph.get(x.idx).entrySet()) {
		        if (x.value == Integer.MAX_VALUE) {
		            queue.add(new Path(x.idx, entry.getKey(), x.value));
		        } else {
		            queue.add(new Path(x.idx, entry.getKey(), x.value + entry.getValue() - p));
		        }
		    }
		}
		if (income[n - 1] == Integer.MAX_VALUE) {
		    System.out.println(-1);
		} else {
		    System.out.println(Math.max(0, income[n - 1]));
		}
   }
   
   static class Path implements Comparable<Path> {
       static HashMap<Integer, HashSet<Integer>> used = new HashMap<>();
       int from;
       int idx;
       int value;
       
       public Path(int from, int idx, int value) {
           this.from = from;
           this.idx = idx;
           this.value = value;
           if (used.containsKey(from)) {
               if (used.get(from).contains(idx)) {
                   this.value = Integer.MAX_VALUE;
               }
           } else {
               used.put(from, new HashSet<>());
           }
           used.get(from).add(idx);
       }
       
       public int compareTo(Path another) {
           return another.value - value;
       }
   }
}
