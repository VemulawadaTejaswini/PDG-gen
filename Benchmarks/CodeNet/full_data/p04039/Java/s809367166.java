import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		solver();
	}

	static void solver() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] d = new int[k];
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < k; i++) {
			d[i] = sc.nextInt();
			set.add(d[i]);
		}
		while (true) {
			int tmp = n;
			while (tmp > 1) {
				if (set.contains(tmp % 10)) {
					break;
				}
				tmp /= 10;
			}
			if (tmp == 0) {
				System.out.println(n);
				return;
			}
			n++;
		}
	}
}
