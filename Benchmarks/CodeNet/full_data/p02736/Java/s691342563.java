import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		String s = br.readLine();
		List<Integer> list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(s.charAt(i) - '0');
		}
		br.close();

		while (list.size() > 5) {
			List<Integer> work = new ArrayList<>(list.size());
			work.add(Math.abs(list.get(0) - list.get(1)));
			work.add(Math.abs(list.get(1) - list.get(2)));
			int now = Math.abs(list.get(2) - list.get(3));
			int cnt = 1;
			for (int i = 4; i < list.size() - 2; i++) {
				int val = Math.abs(list.get(i - 1) - list.get(i));
				if (val == now) {
					cnt++;
				} else {
					if (cnt == 1) {
						work.add(now);
					} else {
						work.add(0);
					}
					now = val;
					cnt = 1;
				}
			}
			if (cnt == 1) {
				work.add(now);
			} else {
				work.add(0);
			}
			work.add(Math.abs(list.get(list.size() - 3) - list.get(list.size() - 2)));
			work.add(Math.abs(list.get(list.size() - 2) - list.get(list.size() - 1)));
			list = work;
		}
		while (list.size() > 1) {
			List<Integer> work = new ArrayList<>(list.size());
			for (int i = 1; i < list.size(); i++) {
				work.add(Math.abs(list.get(i - 1) - list.get(i)));
			}
			list = work;
		}
		System.out.println(list.get(0));
	}
}
