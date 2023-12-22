import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	private static int AIndex = 0;
	private static int CIndex = 0;

	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int n = Integer.parseInt(br.readLine());

			int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
			int[] b = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
			int[] c = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

			AIndex = 0;
			CIndex = 0;

			int count = 0;
			for (int j = 0; j < n; j++) {
				count += getACount(a, b[j]) * getCCount(c, b[j]);
			}
			System.out.println(count);
		}
	}

	private static int getCCount(int[] c, int b) {
		int n = c.length;
		int Ccount = 0;
		for (int k = CIndex; k < n; k++) {
			if (b < c[k]) {
				Ccount = n - k;
				CIndex = k;
				break;
			}
		}
		return Ccount;
	}

	private static int getACount(int[] a, int b) {
		int n = a.length;
		int Acount = n;
		for (int i = AIndex; i < n; i++) {
			if (a[i] >= b) {
				AIndex = i;
				Acount = i;
				break;
			}
		}
		return Acount;
	}
}
