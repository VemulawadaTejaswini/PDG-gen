import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[1]);

		int[] x = new int[m];
		int[] y = new int[m];
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			x[i] = Integer.parseInt(sa[0]);
			y[i] = Integer.parseInt(sa[1]);
		}
		br.close();

		int[] a = new int[n + 1];
		Arrays.fill(a, 1);

		Set<Integer> red = new HashSet<Integer>();
		red.add(1);
		for (int i = 0; i < m; i++) {
			a[x[i]]--;
			a[y[i]]++;
			if (red.contains(x[i])) {
				red.add(y[i]);
			}
			if (a[x[i]] == 0) {
				red.remove(x[i]);
			}
		}
		System.out.println(red.size());
	}
}
