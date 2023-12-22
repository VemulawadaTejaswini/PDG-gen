import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] n = br.readLine().split(" ");
		Integer[] num = new Integer[N];

		double max = -100;
		double min = 100;

		for (int i = 0; i < N; i++) {
			n.toString().split(" ");
			num[i] = Integer.parseInt(n[i]);
		}

		for (int i = 0; i < N; i++) {
			min = Math.min(min, num[i]);
			max = Math.max(max, num[i]);
		}

		double ave = Math.round((min + max) / 2);

		int cost = 0;

		for (int i = 0; i < N; i++) {
			cost += (num[i] - ave) * (num[i] - ave);
		}
		System.out.println(cost);

	}

}
