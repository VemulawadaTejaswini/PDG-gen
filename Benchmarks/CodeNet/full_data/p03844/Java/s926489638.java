import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final long N = sc.nextLong();
		long cnt = 0;
		long u, v, a, x;
		for(u = 0; u <= N; u++) {
			for(v = u; v <= N; v++) {
				for(a = 0; a <= v / 2; a++) {
					x = a ^ v - a;
					if(x == u) {
						cnt++;
						break;
					}
				}
			}
		}
		cnt = cnt % (1000000000 + 7);
		System.out.println(cnt);
	}
}