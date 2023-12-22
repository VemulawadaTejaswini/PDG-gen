import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int k = Integer.parseInt(sa[1]);
		br.close();

		if (n < 2 * k - 1) {
			System.out.println(-1);
			return;
		}

		boolean[] used = new boolean[3 * n];
		Queue<Integer> que = new ArrayDeque<>();
		int start = k + 2 * n;
		int end = k + 3 * n;
		for (int i = start; i < end; i++) {
			que.add(i);
		}

		PrintWriter pw = new PrintWriter(System.out);
		int min = k;
		while (!que.isEmpty()) {
			int c = que.poll();
			boolean flg = true;
			for (int i = min; i < start; i++) {
				int a = i - k;
				int b = c - i - k;
				if (!used[a] && !used[b]) {
					used[a] = true;
					used[b] = true;
					pw.println(i + " " + (c - i) + " " + c);
					if (flg) {
						min = i + 1;
					}
					break;
				} else {
					if (!used[a]) {
						flg = false;
					}
				}
			}
		}
		pw.flush();
	}
}
