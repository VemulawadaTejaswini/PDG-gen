import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		ArrayList<Pair> listr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String str[] = br.readLine().split(" ");

			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);

			listr.add(new Pair(a, b));
		}

		ArrayList<Pair> listb = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String str[] = br.readLine().split(" ");

			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);

			listb.add(new Pair(a, b));
		}

		Collections.sort(listr);
		Collections.sort(listb);

		boolean used[] = new boolean[n];

		int ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (listb.get(i).x > listr.get(j).x && listb.get(i).y > listr.get(j).y && !used[j]) {
					used[j] = true;
					ans++;
					break;
				}
			}
		}
		System.out.println(ans);
	}
}

class Pair implements Comparable<Pair> {
	int x;
	int y;

	public Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Pair p) {
		return Double.compare(Math.sqrt(this.x * this.x + this.y * this.y), Math.sqrt(p.x * p.x + p.y * p.y));
	}
}