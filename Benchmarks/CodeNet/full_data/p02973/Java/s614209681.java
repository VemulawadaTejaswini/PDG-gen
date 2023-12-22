import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static ArrayList<Integer> li = new ArrayList<Integer>();
	private static ArrayList<Integer> tmp = new ArrayList<Integer>();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int t, org, ans = 0;
		org = in.nextInt();
		for (int i = 1; i < n; i++) {
			t = in.nextInt();
			if (org < t) {
				continue;
			} else {
				li.add(t);
			}
		}
		ans++;
		while (!li.isEmpty()) {
			if (li.size() == 1) {
				ans++;
				break;
			}
			tmp.clear();
			org = li.get(0);
			for (int i = 1; i < li.size(); i++) {
				t = li.get(i);
				if (org < t) {
					continue;
				} else {
					tmp.add(t);
					li.remove(i);
				}
			}
			ans++;
		}
		System.out.println(ans);
		in.close();
	}
}
