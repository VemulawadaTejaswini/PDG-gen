import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int MOD = 1000000007;
		//配列の長さ
		int N = Integer.parseInt(sc.next());
		//配列の繰り返し回数
		int K = Integer.parseInt(sc.next());
		int count = 0;
		int ary[] = new int[N];
		int aryk[] = new int[N * K];
		int ans = 0;
		
		
		for(int i = 0; i < N; i++) {
			ary[i] = Integer.parseInt(sc.next());
		}
		
		for(int i = 0; i < K; i++) {
			for(int y = 0; y < N; y++) {
				aryk[count] = ary[y];
				count ++;
			}
		}
		for(int i = 1; i <= N * K; i++) {
			for(int z = 0; z < N * K - i; z++) {
				if(aryk[z] > aryk[z + 1]) {
					int a = aryk[z + 1];
					aryk[z + 1] = aryk[z];
					aryk[z] = a;
					ans ++;
				}
			}
		}
		System.out.println(ans % MOD);
	}
}
