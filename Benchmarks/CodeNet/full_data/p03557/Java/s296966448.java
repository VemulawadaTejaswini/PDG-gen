import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	private static int CIndex = 0;
	private static int AIndex = 0;

	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int n = Integer.parseInt(br.readLine());

			int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
			int[] b = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
			int[] c = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

			CIndex = 0;
			AIndex = 0;

			int count = 0;
			for (int j = 0; j < n && CIndex < n; j++) {
				count += getACount(a, b[j]) * getCCount(c, b[j]);
			}
			System.out.println(count);
		}
	}

	private static int getCCount(int[] c, int b) {
		int n = c.length;

		for (int i = CIndex; i < n; i++) {
			if (c[i] > b) {
				CIndex = i;
				return n - i;
			}
		}
		CIndex = n;
		return 0;
	}

	private static int getACount(int[] a, int b) {
		int n = a.length;
		for (int i = AIndex; i < n; i++) {
			if (a[i] >= b) {
				AIndex = i;
				return i;
			}
		}
		return n;
	}
}
