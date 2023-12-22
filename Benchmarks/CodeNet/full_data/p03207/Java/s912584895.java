import java.util.Arrays;
import java.util.Scanner;

class Main{
	static final long MOD = 1000000007;

	static int H, W, K;
	static long[][] dp = new long[110][10];
	static int ans = 0;
	static int n = 0;


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int[] p = new int[n];
		for(int i = 0;i < n;i++){
			p[i] = sc.nextInt();

			
		}
		
		Arrays.sort(p);
		int ans = 0;
		ans += p[n-1]/2;
		for(int i= 0;i < n-1;i++){
			ans += p[i];
			
		}
		System.out.println(ans);
		
		


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
