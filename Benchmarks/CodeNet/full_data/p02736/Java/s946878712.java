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

		while (list.size() > 1) {
			List<Integer> work = new ArrayList<>(list.size());
			boolean zero = false;
			for (int i = 1; i < list.size(); i++) {
				int val = Math.abs(list.get(i - 1) - list.get(i));
				if (val == 0) {
					if (!zero) {
						work.add(val);
						zero = true;
					}
				} else {
					work.add(val);
					zero = false;
				}
			}
			list = work;
		}
		System.out.println(list.get(0));
	}
}
