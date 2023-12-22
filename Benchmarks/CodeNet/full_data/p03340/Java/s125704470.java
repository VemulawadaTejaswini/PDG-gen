
import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Arrays;
	/* static int java.util.Arrays.binarySearch(int[] a, int key); */
import java.math.BigDecimal;
	



public class Main {
	Scanner sc = new Scanner(System.in);
	int n;
	int[] a;
	public void run(){
		n = sc.nextInt();
		a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		solve();
	}
	public void solve(){
		int ans[] = new int[n];
		int ansp = 0;
		for(int l = n-1; l >= 0; l--){
			if(a[l] == 0){
				ans[l] = 1;
				if(l < n-1) ans[l] += ans[l+1];
				ansp += ans[l]; 
				continue;
			}
			int xor = a[l];
			int sum = a[l];
			ans[l]++;
			
			int[] bits = new int[20];
			
			for(int i = 0; i < 20; i++){
				if((a[l] & 1 << i) != 0){
					bits[i] = 1;
				}
			}
			
			for(int r = l+1; r < n; r++){
				xor = xor ^ a[r];
				sum = sum + a[r];
				if(xor == sum){
					ans[l]++;
				}
				int flag = 0;
				for(int i = 0; i < 20; i++){
					if((a[r] & 1 << i) != 0){
						bits[i] += 1;
						if(bits[i] >= 2){
							flag = 1;
							break;
						}
					}
				}
				if(flag == 1) break;
			}
			ansp += ans[l]; 
		}
		
		System.out.println(ansp);
	}
	
	public static void main(String[] args){
		new Main().run();
	}
	
	static class Pair {
        int first,second;
        public Pair(int a,int b) {
            this.first = a;
            this.second = b;
        }
    }
	static class Edge{
		int to, cost;
		public Edge(int a, int b){
			this.to = a;
			this.cost = b;
		}
	}
	class MyComparator implements Comparator {
		@Override
		public int compare (Object arg0, Object arg1) {
			int x = ((Pair)arg0).first;
			int y = ((Pair)arg1).first;
			
			if (x < y) {
				return 1;
			} else if (x > y) {
				return -1;
			} else{
				return 0;
			}
		}
	}
	static class UnionFind{
		int par[];
		int rank[];
		
		//n要素で初期化
		public UnionFind(int maxn){
			par = new int[maxn];
			rank = new int[maxn];
			
			for(int i = 0; i < maxn; i++){
				par[i] = i;
				rank[i] = 0;
			}
		}
		
		//木の根を求める
		int find(int x){
			if(par[x] == x){
				return x;
			}
			else {
				return par[x] = find(par[x]);
			}
		}
		
		// xとyの属する集合を併合
		void unite (int x, int y){
			x = find(x);
			y = find(y);
			if(x == y){
				return;
			}
			
			if(rank[x] < rank[y]){
				par[x] = y;
			}
			else{
				par[y] = x;
				if(rank[x] == rank[y]) rank[x]++;
			}
		}
		
		// xとyが同じ集合に属するか否か
		boolean same(int x, int y){
			return find(x) == find(y);
		}
	}
	
}
