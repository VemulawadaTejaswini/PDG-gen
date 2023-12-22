import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n = 0;
	static int m = 0;
	static int[] p = null;
	static int[] y = null;
	
	public static void main(String[] args) {
		n = sc.nextInt();
		m = sc.nextInt();
		City[] cities = new City[m];
		
		for(int i = 0; i < m; ++i) {
			int p = sc.nextInt();
			int y = sc.nextInt();
			cities[i] = new City(i, p, y);
		}
		Arrays.sort(cities);
		
		for(int i = 0; i < m; ++i) {
			cities[i].r = (i == 0) ? 1 : (cities[i].p == cities[i - 1].p) ? cities[i - 1].r + 1 : 1;
		}
		Arrays.sort(cities, (c1, c2) -> c1.num - c2.num);
		
		for(int i = 0; i < m; ++i) {
			int upper = cities[i].p;
			int lower = cities[i].r;
			System.out.printf("%06d%06d\n", upper, lower);
		}
	}
}

class City implements Comparable<City> {
	int num;
	int p;
	int y;
	int r;
	
	public City(int num, int p, int y) {
		this.num = num;
		this.p = p;
		this.y = y;
	}
	
	@Override
	public int compareTo(City c) {
		if(this.p != c.p) return this.p - c.p;
		else return this.y - c.y;
	}
}