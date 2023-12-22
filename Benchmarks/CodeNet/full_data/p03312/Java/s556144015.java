import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String[] aline = br.readLine().split(" ");

		long allsum = 0;
		int[] aarr = new int[n];
		for (int i = 0; i < n; i++) {
			int a =  Integer.parseInt(aline[i]);
			aarr[i] = a;
			allsum+=a;
		}

		long diffmin = 999999999999999999L;
		long p = 0;
		long q = 0;
		long r = 0;
		long s = 0;

		for (int i = 0;i<n;i++) {

		}

		for (int i = 0; i < n - 3; i++) {
			p += aarr[i];
			for (int j = i + 1; j < n - 2; j++) {
				q += aarr[j];
				for (int k = j + 1; k < n - 1; k++) {
					r += aarr[k];
					s = allsum - p -q-r;
				}
				long max = Math.max(p, Math.max(q, Math.max(r, s)));
				long min = Math.min(p, Math.min(q, Math.min(r, s)));
				diffmin = Math.min(diffmin, Math.abs(max - min));
				s = 0;
				r = 0;
			}
			q = 0;
		}

		System.out.println(diffmin);

	}

}