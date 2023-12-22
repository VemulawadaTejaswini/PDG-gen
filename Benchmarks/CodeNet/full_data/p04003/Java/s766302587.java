import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<HashSet<Integer>> companies = new ArrayList<>();
		HashMap<Integer, HashSet<Integer>> stations = new HashMap<>();
		for (int i = 0; i <= n; i++) {
		    companies.add(new HashSet<>());
		}
		for (int i = 0; i < m; i++) {
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    companies.get(a).add(c);
		    companies.get(b).add(c);
		    HashSet<Integer> tmp;
		    if (stations.containsKey(c)) {
		        tmp = stations.get(c);
		    } else {
		        tmp  = new HashSet<>();
		        stations.put(c, tmp);
		    }
		    tmp.add(a);
		    tmp.add(b);
		}
		PriorityQueue<Path> queue = new PriorityQueue<>();
		queue.add(new Path(1, 0));
		int[] costs = new int[n + 1];
		Arrays.fill(costs, Integer.MAX_VALUE);
		while (queue.size() > 0) {
		    Path p = queue.poll();
		    if (costs[p.idx] <= p.value) {
		        continue;
		    }
		    costs[p.idx] = p.value;
		    for (int c : companies.get(p.idx)) {
		        for (int x : stations.get(c)) {
		            if (costs[x] <= p.value + 1) {
		                continue;
		            }
		            queue.add(new Path(x, p.value + 1));
		        }
		        stations.get(c).clear();
		    }
		}
		if (costs[n] == Integer.MAX_VALUE) {
		    System.out.println(-1);
		} else {
		    System.out.println(costs[n]);
		}
    }
    
    static class Path implements Comparable<Path> {
        int idx;
        int value;

        public Path(int idx, int value) {
            this.idx = idx;
            this.value = value;
        }
        public int compareTo(Path another) {
            return value - another.value;
        }
    }
}

