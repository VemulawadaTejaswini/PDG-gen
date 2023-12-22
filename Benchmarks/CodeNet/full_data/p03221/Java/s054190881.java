import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		City[] cities = new City[m];
		for (int i = 0; i < m; i++) {
		    cities[i] = new City(i, sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(cities, new Comparator<City>() {
		    public int compare(City c1, City c2) {
		        if (c1.pref == c2.pref) {
		            return c1.year - c2.year;
		        } else {
		            return c1.pref - c2.pref;
		        }
		    }
		});
		int prev = 0;
		int count = 1;
		for (City c : cities) {
		    if (c.pref != prev) {
		        count = 1;
		        prev = c.pref;
		    } else {
		        count++;
		    }
		    c.no = count;
		}
		Arrays.sort(cities, new Comparator<City>() {
		    public int compare(City c1, City c2) {
		        return c1.id - c2.id;
		    }
		});
		StringBuilder sb = new StringBuilder();
		for (City c : cities) {
		    sb.append(c).append("\n");
		}
		System.out.print(sb);
   }
    
    static class City {
        int id;
        int pref;
        int year;
        int no;
        
        public City(int id, int pref, int year) {
            this.id = id;
            this.pref = pref;
            this.year = year;
        }
        
        public String toString() {
            return String.format("%06d%06d", pref, no);
        }
    }
}
