import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);
		Hen[] arr = new Hen[m];
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			Hen h = new Hen();
			h.l = Integer.parseInt(sa[0]) - 1;
			h.r = Integer.parseInt(sa[1]) - 1;
			h.d = Integer.parseInt(sa[2]);
			arr[i] = h;
		}
		br.close();

		long[] x = new long[n];
		boolean[] fix = new boolean[n];
		for (Hen h : arr) {
			if (!fix[h.l]) {
				fix[h.l] = true;
				x[h.l] = 0L;
			}
			if (!fix[h.r]) {
				fix[h.r] = true;
				x[h.r] = x[h.l] + h.d;
			} else {
				if (x[h.r] - x[h.l] != h.d) {
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}

	static class Hen {
		int l, r, d;
		boolean used;
	}
}
