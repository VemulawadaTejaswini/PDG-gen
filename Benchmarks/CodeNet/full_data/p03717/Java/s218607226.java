import java.util.*;

public class Main {
	
	/*
	 * default function
	 * */	
	int ni() {
		return cin.nextInt();
	}
	
	long nl() {
		return cin.nextLong();
	}
	
	String line() {
		return cin.nextLine();
	}
	
	void println(String str) {	
		System.out.println(str);
	}
	
	void print(String str) {
		System.out.print(str);
	}
	
	/*
	 * default variable
	 */
	
	static final int MOD = 1000000007;
	
	Scanner cin = new Scanner(System.in);	
	String  output;
	
	public static void main(String[] args) {			
		new Main().run();						
	}
	
	/* default above */		
	public void run() {
			
		input();
		/* 
		 * start
		 */	
		
		dfs(1);
		
		/*
		 * finish
		 */
		
		output = (cnt % MOD) + "";
		println(output);
			
	}
	/* 
	 * define variable
	 */
	
	int N, M;
	Node[] ppp;
	
	int[] colors;
	long cnt;
	
	void input() {
		cnt = 0;
		
		N = ni();
		M = ni();
		
		colors = new int[N + 1];
		
		ppp = new Node[M];
		
		for (int i = 0; i < M; i ++) {
			ppp[i] = new Node(ni(), ni(), ni());
		}
	}
	
	void dfs(int index) {
		
		if (index == N + 1) {	
			// check whether valid
			for (int i = 0; i < M; i ++) {
				
				int[] a = new int[3];
				
				for (int j = ppp[i].l; j <= ppp[i].r; j ++) {
					a[colors[j]] = 1;
				}
				
				if (a[0] + a[1] + a[2] != ppp[i].x) {
					return;
				}
			}
			
			cnt ++;
			cnt = cnt%MOD;
			return;
		}
		
		colors[index] = 0;
		dfs(index + 1);
		
		colors[index] = 1;
		dfs(index + 1);
		
		colors[index] = 2;
		dfs(index + 1);		
	}	
}


class Node {
	
	public int l, r, x;
	
	public Node(int l, int r, int x) {
		this.l = l;
		this.r = r;
		this.x = x;	
	}
}
