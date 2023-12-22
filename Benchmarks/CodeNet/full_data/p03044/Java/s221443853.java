import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	ArrayList<ArrayList<Link>> link;
	int[] colors;
		
	private void solve() {
		//input
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		link = new ArrayList<ArrayList<Link>>();
		for(int i=0; i<N; i++) {
			link.add(new ArrayList<Link>());
		}
		for(int i=0; i<N-1;i++) {
			int u = in.nextInt()-1;
			int v = in.nextInt()-1;
			int w = in.nextInt();
			link.get(u).add(new Link(v,w));
			link.get(v).add(new Link(u,w));
		}
		
		colors = new int[N];
		for(int i=0; i<N; i++) {
			colors[i] = -1;
		}
		draw(0,0);
		
		//output
		for (int b : colors) {
			System.out.println(b);
		}
	}

	private void draw(int node, int color) {
		if(colors[node] != -1) return;
		colors[node] = color;
		for(Link l : link.get(node)) {
			if(l.w == 0) continue;
			if((l.w & 1) == 0) {
				draw(l.next, color);
			}else {
				draw(l.next, (color==0)?1:0);
			}
		}
	}
	
	private class Link{
		int next;
		int w;
		
		public Link(int next, int w) {
			this.next = next;
			this.w = w;
		}
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}