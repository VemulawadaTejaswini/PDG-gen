import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		ArrayList<Pair> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String str[] = br.readLine().split(" ");

			long x = Long.parseLong(str[0]);
			long l = Long.parseLong(str[1]);

			list.add(new Pair(x, l));
		}

		Collections.sort(list);

		long now = Long.MIN_VALUE;
		int ans = 0;

		for (int i = 0; i < n; i++) {
			if (now > list.get(i).left) {
				continue;
			}
			ans++;
			now = list.get(i).right;
		}

		System.out.println(ans);
	}
}

class Pair implements Comparable<Pair> {
	long left;
	long right;

	public Pair(long x, long l) {
		left = x - l;
		right = x + l;
	}

	@Override
	public int compareTo(Pair p) {
		return Long.compare(this.right, p.right);
	}
}