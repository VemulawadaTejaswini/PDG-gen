import java.util.ArrayList;
import java.util.Scanner;

class Main{

	static	int count = 0;
	public static void main(String[] args) {



		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int R = scanner.nextInt();

		ArrayList<Integer> stack = new ArrayList<Integer>();
		int[] r = new int[R];
		for(int i= 0;i <  R;i++){
			r[i] = scanner.nextInt();
				stack.add(r[i]);
			
		}

		int[] A = new int [M+1];
		int[] B = new int [M+1];
		int[] C = new int [M+1];

		int[][] dp =  new int[N+1][N+1];

		for(int i =1 ;i < M+1;i++){
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();

			dp[a][b] = c;
			dp[b][a] = c;

		}
		


		for(int k = 1;k < N+1;k++){
			for(int i = 1;i < N+1;i++){
				for(int j = 1;j < N+1;j++){
					dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k][j]);
				}
			}
		}

		

		int ans =0;
		
		

		int p = stack.get(0);				//現在のいち
		stack.remove(0);

		for(int i = 0;i < R-1;i++){

			
			int sub = 1000000;
			int num = 0;
			for(int j = 0;j < stack.size();j++){
				
				int key = sub;
				sub = Math.min(sub, dp[p][stack.get(j)]);
				if(key != sub){
					num = j;
				}		
			}
			p = stack.get(num);
			stack.remove(num);
			
			ans += sub;
		}

		System.out.println(ans);


	}
}

class Pair implements Comparable{
	int from;
	int middle;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}



