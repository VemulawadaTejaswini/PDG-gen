import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split(" ");
		int even[] = new int[100005];
		int odd[] = new int[100005];

		for (int i = 0; i < n; i++) {
			int v = Integer.parseInt(str[i]);
			if (i % 2 == 0)
				even[v]++;
			else
				odd[v]++;
		}

		int maxE = 0;
		int maxO = 0;
		int maxEE = 0;
		int maxOO = 0;

		int maxEI = 0;
		int maxOI = 0;

		for (int i = 0; i < 100005; i++) {
			if (maxE < even[i]) {
				maxEE = maxE;
				maxE = even[i];
				maxEI = i;
			}
			if (maxO < odd[i]) {
				maxOO = maxO;
				maxO = odd[i];
				maxOI = i;
			}
		}

		if (maxEI == maxOI) {
			int first = 0;
			int second = 0;
			if (maxE > maxO) {
				first = maxE;
				second = maxOO;
			} else if (maxE < maxO) {
				first = maxO;
				second = maxEE;
			} else {
				if (maxEE > maxOO) {
					first = maxO;
					second = maxEE;
				} else {
					first = maxE;
					second = maxOO;
				}
			}
			System.out.println((n / 2 - first) + (n / 2 - second));
		} else
			System.out.println((n / 2 - maxE) + (n / 2 - maxO));

	}
}
