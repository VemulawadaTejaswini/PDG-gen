import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		City[] cities = new City[m];
		for (int i = 0; i < m; i++) {
			cities[i] = new City(i, sc.nextInt(), sc.nextInt());
		}
		sc.close();

		// yの昇順
		Arrays.sort(cities, new Comparator<City>() {
			public int compare(City c1, City c2) {
				return c1.y - c2.y;
			}
		});

		int[] cityCnt = new int[n + 1];
		String[] numArray = new String[m];
		for (City city : cities) {
			String num = padZero(city.p) + padZero(++cityCnt[city.p]);
			numArray[city.i] = num;
		}

		for (String num : numArray) {
			System.out.println(num);
		}
	}

	static class City {
		int i;
		int p;
		int y;
		public City(int i, int p, int y) {
			this.i = i;
			this.p = p;
			this.y = y;
		}
	}

	static String padZero(int id) {
		StringBuilder sb = new StringBuilder(String.valueOf(id));
		while (sb.length() < 6) {
			sb.insert(0, "0");
		}
		return sb.toString();
	}
}
