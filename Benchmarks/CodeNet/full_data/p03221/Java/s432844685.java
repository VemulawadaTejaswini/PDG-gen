import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] p = new int[m];
		ArrayList<City> city = new ArrayList<>(m);
		for (int i = 0; i < m; i++) {
			p[i] = sc.nextInt();
			city.add(new City(i, sc.nextInt()));
		}
		Collections.sort(city, new CityComparator());
		String[] ans = new String[m];
		int[] count = new int[n];
		for (int i = 0; i < m; i++) {
			City tmp = city.get(i);
			StringBuilder id = new StringBuilder();
			id.append(String.valueOf(p[tmp.number] * 1000000 + count[p[tmp.number] - 1] + 1));
			if (id.length() < 12) {
				while (id.length() < 12) {
					id.insert(0, "0");
				}
			}
			count[p[tmp.number] - 1]++;
			ans[tmp.number] = String.valueOf(id);
		}
		for (int i = 0; i < m; i++) {
			System.out.println(ans[i]);
		}
	}
}

class City {
	int number;
	int year;

	City(int number, int year) {
		this.number = number;
		this.year = year;
	}
}

class CityComparator implements Comparator<City> {
	@Override
	public int compare(City c1, City c2) {
		return c1.year - c2.year;
	}
}