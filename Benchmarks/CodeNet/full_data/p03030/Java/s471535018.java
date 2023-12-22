import java.util.*;

public class Main {
    static long mod = 1000000007;

    static class Restaurant {
        int id;
        String city;
        int point;
        public Restaurant(int id, String city, int point) {
            this.id = id;
            this.city = city;
            this.point = point;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Restaurant[] lis = new Restaurant[n];

        for (int i = 0; i < n; ++i) {
            String city = sc.next();
            int point = sc.nextInt();
            lis[i] = new Restaurant(i + 1, city, point);
        }

        Arrays.sort(lis, new Comparator<Restaurant>() {
            public int compare(Restaurant a, Restaurant b) {
                if (a.city.equals(b.city)) {
                    return b.point - a.point;
                } else {
                    return a.city.compareTo(b.city);
                }
            }
        });

        for (int i = 0; i < n; ++i) {
            System.out.println(lis[i].id);
        }
    }
}
