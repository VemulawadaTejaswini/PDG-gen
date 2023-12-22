import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] nk = br.readLine().split(" ");
		int n = Integer.parseInt(nk[0]);
		int k = Integer.parseInt(nk[1]);
		String[] xline = br.readLine().split(" ");

		ArrayList<Integer> list = new ArrayList<Integer>(k);
		int cur = Integer.parseInt(xline[0]);
		int min = 999999999;
		int kcopy = k;

		for (int i = 0; i < n; i++, kcopy--) {
			cur = Integer.parseInt(xline[i]);
			if (0 < kcopy) {
				list.add(cur);
				if (k == 1)
					min = Math.min(min, Math.abs(cur));
			} else {
				if (k == 1) {
					min = Math.min(min, Math.abs(cur));
				} else {
					int first = list.get(0);
					int last = list.get(list.size() - 1);
					if (Math.abs(first) < Math.abs(last)) {
						min = Math.min(min, Math.abs(first) + Math.abs(first - last));
					} else {
						min = Math.min(min, Math.abs(last) + Math.abs(first - last));
					}
				}
				list.remove(0);
				list.add(cur);
			}
		}

		System.out.println(min);

	}

}