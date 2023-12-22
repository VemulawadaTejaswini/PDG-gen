import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            City[] cities = new City[N];
            for (int i = 0; i < N; i++) {
                cities[i] = new City();
                cities[i].s = in.next();
                cities[i].p = in.nextInt();
                cities[i].i = i + 1;
            }
            Arrays.sort(cities, new Comparator<City>() {
                @Override
                public int compare(City o1, City o2) {
                    int c = o1.s.compareTo(o2.s);
                    if (c != 0) {
                        return c;
                    }
                    if (o1.p > o2.p) {
                        return -1;
                    }
                    if (o1.p < o2.p) {
                        return 1;
                    }
                    return 0;
                }
            });

            for (City city : cities) {
                System.out.println(city.i);
            }
        }
    }
}

class City {
    int i;
    String s;
    int p;
}