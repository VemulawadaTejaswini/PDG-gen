import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong(), K = sc.nextLong();
		long[] mon = new long[(int)N];
		for(int i = 0; i < N; i++) {
			mon[i] = sc.nextLong();
		}
		Arrays.sort(mon);
		if(N<=K) {
			System.out.println(0);
		}else {
			for(int j = (int)N-1; j >= N-K; j--) {
				mon[j] = 0;
			}
			long sum = Arrays.stream(mon).sum();
			System.out.println(sum);
		}
	}
}