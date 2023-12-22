import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int N = s.nextInt();

			List<Restaurant> list = new ArrayList<Main.Restaurant>(N);
			for (int i = 0; i < N; i++) {
				list.add(new Restaurant(i + 1, s.next(), s.nextInt()));
			}

			list.stream().sorted(
					Comparator.comparing(Restaurant::getName).thenComparing(
							Comparator.comparingInt(Restaurant::getPoint).reversed()))
					.map(Restaurant::getNo)
					.forEach(System.out::println);
		}
	}

	static class Restaurant {
		final int no;
		final String name;
		final int point;

		public Restaurant(int no, String name, int point) {
			this.no = no;
			this.name = name;
			this.point = point;
		}

		public int getNo() {
			return no;
		}

		public String getName() {
			return name;
		}

		public int getPoint() {
			return point;
		}
	}
}
