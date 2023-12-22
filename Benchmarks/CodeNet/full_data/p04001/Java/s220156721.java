import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder s = new StringBuilder(sc.next());
		int prei = -1;
		long cnt = 0;
		long sum = 0;
		for (int bit = 0; bit < (1 << (s.length() - 1)); bit++) {
			for (int i = 0; i < s.length() - 1; i++) {
				if ((bit & (1 << i)) != 0) {
					cnt += Long.parseLong(s.substring(s.length() - 1 - i, s.length() - 1 - prei));
					prei = i;
				}
			}
			cnt += Long.parseLong(s.substring(0, s.length() - 1 - prei));
			prei = -1;
			sum += cnt;
			cnt = 0;
		}
		System.out.println(sum);
	}

}
