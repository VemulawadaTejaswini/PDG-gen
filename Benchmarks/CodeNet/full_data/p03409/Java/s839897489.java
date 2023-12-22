import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();

		ArrayList<Pair> pairs = new ArrayList<Pair>();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0;i < n;i++){
			Pair pair = new Pair();
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			pair.from = a[i];
			pair.end = b[i];
			pair.num = 0;
			pairs.add(pair);
		}
		int[] c = new int[n];
		int[] d = new int[n];
		for(int i = 0;i < n;i++){
			Pair pair = new Pair();
			c[i] = sc.nextInt();
			d[i] = sc.nextInt();
			pair.from = c[i];
			pair.end = d[i];
			pair.num = 1;
			pairs.add(pair);
		}
		Collections.sort(pairs);

		//		for(int i = 0;i < pairs.size();i++){
		//			System.out.print(pairs.get(i).from + " " + pairs.get(i).end + " ");
		//			if(pairs.get(i).num == 0){
		//				System.out.println("Red");
		//			}else{
		//				System.out.println("Blue");
		//
		//			}
		//		}

		int ans = 0;
		for(int i = 0;i < pairs.size();i++){
			if(pairs.get(i).num == 0){
				int x = pairs.get(i).from;
				int y  =pairs.get(i).end;

				int suby = 10000;
				for(int j = i+1;j < pairs.size();j++){					//ペアの更新
					if(pairs.get(j).num == 1){
						if(pairs.get(j).from > x && pairs.get(j).end > y && pairs.get(j).end < suby){
							suby = pairs.get(j).end ;
						}
					}
				}
				if(suby != 10000){
					ans++;
					for(int j = i+1;j < pairs.size();j++){					//ペアの発見、削除
						if(pairs.get(j).num == 1){
							if(pairs.get(j).from > x &&suby == pairs.get(j).end){
								pairs.remove(j);
								break;
								//							System.out.println(pairs.get(j).from + " "+pairs.get(j).end);							pairs.remove(j);

							}
						}
					}
				}
				//System.out.println("suby "+suby);
				

			}
			pairs.remove(0);
			i--;
		}
		System.out.println(ans);




	}



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

