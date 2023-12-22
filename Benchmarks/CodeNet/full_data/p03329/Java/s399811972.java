import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		ArrayList<Integer> opelist = new ArrayList<Integer>();
		for (int i = 1; Math.pow(6, i) <= n; i++) {
			opelist.add((int) Math.pow(6, i));
		}
		for (int i = 1; Math.pow(9, i) <= n; i++) {
			opelist.add((int) Math.pow(9, i));
		}

		Collections.sort(opelist, Comparator.reverseOrder());

		AtomicInteger mincount = new AtomicInteger(9999999);
		search(n, n, opelist, 0, mincount);

		System.out.println(mincount);

	}

	private static void search(int nd, int n, ArrayList<Integer> list, int count, AtomicInteger mincount) {

		if (list.size() == 0) {
			mincount.set(Math.min(mincount.get(), count + n));
			return;
		}

		for (int i = 0; i < list.size(); i++) {
			int q = n / list.get(i);
			ArrayList<Integer> copylist = new ArrayList<Integer>(list);
			copylist.remove(i);
			search(nd, n, copylist, count, mincount);
			if (0 < q) {
				count += q;
				search(nd, n - list.get(i) * q, copylist, count, mincount);
			}
		}
	}

}