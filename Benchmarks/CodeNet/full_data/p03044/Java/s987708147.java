import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	void run() {
		
		int n = sc.nextInt();
		int u[] = new int[n];
		int v[] = new int[n];
		int w[] = new int[n];
		
		Map<Integer,List<Integer>> g = new HashMap<Integer,List<Integer>>();
		
		for(int i = 0; i < n-1;i++) {
			u[i] = sc.nextInt()-1;
			v[i] = sc.nextInt()-1;
			w[i] = sc.nextInt();
			
			g.computeIfAbsent(u[i], x -> new ArrayList<Integer>()).add(i);
			g.computeIfAbsent(v[i], x -> new ArrayList<Integer>()).add(i);
		}
		
		int current = 0;
		int color = 0;
		int[] res = new int[n];
		Arrays.fill(res, -1);
		res[0] = 0;
		coloring(g,res,current,color,u,v,w);
		
		for(int i =0 ;i < n;i++) {
			System.out.println(res[i]);
		}
	}
	
	
	void coloring(Map<Integer,List<Integer>> g,int[] res, int current,int color, int[]u,int v[],int[] w) {
		for(int nextv : g.get(current)) {
			int next = u[nextv]+v[nextv]-current;	
			if(res[next] != -1) {
				continue;
			}
			int nextColor= (color + w[nextv])%2;
			res[next] = nextColor;
			
			coloring(g,res,next,nextColor,u,v,w);
		}
	}
}