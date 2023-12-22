import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] costs = new int[n][n];
		ArrayList<HashMap<Integer, Integer>> graph = new ArrayList<>();
		for (int i = 0; i < n; i++) {
		    graph.add(new HashMap<>());
		}
		PriorityQueue<Path> queue = new PriorityQueue<>();
		for (int i = 0; i < n; i++) {
		    for (int j = 0; j < n; j++) {
		        costs[i][j] = sc.nextInt();
		        if (i < j) {
		            queue.add(new Path(i, j, costs[i][j]));
		        }
		    }
		}
		long total = 0;
		while (queue.size() > 0) {
		    Path p = queue.poll();
		    boolean flag = true;
		    for (int i = 0; i < n; i++) {
		        if (i == p.from || i == p.to) {
		            continue;
		        }
		        int cost = costs[p.from][i] + costs[i][p.to];
		        if (cost < p.value) {
		            System.out.println(-1);
		            return;
		        } else if (cost == p.value) {
		            flag = false;
		            break;
		        }
		    }
		    if (flag) {
		        total += p.value;
		    }
		}
		System.out.println(total);
    }
    
    static class Path implements Comparable<Path> {
        int from;
        int to;
        int value;
        
        public Path (int from, int to, int value) {
            this.from = from;
            this.to = to;
            this.value = value;
        }
        
        public int compareTo(Path another) {
            return value - another.value;
        }
    }
}

