
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static int []ans;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
			
		int [][]like = new int [n][2];
		int [][]dislike = new int [n][2];
		
		Unionfind uf = new Unionfind(n);
		ans = new int [n];
		
		for(int i = 0 ; i < m ;i++) {
			like[i][0] = Integer.parseInt(sc.next());
			like[i][1] = Integer.parseInt(sc.next());
			uf.union(like[i][0]-1, like[i][1]-1);
		}
		
		for(int i = 0 ;i < n ;i++) {
			ans[i] = uf.getSize(i)-1;
		}
		for(int i = 0 ;i < m ;i++) {
				ans[like[i][0]-1]--;
				ans[like[i][1]-1]--;
		}
		for(int i = 0 ;i < k ; i++) {
			dislike[i][0] = Integer.parseInt(sc.next());
			dislike[i][1] = Integer.parseInt(sc.next());
			if(uf.root(like[i][0]) == uf.root(like[i][1])) {
				ans[dislike[i][0]-1]--;
				ans[dislike[i][1]-1]--;
			}
		}
		
		for(int i = 0 ;i < n ;i++) {
			System.out.println(ans[i]);
		}

	}
}

class Unionfind {

	private int[] data;
	int []size;
	
	public Unionfind(int size) {
		this.data = new int [size];
		for(int i = 0 ;i < size ;i++) {
			initnode(i);
		}
		clear();
	}
	
	public void initnode(int i) {
		size[i] = 1;
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
			size[x] += size[y];
			data[y] = x;
		}
	}
	
	public int getSize(int i) {
		return size[i];
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
	

}
