import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * http://abc075.contest.atcoder.jp/tasks/abc075_c
 */
public class Main {

	static Point[] points;
	static Set<Integer> g = new HashSet<Integer>();
	static Set<Integer> v = new HashSet<Integer>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int M = sc.nextInt();
		points = new Point[N];
		for(int i=0; i<N; i++) points[i] = new Point(i);
		for(int i=0; i<M; i++){
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			points[x].neighbor.add(y);
			points[y].neighbor.add(x);
		}
		sc.close();
		dfs(0, 0, new ArrayList<Integer>());
		int m = 0;
		for(int i:g){
			for(int n:points[i].neighbor){
				if(g.contains(n)){
					m++;
				}
			}
		}
		System.out.println(M-m/2);
	}
	
	
	private static void dfs(int current, int previous, List<Integer> route) {
		if(route.contains(current)){
			int d = route.indexOf(current);
			for(int i=d; i<route.size(); i++) g.add(route.get(i));
			return;
		}
		v.add(current);
		for(int n: points[current].neighbor){
			if(n==previous) continue;
			List<Integer> newRoute = new ArrayList<Integer>();
			for(int r: route) newRoute.add(r);
			newRoute.add(current);
			dfs(n, current, newRoute);
		}
	}

	static class Point{
		public Point(int id) {
			this.id = id;
		}
		int id;
		Set<Integer> neighbor = new HashSet<>();
	}

}