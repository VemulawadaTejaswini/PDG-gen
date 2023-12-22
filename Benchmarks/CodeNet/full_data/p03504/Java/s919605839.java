import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] array = br.readLine().split(" ");
			int N = Integer.parseInt(array[0]);
			int C = Integer.parseInt(array[1]);

			List<TVData> list = new ArrayList<>();
			for (int i = 0; i < N; i++) {
				list.add(new TVData(br.readLine()));
			}
			final int[] table = new int[2 * 100_001];
			final boolean[] tmp = new boolean[2 * 100_001];
			for (int channel = 1; channel <= C; channel++, init(tmp)) {
				final int c = channel;
				list.stream().filter(data -> data.channel == c).forEach(data -> {
					for (int i = data.start * 2 - 1; i <= data.end * 2; i++) {
						tmp[i] = true;
					}
				});
				for (int i = 0; i < table.length; i++) {
					if (tmp[i]) {
						table[i]++;
					}
				}
			}

			System.out.println(Arrays.stream(table).max().getAsInt());
		}
	}

	private static void init(boolean[] tmp) {
		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = false;
		}
	}

	public static class TVData {
		private final int channel;
		private final int start;
		private final int end;

		public TVData(String line) {
			int[] tmp = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
			start = tmp[0];
			end = tmp[1];
			channel = tmp[2];
		}
	}

}
