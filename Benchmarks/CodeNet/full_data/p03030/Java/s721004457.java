import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			TreeSet<Restaurant> set = new TreeSet<>();
			for (int i = 1; i <= n; i++) {
				String s = sc.next();
				int p = sc.nextInt();
				set.add(new Restaurant(i, s, p));
			}
			set.forEach(r -> {
				System.out.println(r.index);
			});

		}
	}

	static class Restaurant implements Comparable<Restaurant> {
		int index;
		String city;
		int point;

		public Restaurant(int index, String city, int point) {
			this.index = index;
			this.city = city;
			this.point = point;
		}

		@Override
		public int compareTo(Restaurant o) {
			if (city.equals(o.city)) {
				return Integer.compare(point, o.point) * -1;
			}
			return city.compareTo(o.city);
		}

	}
}