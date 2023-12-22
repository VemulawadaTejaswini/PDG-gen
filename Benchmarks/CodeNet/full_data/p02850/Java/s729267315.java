import java.util.*;

public class Main {
    static ArrayList<Path>[] graph;
    static int n;
    static int k;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		graph = new ArrayList[n];
		for (int i = 0; i < n; i++) {
		    graph[i] = new ArrayList<Path>();
		}
		Path[] colors = new Path[n - 1];
		for (int i = 0; i < n - 1; i++) {
		    int a = sc.nextInt() - 1;
		    int b = sc.nextInt() - 1;
		    Path p = new Path();
		    colors[i] = p;
		    graph[a].add(p);
		    graph[b].add(p);
		}
		for (int i = 0; i < n; i++) {
		    k = Math.max(k, graph[i].size());
		}
		for (int i = 0; i < n; i++) {
		    TreeSet<Integer> used = new TreeSet<>();
		    for (Path p : graph[i]) {
		        if (p.color != 0) {
		            used.add(p.color);
		        }
		    }
		    int c = 1;
		    for (Path p : graph[i]) {
		        if (p.color == 0) {
		            while (used.contains(c)) {
		                c++;
		            }
		            p.color= c;
		            c++;
		        }
		    }
		}
		StringBuilder sb  = new StringBuilder();
		sb.append(k).append("\n");
		for (int i = 0; i < n - 1; i++) {
		    sb.append(colors[i].color).append("\n");
		}
		System.out.print(sb);
	}
	
	static class Path {
	    int color = 0;
	}
}
