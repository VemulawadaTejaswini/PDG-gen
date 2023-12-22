import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();

		TreeSet<Integer> idxSet = new TreeSet<Integer>();
		for (int i = 0; i < n - 1; i++) {
			if (s.charAt(i) == 'A' && s.charAt(i + 1) == 'C') {
				idxSet.add(i + 1);
			}
		}

		for (int i = 0; i < q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			Set<Integer> set = idxSet.subSet(l, r);
			System.out.println(set.size());
		}
		sc.close();

	}
}
