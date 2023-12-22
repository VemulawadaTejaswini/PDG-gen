import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static class Elem implements Comparable<Elem> {
		long val;
		int prevIndex;

		Elem(long val) {
			this.val = val;
			this.prevIndex = -1;
		}

		@Override
		public int compareTo(Elem o) {
			if (val < o.val) {
				return 1;
			} else if (val > o.val) {
				return -1;
			} else {
				return 0;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);

		int N = Integer.parseInt(in.readLine());
		long[] A = new long[N];
		for (int i = 0; i < N; ++i) {
			A[i] = Long.parseLong(in.readLine());
		}
		List<Long> list = new ArrayList<>();
		List<Integer> nums = new ArrayList<>();
		for (int i = 0; i < N; ++i) {
			int index = Collections.binarySearch(list, A[i]);

			if (index >= 0) {
				if (index > 0) {
					nums.set(index - 1, nums.get(index - 1) - 1);
					nums.set(index, nums.get(index) + 1);
					if (nums.get(index - 1) == 0) {
						list.remove(index - 1);
						nums.remove(index - 1);
					}
				} else {
					nums.set(index, nums.get(index) + 1);
				}
			} else {
				// 挿入
				int j = (index + 1) * -1;
				if (j > 0) {
					list.add(j, A[i]);
					nums.add(j, 1);
					nums.set(j - 1, nums.get(j - 1) - 1);
					if (nums.get(j - 1) == 0) {
						list.remove(j - 1);
						nums.remove(j - 1);
					}
				} else {
					list.add(j, A[i]);
					nums.add(j, 1);
				}
			}
		}

		int result = 0;
		for (int i = 0; i < nums.size(); ++i) {
			result += nums.get(i);
		}
		System.out.println(result);
	}
}