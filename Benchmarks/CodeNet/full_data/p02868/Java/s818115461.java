import java.util.*;

public class Main {
    static ArrayList<Path>[] graph;
    static long[] score;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		graph = new ArrayList[n + 1];
		for (int i = 1; i <= n; i++) {
		    graph[i] = new ArrayList<Path>();
		}
		score = new long[n + 1];
		Arrays.fill(score, Long.MAX_VALUE / 10);
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    graph[a].add(new Path(b, c));
		    for (int j = a + 1; j < b; j++) {
		        graph[j].add(new Path(a, 0));
		        graph[b].add(new Path(j, 0));
		    }
		}
		search(1, 0);
		if (score[n] >= Long.MAX_VALUE / 10) {
		    System.out.println(-1);
		} else {
		    System.out.println(score[n]);
		}
	}
	
	static void search(int idx, long value) {
	    if (score[idx] <= value) {
	        return;
	    }
	    score[idx] = value;
	    for (Path next : graph[idx]) {
	        search(next.to, value + next.value);
	    }
	}
	
	static class Path {
	    int to;
	    int value;
	    
	    public Path(int to, int value) {
	        this.to = to;
	        this.value = value;
	    }
	}
}
