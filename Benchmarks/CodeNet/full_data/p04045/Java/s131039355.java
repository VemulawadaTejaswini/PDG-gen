import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		int[] d = new int[k];
		for (int i = 0; i < k; i++) {
			d[i] = sc.nextInt();
		}
		for (int i = n;; i++) {
			int x = i;
			outside: while (x != 0) {
				for (int j = 0; j < k; j++) {
					if (x % 10 == d[j])
						break outside;
				}
				x /= 10;
				if (x == 0) {
					System.out.println(i);
					return;
				}
			}
		}
	}
}