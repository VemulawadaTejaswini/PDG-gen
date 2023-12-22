
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		
		int [][]es = new int [m][2];
		
		for(int i = 0  ;i < m ;i++) {
			int a = Integer.parseInt(sc.next())-1;
			int b = Integer.parseInt(sc.next())-1;
			
			es[i][0] = a;
			es[i][1] = b;
		}
		
		long now = (long)n*(n-1)/2;
		long []ans = new long [m];
		Unionfind uf = new Unionfind(n);
		
		for(int i = m-1 ;i >= 0; i--) {
			ans[i] = now;					
			
			int a = uf.root(es[i][0]);		
			int b = uf.root(es[i][1]);
			
			if(a != b) {									//親が同じかどうか
				now -= (long)uf.size(a)*uf.size(b);			//異なるならそれぞれの集合の大きさの積を引く
			}
			uf.union(es[i][0], es[i][1]);					//同じ集合に統一する
		}
		
		for(int i = 0 ;i < m;i++) {
			System.out.println(ans[i]);
		}
		
		


	}

}

class Unionfind {

	private int[] data;
	
	public Unionfind(int size) {
		this.data = new int [size];
		clear();
	}
	
	public void clear() {
		Arrays.fill(data, -1);
	}
	
	public void union(int x , int y ) {
		if((x = root(x)) != (y = root(y))) {
			if(data[y] < data[x]) {
				final int t = x;
				x = y;
				y = t;
			}
			data[x] += data[y];
			data[y] = x;
		}
	}
	
	public int root(int x) {
		if(data[x] < 0) {
			return x;
		}
		else {
			return data[x] = root(data[x]);
		}
	}
	
	public boolean same(int x, int y) {
		return root(x) == root(y);
	}
	
	public int size(int x) {
		return data[root(x)];
	}
	

}
