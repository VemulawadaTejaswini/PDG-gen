import java.util.Scanner;

class Main{

	static char[][] map;
	static int H;
	static int W;

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
		int N = sc.nextInt();
		long[] A = new long[N+1];
		long ans =0 ;

		for(int i=1;i<N+1;i++){
			A[i] = sc.nextInt();

		}
		long[][] memo = new long[N+1][N+1];
		for(int i = 1;i <= N;i++){
			for(int j = i;j <= N;j++){
				memo[i][j] = memo[i][j-1]+A[j];
			}
		}

		long[][] xor = new long[N+1][N+1];
		for(int i = 1;i <= N;i++){
			for(int j = i;j <= N;j++){
				xor[i][j] = xor[i][j-1]^A[j];
			}
		}

		for(int i = 1;i <= N;i++){
			for(int j = i;j <= N;j++){
				if(memo[i][j] == xor[i][j]){
//					System.out.println("i "+i+" j "+j);
//
//					System.out.println("memo "+memo[i][j]);
//					System.out.println("xor "+xor[i][j]);

					ans++;
				}
			}

		}

		System.out.println(ans);

	}
}




class Pair implements Comparable{
	String from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}



