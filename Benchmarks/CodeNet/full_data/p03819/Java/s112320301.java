import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] l = new int[N];
		int[] r = new int[N];
		for (int i = 0; i < N; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}
		sc.close();

		int[] cnt = new int[M + 1];
		int[] low = new int[M + 1];
		for (int i = 0; i < N; i++) {
			int div = 1;
			int min_min = r[i] - l[i] + 2;
			int last_min = M + 1;
			while (true) {
				int min = Math.max((l[i] + div - 1) / div, min_min);
				int max = Math.min(r[i] / div + 1, last_min);
				for (int j = min; j < max; j++) {
					cnt[j]++;
				}
				if (min <= min_min) {
					low[min - 1]++;
					break;
				}
				last_min = min;
				div++;
			}
		}
		int a = 0;
		for (int i = M; i >= 1; i--) {
			a += low[i];
			cnt[i] += a;
		}
		StringBuffer buf = new StringBuffer();
		for (int i = 1; i <= M; i++) {
			buf.append(cnt[i]);
			buf.append("\n");
		}

		System.out.println(buf.toString());
	}
}
