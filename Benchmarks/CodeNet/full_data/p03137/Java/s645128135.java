import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] x = new int[m];

		for(int i = 0;i < m;i++){
			x[i] = sc.nextInt();
		}
		Arrays.sort(x);

		ArrayList<Pair> pairs = new ArrayList<Pair>();
		int[] dis = new int[m];
		for(int i = 0;i < m-1;i++){
			dis[i] = x[i+1]-x[i];
		}
		Arrays.sort(dis);
		long ans = 0;
			for(int i = 0;i <m-(n+1)/2;i++){

				ans += dis[i];
			}
		
		if(m == 1){
			ans += dis[0];
		}


		System.out.println(ans);

	}


	static int lowerbond(long k, long[] data){		//kより小さい最小の値をdataの中から探し、返す二分探索
		int min = 0;
		int max = data.length-1;

		while(max-min >= 0){
			int mid = (max+min)/2;
			if(data[mid] >= k){
				max = mid-1;
			}else{
				min = mid+1;
			}
		}
		return min;
	}









	class UnionFind{
		int[] parent;
		public UnionFind(int N){
			this.parent = new int[N];
			for(int i = 0; i < N;i++){
				parent[i] = i;
			}
		}
		public int root(int x){			//根要素を取得
			if(parent[x] == x){			//初期状態
				return x;
			}else{
				return parent[x] = root(parent[x]);    	//再帰によって根を取得
			}
		}
		public void unite(int x,int y){ 	//統合メソッド
			if(same(x,y)){					//同じ根なら終了
				return;
			}
			int xroot = root(x);
			int yroot = root(y);
			parent[xroot] = yroot;			//統合
			return;

		}

		public boolean same(int x,int y){			//根が同じか（同じグループに属しているか）を判定
			return(root(x) == root(y));
		}
	}

}

class Pair implements Comparable{
	int from;		//p
	int end;		//y
	int num;
	int bango;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return from - otherpair.from;
	}
}

