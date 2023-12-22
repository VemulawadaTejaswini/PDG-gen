import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = br.readLine();
		}
		String t = br.readLine();
		br.close();

		String[] a = new String[n];
		String[] z = new String[n];
		for (int i = 0; i < n; i++) {
			a[i] = s[i].replaceAll("\\?", "a");
			z[i] = s[i].replaceAll("\\?", "z");
		}
		Arrays.parallelSort(a);
		Arrays.parallelSort(z);

		int start = n + 1;
		int end = 1;
		for (int i = 0; i < n; i++) {
			if (start == n + 1 && z[i].compareTo(t) >= 0) {
				start = i + 1;
			}
			if (a[i].compareTo(t) <= 0) {
				end = i + 2;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = start; i <= end; i++) {
			sb.append(i).append(' ');
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb.toString());
	}
}
