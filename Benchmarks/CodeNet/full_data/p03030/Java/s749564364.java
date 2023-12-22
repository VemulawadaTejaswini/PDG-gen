import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		Rest r[] = new Rest[n];
		for (int i = 0; i < n; i++) {
			String str[] = br.readLine().split(" ");
			int p = Integer.parseInt(str[1]);

			r[i] = new Rest(str[0], p, i + 1);
		}

		Arrays.sort(r);

		for (int i = 0; i < n; i++) {
			System.out.println(r[i].id);
		}
	}
}

class Rest implements Comparable<Rest> {
	String name;
	int point;
	int id;

	public Rest(String name, int point, int id) {
		this.name = name;
		this.point = point;
		this.id = id;
	}

	@Override
	public int compareTo(Rest r) {
		int com = this.name.compareTo(r.name);

		if (com != 0)
			return com;

		return r.point - this.point;
	}
}