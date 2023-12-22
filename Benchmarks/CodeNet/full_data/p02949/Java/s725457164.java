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
		long[] income = new long[n];
		Arrays.fill(income, Long.MIN_VALUE / 2);
		while (queue.size() > 0) {
		    Path x = queue.poll();
		    if (income[x.idx] >= x.value) {
		        continue;
		    }
		    income[x.idx] = x.value;
		    for (Map.Entry<Integer, Integer> entry : graph.get(x.idx).entrySet()) {
		        if (x.value == Long.MAX_VALUE / 2) {
		            queue.add(new Path(x.idx, entry.getKey(), x.value));
		        } else {
		            queue.add(new Path(x.idx, entry.getKey(), x.value + entry.getValue() - p));
		        }
		    }
		}
		if (income[n - 1] == Long.MAX_VALUE / 2) {
		    System.out.println(-1);
		} else {
		    System.out.println(Math.max(0, income[n - 1]));
		}
   }
   
   static class Path implements Comparable<Path> {
       static HashMap<Integer, HashMap<Integer, Long>> used = new HashMap<>();
       int from;
       int idx;
       long value;
       
       public Path(int from, int idx, long value) {
           this.from = from;
           this.idx = idx;
           this.value = value;
           if (used.containsKey(from)) {
               if (used.get(from).containsKey(idx) && used.get(from).get(idx) < value) {
                   this.value = Long.MAX_VALUE / 2;
               }
           } else {
               used.put(from, new HashMap<>());
           }
           used.get(from).put(idx, value);
       }
       
       public int compareTo(Path another) {
           if (another.value == value) {
               return 0;
           } else if (another.value < value) {
               return -1;
           } else {
               return 1;
           }
       }
   }
}
