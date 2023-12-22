import java.util.*;
import java.util.stream.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] p = new int[N];
		for (int i = 0; i < N; i++) {
			p[i] = in.nextInt();
		}
		Arrays.sort(p);
		p[N - 1] /= 2;
		int ans = 0;
		for (int num : p) {
			ans += num;
		}
		System.out.println(ans);
	}
}
