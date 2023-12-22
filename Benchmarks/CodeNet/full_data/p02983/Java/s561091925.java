import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int l = in.nextInt();
		int r = in.nextInt();
		
        int mod = 2019;
		// 2019の倍数が必ずある場合
		if(r-l >= mod) {
			System.out.println(0);
			in.close();
			return;
		}

		long min = Long.MAX_VALUE;
		long remain = 0;
		for ( long i = l; i < r; i++ ) {
			for ( long j = i + 1; j <= r; j++ ) {
				remain = i * j % mod;
				min = remain < min ? remain : min;
			}
		}
		System.out.println(min);
		in.close();
	}
}