import java.io.StringReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {
	// LRRLRLRRLRLLR
	// LLLRLRLLRLRRR
	// LLLLRLRRLRRRR
	// LLLLLRLLRRRRR
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.nextLine();
		List<Boolean> list = new ArrayList<Boolean>();

		int count = 0;
		for (String s : sc.nextLine().split("")) {
			if ("L".equals(s)) {
				list.add(Boolean.TRUE);
			} else {
				list.add(Boolean.FALSE);
			}
			count++;
		}
		int size = list.size();
		boolean l = list.get(0);
		boolean r = list.get(size - 1);
		for (int i = 0; i < k; i++) {
			// 一番左の異なるやつ
			int s = list.indexOf(!l);
			// 一番右の異なるやつ
			int e = list.lastIndexOf(!r);
			if (e < s) {
				s = 0;
				for (int j = s; j <= e; j++) {
					list.set(j, !list.get(j));
				}
				break;
			}
			for (int j = s; j <= e; j++) {
				list.set(j, !list.get(j));
			}
		}
		boolean bb = list.get(0);
		int ans = 0;
		for (int i = 1; i < size; i++) {
			boolean b = list.get(i);
			if (bb == b) {
				ans++;
			}
			bb = b;
		}
		System.out.println(ans);
	}
}
