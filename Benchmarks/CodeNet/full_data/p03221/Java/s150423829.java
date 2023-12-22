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
		city.sort(new CityComparator());
		String[] ans = new String[m];
		int[] count = new int[n];
		for (int i = 0; i < m; i++) {
			City tmp = city.get(i);
			count[p[tmp.number] - 1]++;
			ans[tmp.number] = String.format("%06d%06d",p[tmp.number], count[p[tmp.number] - 1]);
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