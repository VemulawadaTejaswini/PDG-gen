import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		List<Set<Integer>> list = new ArrayList<Set<Integer>>();
		for (int i = 0; i < M; i++) {
			int k = sc.nextInt();
			Set<Integer> set = new HashSet<Integer>();
			for (int j = 0; j < k; j++) {
				set.add(sc.nextInt());
			}
			list.add(set);
		}
		int p[] = new int[M];
		for (int i = 0; i < M; i++) {
			p[i] = sc.nextInt();
		}
		int pattern = (int) (Math.pow(2, N));
		int result = 0;
		for (int i = 0; i < pattern; i++) {
			if (Main.check(i, list, p) == true) {
				result++;
			}
		}
		System.out.print(result);
	}

	public static boolean check(int pattern, List<Set<Integer>> list, int p[]) {
		boolean b = true;
		for (int i = 0; i < p.length; i++) {
			Set<Integer> set = list.get(i);
			int num = 1;
			int count = 0;
			int temp = pattern;
			while (temp > 0) {
				if (temp % 2 == 1) {
					if (set.contains(num) == true) {
						count++;
					}
				}
				temp /= 2;
				num++;
			}
			if (count % 2 != p[i]) {
				return false;
			}
		}
		return true;

	}
}