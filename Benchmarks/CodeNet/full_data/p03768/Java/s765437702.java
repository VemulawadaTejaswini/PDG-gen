


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;


public class Main {

	public static int[] arr;
	public static int[][] ar2;
	public static List<Integer> list;
	public static int n,m,k;
	private static HashSet<Integer> set;
	private static HashMap<Integer, Integer> map;
	private static  Scanner sc = new Scanner(System.in);
	private static List<List<Integer>> ll;
	private static List<HashSet<Integer>> hList;
	public static HashMap<Integer, HashSet<Integer>> edge ;
	public  static int[] countArr ;
	public static Tupple[] comArr;



	public static void main(String[] args){


		n = sc.nextInt();
		m = sc.nextInt();
		edge = new HashMap<Integer,HashSet<Integer>>();
		for (int i = 0; i < n; i++) {
			edge.put(i+1, new HashSet<Integer>());
		}
		arr = new int[n];
		for (int i = 0; i <m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			edge.get(a).add(b);
			edge.get(b).add(a);
			
			
		}
		
//		List<List<Integer>[]>memo = new ArrayList<List<Integer>[]>();
//		memo.add(new List<Integer>[11]());
//		for (int i = 0; i < n; i++) {
//			memo.add(new ArrayList<>());
//			Deque<Integer> st = new ArrayDeque<Integer>();
//			boolean[] ch = new boolean[n+1];
//			int[] depth = new int[n+1];
//			int v = i+1;
//			st.push(v);
//			ch[v] = true;
//			while(st.size()>0){
//				int cur = st.pollLast();
//				if(depth[cur]>=10)continue;
//				for (Integer j : edge.get(cur)) {
//					if(!ch[j]){
//						st.offerLast(j);
//						ch[j] = true;
//						
//						depth[j] = depth[cur]+1;
//						memo.get(v)
//					}
//				}
//			}
//		}
		
		
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int v = sc.nextInt();
			int d = sc.nextInt();
			int c = sc.nextInt();
			
			arr[v-1] =c;
			if(d==0)continue;
			Deque<Integer> st = new ArrayDeque<Integer>();
			boolean[] ch = new boolean[n+1];
			int[] depth = new int[n+1];
			st.offerFirst(v);
			ch[v] = true;
			while(st.size()>0){
				int cur = st.pollFirst();
				if(depth[cur]>=d)continue;
				for (Integer j : edge.get(cur)) {
					if(!ch[j]){
						st.offerFirst(j);
						ch[j] = true;
						arr[j-1] = c;
						depth[j] = depth[cur]+1;
					}
				}
			}
		}
		


		
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		
	}

	public  static void outputArr(Integer[] ans) {
		StringJoiner join =new StringJoiner(" ");
		//ans.stream().forEach(e->join.add(e.toString()));
		for (int i = 0; i < ans.length; i++) {
			join.add(ans[i].toString());
		}
		System.out.println(join.toString());
	}

	public  static void outputList(List<Integer> ans) {
		StringJoiner join =new StringJoiner(" ");
		ans.stream().forEach(e->join.add(e.toString()));
		System.out.println(join.toString());
	}



}




class array2D{
	public int[][] arr;


	public  array2D(int row, int col) {
		arr = new int[row][col];

		
	}


}

class Tupple{
	public int a=0, b=0;
	public Tupple(int x, int y) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.a = x;
		this.b = y;
	}
	public int first() {
		return this.a;
	}
	public int second() {
		return this.b;
	}
}

class sqrtArr{
	public int[] arr;
	public int n;
	public  sqrtArr(int x , int[] original) {
		this.n = (int)Math.sqrt(x)+1;
		arr = new int[n];
		for(int i=0; i<x; i++){
			arr[i/n] += original[i];
		}
	}

	public int get(int l , int r) {
		int sum =0;

			for(int i=l; i<=r;){
				if(i% n==0 && i+n-1 <=r){
					sum += arr[i/n];
					i += n;
				}
				else {
					sum +=arr[i];
					i++;
				}
			}
		return sum;
	}

}

class UnionFind{
	public int[] path;
	public int[] size;
	public List<HashSet<Integer>> list;

