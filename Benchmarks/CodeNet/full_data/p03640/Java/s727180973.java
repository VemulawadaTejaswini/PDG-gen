import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int h = Integer.parseInt(sa[0]);
		int w = Integer.parseInt(sa[1]);
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		sa = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		int[] c = new int[h * w];
		int k = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < a[i]; j++) {
				c[k] = i + 1;
				k++;
			}
		}

		for (int i = 0; i < h; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < w; j++) {
				k = w * i;
				if (i % 2 == 0) {
					k += j;
				} else {
					k += w - 1 - j;
				}
				sb.append(c[k]).append(' ');
			}
			sb.deleteCharAt(sb.length() - 1);
			System.out.println(sb.toString());
		}
	}
}
