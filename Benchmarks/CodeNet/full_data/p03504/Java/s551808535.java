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
				final TVData stc = new TVData(br.readLine());

				// 同じチャンネルで連続した録画データを取得する
				TVData[] continuing = list.stream().filter(s -> s.isContinuing(stc)).toArray(TVData[]::new);

				if (continuing.length > 0) {
					// 連結可能なデータがあった場合は連結させた新しいデータを追加
					list.add(new TVData(stc, continuing));
					// 古いデータを削除
					for (TVData del : continuing) {
						list.remove(del);
					}
				} else {
					list.add(stc);
				}
			}

			final int[] table = new int[2 * 100_001];

			list.forEach(data -> {
				for (int i = data.start * 2 - 1; i <= 2 * data.end; i++) {
					table[i]++;
				}
			});

			System.out.println(Arrays.stream(table).max().getAsInt());
		}
	}

	static class TVData {
		private final int c;
		private final int start;
		private final int end;

		public TVData(String line) {
			int[] tmp = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();

			start = tmp[0];
			end = tmp[1];
			c = tmp[2];
		}

		public TVData(TVData elm1, TVData... elms) {
			this.c = elm1.c;

			int minStart = elm1.start;
			int maxEnd = elm1.end;

			for (TVData stc : elms) {
				minStart = Math.min(minStart, stc.start);
				maxEnd = Math.max(maxEnd, stc.end);
			}

			start = minStart;
			end = maxEnd;
		}

		// 同じチャンネルの場合は連続して録画可能のため、開始時間と終了時間が一致した場合は連結できる
		public boolean isContinuing(TVData stc) {
			if (c == stc.c) {
				return start == stc.end || end == stc.start;
			}
			return false;
		}

		// list.remove()にて間接的に使うかも?
		public boolean equals(Object obj) {
			if (obj instanceof TVData) {
				TVData tmp = (TVData) obj;
				return this.start == tmp.start && this.end == tmp.end && this.c == tmp.c;
			}
			return false;
		}

		public String toString() {
			return String.join(" ", String.valueOf(this.start), String.valueOf(this.end), String.valueOf(this.c));
		}
	}

}
