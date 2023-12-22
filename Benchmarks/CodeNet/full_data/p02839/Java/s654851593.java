import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Main {
	static class State{
		int h;
		int w;
		int r;
		int b;
		public State(int h , int w , int r , int b) {
			this.r = r;
			this.b = b;
			this.h = h;
			this.w = w;
		}
		@Override
		public int hashCode() {
			int x = h + 80 * w;
			int y = r + 80 * b;
			return x * 6400 + y;
		}
		@Override
		public String toString() {
			return h + " "+ w + " " + r + " " + b;
		}
		@Override
		public boolean equals(Object obj) {
			State s2 = (State) obj;
			return this.r == s2.r && this.b == s2.b && this.h == s2.h && this.w == s2.w;
		}
	}
	static int best(int curdiff, int dmax){
		if(curdiff > 0 ){
			return Math.max(0, curdiff - dmax);
		}else{
			return - Math.min(0, curdiff + dmax);			
		}
	}
	static int solve(int H, int W , int[][] R , int[][] B){
		Stack<State> q = new Stack<State>();
		int ret = 10000;
		q.add(new State(0 , 0 , 0 , 0));
		Set<State> vis = new HashSet<State>();
		int cnt = 0;
		while(!q.isEmpty()){			
			++cnt;
			State s = q.pop();
			if(cnt % 10000 == 0){
				System.out.println(s+" "+ret);
			}
			int dist = H - s.h + W - s.w;
			int dmax = dist * 80;
			int d1 = s.r + (B[s.h][s.w] - R[s.h][s.w]);
			int d2 = s.r + (R[s.h][s.w] - B[s.h][s.w]);
			if(s.h == H - 1 && s.w == W - 1){
				int d = Math.min(Math.abs(d1), Math.abs(d2));
				ret = Math.min(ret, d);
			}else{				
				if(s.h < H - 1){				
					if(best(d1 , dmax) < ret){
						State ns = new State(s.h + 1 , s.w , d1 , 0);					
						add(q, vis, ns);						
					}
					if(best(d2 , dmax) < ret){
						State ns = new State(s.h + 1 , s.w , d2 , 0);					
						add(q, vis, ns);						
					}
				}
				if(s.w < W - 1){
					if(best(d1 , dmax) < ret){
						State ns = new State(s.h , s.w + 1 , d1 , 0);					
						add(q, vis, ns);						
					}
					if(best(d2 , dmax) < ret){
						State ns = new State(s.h, s.w  + 1, d2 , 0);					
						add(q, vis, ns);						
					}
				}
			}
		}
		return ret;
	}
	private static void add(Stack<State> q, Set<State> vis, State ns) {
		if(!vis.contains(ns)){
			vis.add(ns);
			q.add(ns);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int A[][] = new int[H][W];
		int B[][] = new int[H][W];
		loadMatrix(sc, H, W, A);
		loadMatrix(sc, H, W, B);
		if(false){
			H = 80;
			W = 80;		
			A = new int[H][W];
			B = new int[H][W];
			Random rand = new Random();
			for(int i = 0 ; i < H ; ++i){
				for(int j = 0 ; j < W ; ++j){
					A[i][j] = rand.nextInt(80) + 1;
					B[i][j] = rand.nextInt(80) + 1;
				}
			}			
		}
		int ret = solve(H , W , A , B);
		System.out.println(ret);
	}
	private static void loadMatrix(Scanner sc, int H, int W, int[][] A) {
		for(int i = 0 ; i < H ; ++i){
			for(int j = 0 ; j < W ; ++j){
				A[i][j] = sc.nextInt();
			}
		}
	}
}
