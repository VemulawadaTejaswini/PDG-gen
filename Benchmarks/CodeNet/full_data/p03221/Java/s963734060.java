import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static class City {
        public City(int  n, int p, int y) {
            this.n = n;
            this.p = p;
            this.y = y;
        }
        int n;
        int p;
        int y;
        String id;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<City> cities = new ArrayList<City>(m);

        for (int i = 0; i < m; i++) {
            cities.add(new City(i, scanner.nextInt(), scanner.nextInt()));
        }
        cities.sort(new Comparator<City>() {
            @Override
            public int compare(City o1, City o2) {
                if (o1.p < o2.p) {
                    return -1;
                } else if (o1.p > o2.p) {
                    return 1;
                } else {
                    if (o1.y < o2.y) {
                        return -1;
                    } else if (o1.y > o2.y) {
                        return 1;
                    } else {
                        return 0;
                    }
                }
            }
        });
        int currentP = 0;
        int x = 0;
        for (City city : cities) {
            if (city.p != currentP) {
                currentP = city.p;
                x = 1;
            }
            city.id = String.format("%06d%06d", city.p, x);
            x++;
        }
        cities.sort(new Comparator<City>() {
            @Override
            public int compare(City o1, City o2) {
                return Integer.compare(o1.n, o2.n);
            }
        });
        for (City city : cities) {
            System.out.println(city.id);
        }
    }
}
