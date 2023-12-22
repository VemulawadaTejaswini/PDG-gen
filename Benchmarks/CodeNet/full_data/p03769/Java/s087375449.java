import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		ArrayList<Integer> res = new ArrayList<Integer>();
		int k;
		for (k = 40; k >= 0; k--) {
			if (n >= (1 << k) - 1) break;
		}
		for (int i = 1; i <= k; i++) res.add(i);
		n -= (1 << k) - 1;
		for (int i = k - 1; i >= 0; i--) {
			if (n < 1 << i) continue;
			k++;
			res.add(i, k);
			n -= 1 << i;
		}
		System.out.println(2 * res.size());
		for (int x : res) System.out.print(x + " ");
		for (int x : res) System.out.print(x + " ");
		System.out.println();
	}
}

