import java.util.ArrayList;
import java.util.Scanner;

class Main{

	static int N;
	static int M;
	static 		ArrayList<ArrayList<Integer>> map;
	static boolean[] used;
	static int f = 0;
	static int s = 0;

	static int mindis = 1000000000;
	static ArrayList<Integer> saitan;




	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);			//文字の入力
		N = sc.nextInt();
		long sum = 0;

		map = new ArrayList<ArrayList<Integer>>();
		for(int i = 0;i <= N;i++){								//初期値入力
			ArrayList<Integer> x = new ArrayList<Integer>();
			x.add(0);
			map.add(x);
		}

		for(int i = 0;i < N-1;i++){							//mapの作成
			int a = sc.nextInt();
			int b = sc.nextInt();
			map.get(a).add(b);
			map.get(b).add(a);
		}
		
		int[] dataf = new int[N+1];
		dataf	= dfs(1,-1,dataf);
		int[] datas = new int[N+1];
		datas	= dfs(N,-1,datas);

		int a = 0;
		int b= 0;
		
		for(int i= 1;i < N+1;i++){				//距離が近い方が結局は近い方の色になるので、それぞれの辺についてどちらが近いかみる
			if(dataf[i] <= datas[i]){
				a++;

			}else{
				b++;
			}

		}
		if(a > b){
			System.out.println("Fennec");
		}else{
			System.out.println("Snuke");
		}

	}

	static int[] dfs(int p,int back, int[] data){				//始点からそれぞれの辺までの距離を求める
		//pは現在地、backは一個前の場所
		
		ArrayList<Integer> edge = map.get(p);				//辺のリスト
		for(int v : edge){
			if(v != back){									//一個前と今の辺は繋がっているので無限ループに入るのを防ぐ
				data[v] = data[p] + 1;
				dfs(v, p, data);
			}

		}
		return data;

	}





}


