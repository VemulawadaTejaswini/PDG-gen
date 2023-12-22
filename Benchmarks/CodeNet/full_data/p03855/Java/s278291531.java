import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	class Pair{
		int a;
		int b;
		Pair(int a,int b){
			this.a=a;
			this.b=b;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + a;
			result = prime * result + b;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Pair other = (Pair) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (a != other.a)
				return false;
			if (b != other.b)
				return false;
			return true;
		}
		private Main getOuterType() {
			return Main.this;
		}
	}
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	ArrayList<ArrayList<Integer>> klist;
	ArrayList<ArrayList<Integer>> llist;
	boolean kused[];
	boolean lused[];
	int kcolor[];
	int lcolor[];
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int l=sc.nextInt();
		klist = new ArrayList<ArrayList<Integer>>();
		llist = new ArrayList<ArrayList<Integer>>();
		kused = new boolean[n+1];
		lused = new boolean[n+1];
		kcolor = new int[n+1];
		lcolor = new int[n+1];
		for(int i=0; i<=n; i++) {
			klist.add(new ArrayList<Integer>());
			llist.add(new ArrayList<Integer>());
		}
		for(int i=0; i<k; i++) {
			int p=sc.nextInt();
			int q=sc.nextInt();
			klist.get(p).add(q);
			klist.get(q).add(p);
		}
		for(int i=0; i<l; i++) {
			int r=sc.nextInt();
			int s=sc.nextInt();
			llist.get(r).add(s);
			llist.get(s).add(r);
		}

		int color=1;
		for(int i=1; i<=n; i++) {
			if(!kused[i]) {
				dfs(i, klist, kused, kcolor, color);
			}
			if(!lused[i]) {
				dfs(i, llist, lused, lcolor, color);
			}
			color++;
		}
		Map<Pair , Integer> m = new HashMap<>();

		for(int i=1; i<=n; i++) {
			Pair p = new Pair(kcolor[i], lcolor[i]);
			m.put(p, m.get(p) != null ? m.get(p)+1 : 1);
		}
		for(int i=1; i<=n; i++) {
			if(i>1)System.out.print(" ");
			Pair p = new Pair(kcolor[i], lcolor[i]);
			System.out.print(m.get(p));
		}
		System.out.println();
		sc.close();
	}

	public void dfs(int s, ArrayList<ArrayList<Integer>> list, boolean[] used, int c[], int color) {
		ArrayDeque<Integer> g = new ArrayDeque<Integer>();
		g.add(s);
		used[s]=true;
		c[s]=color;
		while(!g.isEmpty()) {
			int p = g.pop();
			ArrayList<Integer> k = list.get(p);
			for(int i=0; i<k.size(); i++) {
				int q=k.get(i);
				if(p != q && ! used[q]) {
					g.add(q);
					c[q]=color;
					used[q]=true;
				}
			}
		}
	}
}
