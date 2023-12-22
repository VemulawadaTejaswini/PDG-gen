import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long[] sum = new long[N];

		long[] xyz = new long[3*N];
		for(int i=0; i<(int)3*N; i++) {
			xyz[i] = Math.abs(sc.nextLong());
		}

		for(int j=0; j<N; j++) {
			sum[j] += xyz[3*j] + xyz[3*j+1] + xyz[3*j+2];
		}Arrays.sort(sum);

		int ans = 0;

		for(int k=0; k<M; k++) {
			ans += sum[N-1-k];
		}

		System.out.println(ans);

	}

}
