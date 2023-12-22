import java.util.ArrayList;
import java.util.Scanner;

class Main{
	static int[][] dp;




	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		int[] p = new int[n];

		for(int i = 0;i < n;i++){
			list.add(new ArrayList<Integer>());
		}
		for(int i = 0;i < m;i++){
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			list.get(x).add(y);
			p[y]++;
		}
		ArrayList<Integer> q = new ArrayList<Integer>();
		for(int i = 0;i < n;i++){				//誰からも繋がり先でない町(親ノード)を見つける
			if(p[i] == 0){
				q.add(i);
			}
		}
		int[] dp = new int[n];
		for(int i = 0;i < q.size();i++){
			int parent = q.get(i);
			for(int child : list.get(parent)){		//親ノードから繋がっている町を探す
				dp[child] = Math.max(dp[child], dp[parent]+1);
				p[child]--;					//親ノードからの矢印をなくす
				if(p[child] == 0){			//どこからも繋がり先出なくなったら親ノードになる
					q.add(child);			
				}
			}
		}
		int ans = 0;
		for(int i = 0;i < n;i++){
			ans = Math.max(ans,dp[i]);
		}
		System.out.println(ans);
		
		
		
		
		//		for(int i = 0;i < m;i++){
		//			int x = sc.nextInt();
		//			int y  = sc.nextInt();
		//			dp[x+1][y+1]++;
		//		}



	}

	//	static int dfs(int x, int y){
	//		
	//		
	//		
	//		
	//	}
}







class Pair implements Comparable{
	int from;		//p
	int end;		//y
	int num;
	int bango;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}

