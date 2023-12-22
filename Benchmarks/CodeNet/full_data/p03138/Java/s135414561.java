
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextLong();
		long X = 0;
		long[] list = new long[N];
		int[] zerolist = new int[64];
		int[] onelist = new int[64];
		for(int i = 0; i < N; i++) {
			zerolist[i] = 0;
			onelist[i] = 0;
		}
		for(int i = 0; i < N; i++) {
			long A = sc.nextLong();
			list[i] = A;
			for(int j = 0; j < 64; j++) {
				long swich = A & 1;
				if(swich != 0) {
					onelist[j]++;
				} else {
					zerolist[j]++;
				}
				A = A >> 1;
			}
		}
		for(int i = 63; i > -1; i--) {
			X = X << 1;
			if(zerolist[i] > onelist[i]) {
				X = X ^ 1;
			}
		}
		X = X & K;
		long ans = 0;
		for(int i = 0; i < N; i++) {
			ans += X ^ list[i];
		}
		System.out.println(ans);
	}

}
