import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int[] H = new int[N];
		for (int i = 0; i < N; i++) {
			H[i] = sc.nextInt();
		}
		Arrays.sort(H);
		int l = 0;
		int r = H[N - 1] % B == 0 ? H[N - 1] / B : H[N - 1] / B + 1;
		while (r - l > 1) {
			long cnt = 0;
			int m = (r + l) / 2;
			for (int i = 0; i < N; i++) {
				int diff = H[i] - B * m;
				if(diff > 0){
					cnt += diff / (A - B);
					if (diff % (A - B) > 0) {
						cnt++;
					}
				}
			}
			if (cnt > m) {
				l = m;
			} else {
				r = m;
			}
		}
		System.out.println(r);
	}
}