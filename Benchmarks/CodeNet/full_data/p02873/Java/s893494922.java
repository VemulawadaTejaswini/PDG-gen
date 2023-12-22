import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split("");

		long sum = 0;
		for (int i = 0; i < str.length + 1; i++) {
			int left = 0;
			int right = 0;

			int j = i - 1;

			if (j >= 0) {
				while (str[j].equals("<")) {
					left++;
					j--;
					if (j < 0) {
						break;
					}
				}
			}

			j = i;

			if (j < str.length) {
				while (str[j].equals(">")) {
					right++;
					j++;
					if (j >= str.length) {
						break;
					}
				}
			}


			sum += Math.max(left, right);
		}

		System.out.println(sum);
	}

	static long getSum(int s, int e) {
		long sum = 0;
		for (int i = s; i <= e; i++) {
			sum += i;
		}
		return sum;
	}
}