import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		Restaurant[] rs = new Restaurant[N];
		for (int i = 0; i < N; i++) {
			rs[i] = new Restaurant(i + 1, sc.next(), Integer.parseInt(sc.next()));
		}
		sc.close();

		Arrays.sort(rs, new Comparator<Restaurant>() {
			public int compare(Restaurant r1, Restaurant r2) {
				int c = r1.s.compareTo(r2.s);
				if (c != 0) {
					return c;
				}
				return r2.p - r1.p;
			}
		});

		for (int i = 0; i < N; i++) {
			System.out.println(rs[i].id);
		}

	}

	static class Restaurant {
		String s;
		int p;
		int id;

		Restaurant(int id, String s, int p) {
			this.s = s;
			this.p = p;
			this.id = id;
		}
	}

}