import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextInt();
		long a[] = new long[N];
		long b[] = new long[N];
		long sum = 0;
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextLong();
			b[i] = sc.nextLong();
			sum += b[i];
			if(K <= sum) {
				System.out.println(a[i]);
				return;
			}
		}
	}
}
