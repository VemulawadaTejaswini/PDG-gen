import java.util.Arrays;
import java.util.Scanner;

class Main{
	static final long MOD = 1000000007;

	static int H, W, K;
	static long[][] dp = new long[110][10];
	static int ans = 0;
	static long n = 0;




	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int m  =sc.nextInt();
		int X  = sc.nextInt();
		int Y = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[m];
		for(int i = 0;i< n;i++){
			x[i] = sc.nextInt();
		}
		Arrays.sort(x);
		for(int i = 0;i < m;i++){
			y[i] = sc.nextInt();
		}
		Arrays.sort(y);

		for(int i = X+1;i < Y;i++){
			if(x[n-1] < i && i <= y[0]){
				System.out.println("No War");
				return;
			}
		}
		
		System.out.println("War");

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

		return end - otherpair.end;
	}
}

