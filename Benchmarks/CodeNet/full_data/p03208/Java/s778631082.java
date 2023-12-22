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
		int k = sc.nextInt();
		int[] h = new int[n];
		for(int i = 0;i < n;i++){
			h[i] = sc.nextInt();
					
		}
		Arrays.sort(h);
		long ans = 1000000000;
		for(int i = 0;i + k -1 < n;i++){
			ans = Math.min(ans, h[i+k-1] - h[i]);
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
