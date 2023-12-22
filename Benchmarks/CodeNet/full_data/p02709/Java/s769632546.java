import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			long[] a = new long[n];
			Data[] datas = new Data[n];
			IntStream.range(0, n).forEach(i -> {
				a[i] = scanner.nextInt();
				datas[i] = new Data(a[i], i);
			});
			Arrays.sort(datas);
			System.out.println(getResult(datas, 0, n - 1, 0, new HashMap<>()));
		}
	}

	private static long getResult(final Data[] datas, final int leftIndex, final int rightIndex, final int index,
			Map<List<Integer>, Long> map) {
		if (index >= datas.length) {
			return 0;
		}
		List<Integer> key = Arrays.asList(leftIndex, rightIndex);
		Long result = map.get(key);
		if (null == result) {
			result = Math.max(
					getResult(datas, leftIndex + 1, rightIndex, index + 1, map)
							+ datas[index].value * Math.abs(leftIndex - datas[index].index),
					getResult(datas, leftIndex, rightIndex - 1, index + 1, map)
							+ datas[index].value * Math.abs(rightIndex - datas[index].index));
			map.put(key, result);
		}

		return result;
	}

	private static class Data implements Comparable<Data> {
		final long value;
		final int index;

		Data(long value, int index) {
			super();
			this.value = value;
			this.index = index;
		}

		@Override
		public int compareTo(Data o) {
			if (this.value == o.value) {
				return this.index - o.index;
			}
			if (this.value > o.value) {
				return -1;
			} else {
				return 1;
			}
		}
	}
}
