import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String[] aline = br.readLine().split(" ");

		ArrayList<Integer> alist = new ArrayList<Integer>(n);
		ArrayList<Integer> difflist = new ArrayList<Integer>(n);

		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(aline[i]);
			alist.add(a);
			difflist.add(a - (i + 1));
		}

		Collections.sort(difflist);

		if (n % 2 == 1) {
			int d = difflist.get(n / 2 + 1);
			int minsad = 0;
			for (int i = 0; i < n; i++) {
				minsad += Math.abs(alist.get(i) - (d + i + 1));
			}
			System.out.println(minsad);
		} else {
			int d1 = difflist.get(n / 2);
			int d2 = difflist.get(n / 2 + 1);
			int minsad1 = 0;
			int minsad2 = 0;
			for (int i = 0; i < n; i++) {
				minsad1 += Math.abs(alist.get(i) - (d1 + i + 1));
				minsad2 += Math.abs(alist.get(i) - (d2 + i + 1));
			}
			System.out.println(Math.min(minsad1, minsad2));
		}

	}

}