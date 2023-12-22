import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String... args) throws IOException {

		// 標準入力を取得
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int n = Integer.parseInt(line.split(" ")[0]);
		line = br.readLine();
		String[] strs = line.split(" ");
		int[] as = new int[strs.length];
		long aSum = 0;
		for (int i = 0; i < as.length; i++) {
			as[i] = Integer.parseInt(strs[i]);
			aSum += as[i];
		}
		line = br.readLine();
		strs = line.split(" ");
		int[] bs = new int[strs.length];
		long bSum = 0;
		for (int i = 0; i < as.length; i++) {
			bs[i] = Integer.parseInt(strs[i]);
			bSum += bs[i];
		}

		// どうしようもない
		if (bSum > aSum) {
			System.out.println("-1");
			return;
		}

		// 変更不要
		for (int i = 0; i < as.length; i++) {
			if (as[i] < bs[i]) {
				break;
			}
			if (i == as.length - 1) {
				System.out.println("0");
				return;
			}
		}

		// A と Bの差分
		long diff = aSum - bSum;
		int count = 0;

		for (int i = 0; i < as.length; i++) {

			// 同じやつは何もしない
			if (as[i] == bs[i]) {
				count++;
			}
		}

		while (true) {
			int minDiff = 0;
			int index = -1;
			for (int i = 0; i < as.length; i++) {

				// Bがおおきいやつは仕方ない
				if (as[i] < bs[i]) {
					continue;
				}

				// 同じやつは何もしない
				if (as[i] == bs[i]) {
					continue;
				}

				int d = as[i] - bs[i];
				if (minDiff == 0 || minDiff > d) {
					minDiff = d;
					index = i;
				}
			}

			if (index == -1) {
				break;
			} else if (minDiff > diff) {
				break;
			} else {
				diff -= minDiff;
				bs[index] = as[index];
				count++;
			}
		}

		System.out.println(n - count);

	}
}