	public  UnionFind (int n, int[] original) {
		path = new int[n+1];
		size = new int[n+1];
		list = new ArrayList<HashSet<Integer>>();
		for(int i=0; i<n; i++){
			path[i] = i;
			size[i] =1;
			list.add(new HashSet<Integer>());
			list.get(i).add(original[i]);
		}
	}
	public  int root(int i){
		while (path[i] != i) {
			path[i] = path[path[path[i]]];
			i = path[i];

		}
		return i;
	}
	public boolean find(int p, int q) {
		if(p<0 || q<0)return false;
		return root(p) == root(q);
	}

	public void uniite(int p, int q) {
		if(p<0 || q<0)return;

		int i = root(p);
		int j = root(q);
		if(i==j)return;

		if(size[i]>size[j]){
//			int tmp = i;l
//			i=j;
//			j = tmp;
			i^=j^=i^=j;
		}
		size[j	] += size[i];
		path[i] = j;
	}
}

class BIT{
	int n;
	private int[] bit = new int[100010];
	public BIT(int x , int[] original){
		this.n = x;
		for(int i=1; i<=n; i++){
			//bit[i] = original[i];
			add(i, original[i]);
		}
	}
	public void  add(int a, int w) {
		for(int i = a; i<=n; i+= i&(-i))bit[i] +=w;
	}
	public int  sum(int a) {
		int sum = 0;
		for(int i=a;i>0; i-=i&(-i)) sum+=bit[i];
		return sum;
	}

	public int binary(int w){
		if(w<=0)return 0;
		int x =0;
		for(int k = n%2==0? n:n-1; k>0; k/=2){
			if(x+k<=n && bit[x+k]<w){
				w -=bit[x+k];
				x += k;
			}
		}
		return x+1;
	}
}


class Segment{
	int n;
	int size ;
private  int[] dat;
	//private HashSet<Integer>[] dat;
	public Segment(int x) {

		this.n = x;
		this.size = x*2;
		dat = new int[size];
		//dat = new HashSet<Integer>[size];
		for(int i=0; i<size;i++){
			dat[i] = Integer.MAX_VALUE;
			//dat[i ] = new HashSet<>();
		}
	}
	public void update(int i, int x) {
		i  = n+i-1;
		dat[i ] = x;
		while (i>0) {
			i =(i-1)/2;
			dat[i] = Math.min(dat[i*2+1], dat[i*2+2]);

		}
	}
	int query(int a, int b, int k, int l, int r){
		if(r<=a || b<=l)return Integer.MAX_VALUE;
		if(a<=l && r<=b)return dat[k];
		else {
			int vl = query(a, b, k*2+1, l, (l+r)/2);
			int vr = query(a, b, k*2+2, (l+r)/2, r);
			return Math.min(vl, vr);
		}
	}


}

class Tree{
	int n,l ;
	private int[][] g;
	private int[] tin,tout;
	int timer;
	private int[][] up;

	public Tree(int n){
		this.n = n;

		tin = new int[n+1];
		tout = new int[n+1];
		timer = 0;
		g= new int[n+1][l];
		up = new int[n+1][l];
		l = 1;
		while ((1 << l) <= n) ++ l;
		//for (int i = 0; i <n; ++ i) up [i] = new int[l+1];
		for(int i=0; i<=n; i++){
			g[i] = new int[l+1];
			up[i]= new int[l+1];

		}
	}

	void dfs (int v, int p) {
		tin [v] = ++ timer;
		up [v] [0] = p;
		for (int i = 1; i <= l; ++ i)
			up [v] [i] = up [up [v] [i-1]] [i-1];
		for (int i = 0; i <g [v].length; ++ i) {
			int to = g [v] [i];
			if (to!= p)
				dfs (to, v);
		}
		tout [v] = ++ timer;
	}

	boolean upper (int a, int b) {
		return tin [a] <= tin [b] && tout [a]>= tout [b];
	}

	int lca (int a, int b) {
		if (upper (a, b)) return a;
		if (upper (b, a)) return b;
		for (int i = l; i>= 0; --i)
			if (! upper (up [a] [i], b))
				a = up [a] [i];
		return up [a] [0];
	}
}


