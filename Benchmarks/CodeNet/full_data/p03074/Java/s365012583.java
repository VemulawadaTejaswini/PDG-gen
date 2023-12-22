import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			scanner.nextLine();
			char[] s = scanner.nextLine().toCharArray();
			List<Result> list = new ArrayList<>();
			boolean isOne;
			if (s[0] == '0') {
				list.add(new Result(k, 0, 0));
				isOne = true;
			} else {
				isOne = false;
			}
			for (int i = 0; i < s.length; i++) {
				if (isOne && ('0' == s[i])) {
					for (Result result : list) {
						if (result.count <= 0) {
							if (result.k > 0) {
								result.k--;
							} else {
								result.count = i - result.start;
							}
						}
					}
					isOne = false;
				} else if (!isOne && ('1' == s[i])) {
					list.add(new Result(k, i, 0));
					isOne = true;
				}
			}
			for (Result result : list) {
				if (result.count <= 0) {
					result.count = n - result.start;
				}
			}
			list.sort((x, y) -> y.count - x.count);
			System.out.println(list.get(0).count);
		}
	}

	private static class Result {
		int k;
		int start;
		int count;

		Result(int k, int start, int count) {
			super();
			this.k = k;
			this.start = start;
			this.count = count;
		}

		@Override
		public String toString() {
			return "k=" + k + ",start=" + start + ",count=" + count;
		}
	}
}
