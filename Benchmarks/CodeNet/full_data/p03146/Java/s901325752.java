import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	private static int[] a;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int s = Integer.parseInt(br.readLine());
		br.close();

		Set<Integer> aSet = new HashSet<Integer>();
		aSet.add(s);
		a = new int[1000001];
		a[1] = s;
		for (int i = 2; i <=1000000; i++) {
			a[i] = ai(i);
			boolean flg = aSet.add(a[i]);
			if (!flg) {
//				for (int j = 0; j <= i; j++) {
//					System.out.print(a[j] + " ");
//				}
//				System.out.println();
				System.out.println(i);
				break;
			}
		}
	}

	private static int fn (int n) {
		if (n % 2 == 0) {
			return n / 2;
		} else {
			return 3 * n + 1;
		}
	}

	private static int ai (int i) {
		if (i == 1) {
			return a[1];
		} else {
			return fn(ai(i - 1));
		}
	}
}
