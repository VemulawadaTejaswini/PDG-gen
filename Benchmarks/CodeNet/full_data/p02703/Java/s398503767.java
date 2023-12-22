import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		int max = 50 * (n - 1);
		ArrayList<ArrayList<Cost>> graph = new ArrayList<>();
		for (int i = 0; i < n; i++) {
		    graph.add(new ArrayList<>());
		}
		for (int i = 0; i < m; i++) {
		    int a = sc.nextInt() - 1;
		    int b = sc.nextInt() - 1;
		    int c = sc.nextInt();
		    int d = sc.nextInt();
		    graph.get(a).add(new Cost(b, c, d));
		    graph.get(b).add(new Cost(a, c, d));
		}
		int[] coins = new int[n];
		int[] lates = new int[n];
		for (int i = 0; i < n; i++) {
		    coins[i] = sc.nextInt();
		    lates[i] = sc.nextInt();
		}
	    long[][] times = new long[n][max + 1];
	    for (int i = 0; i < n; i++) {
	        Arrays.fill(times[i], Long.MAX_VALUE);
	    }
	    PriorityQueue<Path> queue = new PriorityQueue<>();
	    queue.add(new Path(0, 0, s));
	    while (queue.size() > 0) {
	        Path p = queue.poll();
	        p.coin = Math.min(p.coin, max);
	        if (times[p.idx][p.coin] <= p.time) {
	            continue;
	        }
	        times[p.idx][p.coin] = p.time;
	        for (int i = p.coin - 1; i >= 0 && times[p.idx][i] > p.time; i--) {
	            times[p.idx][i] = p.time;
	        }
	        queue.add(new Path(p.idx, p.time + lates[p.idx], p.coin + coins[p.idx]));
	        for (Cost c : graph.get(p.idx)) {
	            if (c.coin > p.coin) {
	                continue;
	            }
	            queue.add(new Path(c.idx, p.time + c.time, p.coin - c.coin));
	        }
	    }
	    StringBuilder sb = new StringBuilder();
	    for (int i = 1; i < n; i++) {
	        sb.append(times[i][0]).append("\n");
	    }
	    System.out.print(sb);
	}
	
	static class Path implements Comparable<Path> {
	    int idx;
	    long time;
	    int coin;
	    
	    public Path(int idx, long time, int coin) {
	        this.idx = idx;
	        this.time = time;
	        this.coin = coin;
	    }
	    
	    public int compareTo(Path another) {
	        if (time == another.time) {
	            return 0;
	        } else if(time < another.time) {
	            return -1;
	        } else {
	            return 1;
	        }
	    }
	    
	    public String toString() {
	        return idx + ":" + time + ":" + coin;
	    }
	}
	
	static class Cost {
	    int idx;
	    int time;
	    int coin;
	    
	    public Cost(int idx, int coin, int time) {
	        this.idx = idx;
	        this.time = time;
	        this.coin = coin;
	    }
	}
}

