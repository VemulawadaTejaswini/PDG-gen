import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
class Main{


	static final int MOD = 1000000007;


	static int ans = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力

		//方針
		//数字とindexをpairとかで持っておき、数字ソート
		//loop
		//大きい順に、自分より大きい数字を一つ含む時の左と右の候補を計算
		//Treesetに自分のindexを入れる
		//loop


		int n = sc.nextInt();
		Edge[] edges = new Edge[n];


		for(int i = 0;i < n;i++){
			Edge edge = new Edge(i);
			edges[i] = edge;
		}
		int[] adata = new int[n-1];
		int[] bdata = new int[n-1];

		for(int i = 0;i < n-1;i++){
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			edges[a].hen.add(b);
			edges[b].hen.add(a);


			adata[i] = a;
			bdata[i] = b;
		}

		//		Arrays.sort(edges);
		//		for(int i = 0;i < n-1;i++){
		//			System.out.println(edges[i].index);
		//		}
		boolean[] color = new boolean[n];


		for(int i = 0;i < n;i++){
			if(edges[i].hen.size() > 0){
				
				for(int connect:edges[i].hen){			//繋がっている辺
//System.out.println("i " + i + "cc "+connect);
					for(int j = 0;j < n;j++){					//小さい順に色を使えるか判定
						if(!edges[i].used.contains(j) && !edges[connect].used.contains(j)){
//							System.out.println("i " + i + " j " + j + " connect " + connect);

							edges[i].hen.remove(connect);			//辺の削除
							edges[connect].hen.remove(i);


							edges[i].map.put(connect, j+1);				//決定した色の追加
							edges[connect].map.put(connect, j+1);
							
							color[j] = true;

							edges[i].used.add(j);				//使った色の記録
							edges[connect].used.add(j);
							break;
						}
					}
				}
			}
		}

		int k = 0;
		for(int i = 0;i < color.length;i++){
			if(color[i]){
				k = i;
			}
		}
		System.out.println(k+1);
		
		for(int i = 0;i < n-1;i++){
			System.out.println(edges[adata[i]].map.get(bdata[i]));
		}



	}

	static boolean ok(ArrayList<ArrayList<Integer>> queues){
		for(int i = 0;i < queues.size();i++){
			if(queues.get(i).size() != 0){
				return false;
			}
		}
		return true;

	}


	static void sieve(ArrayList<Long> list){
		int n = 50000000;
		boolean[] is_prime = new boolean[n+1];
		int[] prime = new int[n];
		for(int i= 0;i <=n;i++){
			is_prime[i] = true;
		}
		list.add((long) 1);
		for(int i = 2;i <= n;i++){
			if(is_prime[i]){
				list.add((long)i);
				for(int j = 2*i;j <= n;j+=i){
					is_prime[j] = false;
				}
			}
		}



	}




	static int upperbond(int k,int min,int[] data){		//kより小さい最大の値をdataの中から探し、返す二分探索
		int max = data.length;
		//		if(min == data.length-1){
		//			if(data[min] > k){
		//				return min;
		//			}
		//		}

		while(max-min > 1){
			int mid = (max+min)/2;
			if(data[mid] >= k){
				max = mid;
			}else{
				min = mid;
			}
		}

		return max;
	}

	static int lowerbond(int k,int min,int[] data){		//kより大きい最小の値をdataの中から探し、返す二分探索
		int max = data.length;

		while(max-min > 1){
			int mid = (max+min)/2;
			if(data[mid] >= k){
				max = mid;
			}else{
				min = mid;
			}
		}
		return min;
	}



	static int gcd(int a,int b){				//最大公約数を返す
		if(b == 0){
			return a;
		}else{
			return gcd(b, a%b);
		}
	}
	static long gcd(long a,long b){
		if(b == 0){
			return a;
		}else{
			return gcd(b, a%b);
		}
	}



	static long lcm (long a, long b) {
		long g = gcd(a,b);
		return a/g*b;
	}




}

class Town{
	int index;
	int x ;
	int y;
	public Town(int index,int x,int y) {
		this.index = index;
		this.x = x;
		this.y = y;
		// TODO 自動生成されたコンストラクター・スタブ
	}


}


class Edge  implements Comparable{

	int index;
	HashSet<Integer> hen;
	HashSet<Integer> used;
	HashMap<Integer, Integer> map;


	public Edge(int index) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.index = index;
		hen = new HashSet();
		used = new HashSet<Integer>();
		map = new HashMap<Integer,Integer>();
	}

	public int compareTo(Object other) {
		Edge otherpair = (Edge)other;

		return   otherpair.hen.size() - hen.size();
	}
}

class P{
	int to;
	long cost;
	P(int to,long cost){
		this.to = to;
		this.cost = cost;
	}
}

class Pair implements Comparable{
	int from;
	int end;
	public Pair(int from,int end) {
		this.from = from;
		this.end = end;
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return   otherpair.from - from;
	}








}




