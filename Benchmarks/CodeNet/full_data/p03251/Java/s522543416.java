import java.util.Arrays;
import java.util.Scanner;

class Main{

	static char[][] map;
	static int H;
	static int W;
	static	int D ;
	static	int G ;
	static	int[] p;
	static	int[] c;
	static int ans = 100000000;

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int[] x = new int[N];
		int[] y = new int[M];

		for(int i = 0;i < N;i++){
			x[i] = sc.nextInt();
		}
		for(int i = 0;i < M;i++){
			y[i] = sc.nextInt();
		}

		Arrays.sort(x);
		Arrays.sort(y);
		for(int i = X+1;i <= Y;i++){
			if(x[N-1] <= i && y[0] >= i){
				System.out.println("No War");
				return;
			}

		}
		System.out.println("War");



	}



}



