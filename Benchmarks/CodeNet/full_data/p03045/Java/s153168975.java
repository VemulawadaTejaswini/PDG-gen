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
		int m = sc.nextInt();

		int u[] = new int[m];
		int v[] = new int[m];
		int w[] = new int[m];
		
		Map<Integer,List<Integer>> g = new HashMap<Integer,List<Integer>>();
		
		for(int i = 0; i < m;i++) {
			u[i] = sc.nextInt()-1;
			v[i] = sc.nextInt()-1;
			w[i] = sc.nextInt();
			
			g.computeIfAbsent(u[i], x -> new ArrayList<Integer>()).add(i);
			g.computeIfAbsent(v[i], x -> new ArrayList<Integer>()).add(i);
		}
		
		int color = 0;
		int[] res = new int[n];
		Arrays.fill(res, -1);
		
		for(int i =0 ; i< n;i++) {
			if(res[i] == -1) {				
				res[i] = color;
				coloring(g,res,i,color,u,v,w);
				color++;
			}
		}
		System.out.println(color);
	}
	
	
	void coloring(Map<Integer,List<Integer>> g,int[] res, int current,int color, int[]u,int v[],int[] w) {
		for(int nextv : g.getOrDefault(current,new ArrayList<Integer>())) {
			int next = u[nextv]+v[nextv]-current;	
			if(res[next] != -1) {
				continue;
			}
			res[next] = color;
			coloring(g,res,next,color,u,v,w);
		}
	}


}