//class Tree{
//	int n,l ;
//	private int[][] g;
//	private int[] tin,tout;
//	int timer;
//	private int[][] up;
//	private int[] parent ;
//
//	public Tree(int n){
//		this.n = n;
//		this.l = (int)Math.pow(2,n);
//		tin = new int[n+1];
//		tout = new int[n+1];
//		timer = 0;
//		parent = new int[n+1];
//		g= new int[n+1][n+1];
//		up = new int[n+1][n+1];
//		for(int i=0; i<=n; i++){
//			g[i] = new int[n+1];
//			up[i]= new int[n+1];
//		}
//	}
//
//	void preprocess(){
//	    //Every element in P[][] is -1 initially;
//	    for(int i = 1 ; i <= n ; ++i){
//	        for(int j = 0 ; (1<<j) < n ; ++i){
//	            g[i][j] = -1;
//	        }
//	    }
//
//	    //The first ancestor(2^0 th ancestor)
//	    //for every node is parent[node]
//	    for(int i = 1 ; i <= n ; ++i){
//	        g[i][0] = parent[i] ;
//	    }
//
//	    for(int j = 1; (1<<j) < n ; ++j){
//	        for(int i = 1 ; i <= n ; ++i){
//	            //If a node does not have a (2^(j-1))th ancestor
//	            //Then it does not have a (2^j)th ancestor
//	            //and hence P[i][j] should remain -1
//	            //Else the (2^j)th ancestor of node i
//	            //is the (2^(j-1))th ancestor of ((2^(j-1))th ancestor of node i)
//	            if(g[i][j-1] != -1){
//	                g[i][j] = g[g[i][j-1]][j-1] ;
//	            }
//	        }
//	    }
//	}

//	int LCA(int u , int v){
//	    if(level[u] < level[v]){
//	        swap(u,v) ;
//	    }
//	    //u is the node at a greater depth/lower level
//	    //So we have to raise u to be at the same
//	    //level as v.
//	    int dist = level[u] - level[v] ;
//	    while(dist > 0){
//	        int raise_by = log2(dist);
//	        u = P[u][raise_by];
//	        dist -= (1<<raise_by) ;
//	    }
//
//	    if(u == v){
//	        return u ;
//	    }
//
//	    //Now we keep raising the two nodes by equal amount
//	    //Untill each node has been raised uptill its (k-1)th ancestor
//	    //Such that the (k)th ancestor is the lca.
//	    //So to get the lca we just return the parent of (k-1)th ancestor
//	    //of each node
//
//	    for(int j = MAXLOG ; j >= 0 ; --j){
//	        //Checking P[u][j] != P[v][j] because if P[u][j] == P[v][j]
//	        //P[u][j] would be the Lth ancestor such that (L >= k)
//	        //where kth ancestor is the LCA
//	        //But we want the (k-1)th ancestor.
//	        if((P[u][j] != -1) and (P[u][j] != P[v][j])){
//	            u = P[u][j] ;
//	            v = P[v][j] ;
//	        }
//	    }
//	    return parent[u] ; //or parent[v]
//	}
//}

class sparseTable {
	int[] A, log_table;
	int[][] table;
	int N;

	public sparseTable(int[] A) {
		N = A.length;
		this.A = Arrays.copyOf(A, N);


		//log_tableを前処理で作っておくことでクエリ処理時にO(1)でlogを計算できる
		log_table = new int[N + 1];
		for(int i = 2;i < N + 1;i++){
			log_table[i] = log_table[i >> 1] + 1;
		}


		table = new int[N][log_table[N] + 1];


		//table[i][2^0] = i番目の要素から長さ1の区間の最小値はA[i](A[i]自身か含まないので)
		for (int i = 0; i < N; i++) {
			table[i][0] = i;
		}
		for (int k = 1;(1 << k) <= N; k++) {
			for (int i = 0; i + (1 << k)<=  N; i++) {
				int first = table[i][k - 1];//前部分
				int second = table[i + (1 << (k - 1))][k - 1];//後部分

				//前部分の最小値と後部分の最小値を比較して、より小さいものを採用する
				if (A[first] < A[second]) {
					table[i][k] = first;
				} else {
					table[i][k] = second;
				}

			}
		}
	}

	public int query(int s, int t) {
		//区間の長さ
		int d = t - s + 1;
		//logの計算
		int k = log_table[d];

		if (A[table[s][k]] < A[table[t - (1 << k) + 1][k]]) {
			return table[s][k];
		} else {
			return table[t - (1 << k) + 1][k];
		}
	}
}

