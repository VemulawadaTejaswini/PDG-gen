import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split("");

		ArrayList<Integer> length = new ArrayList<>();
		ArrayList<Integer> dire = new ArrayList<>();
		ArrayList<Integer> used = new ArrayList<>();

		String now = str[0];
		int len = 1;

		for (int i = 1; i < str.length; i++) {
			if (str[i].equals(now)) {
				len++;
				if (i == str.length - 1) {
					if (now.equals("<")) {
						dire.add(1);
					} else {
						dire.add(-1);
					}
					length.add(len);
				}
			} else {
				if (now.equals("<")) {
					dire.add(1);
				} else {
					dire.add(-1);
				}
				now = str[i];
				length.add(len);
				len = 1;
			}
		}

		long sum = 0;
		for (int i = 0; i < length.size(); i++) {
			if (i == length.size() - 1) {
				if (dire.get(i) == 1) {
					sum += getSum(0, length.get(i));
				} else {
					if (length.get(i - 1) < length.get(i)) {
						sum += getSum(0, length.get(i));
					} else {
						sum += getSum(0, length.get(i) - 1);
					}
				}
			} else {
				if (length.get(i) < length.get(i + 1) && dire.get(i + 1) == -1) {
					sum += getSum(0, length.get(i) - 1);
				} else {
					sum += getSum(0, length.get(i));
				}
			}
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