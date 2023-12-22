import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;

public class Main {

    public static class Restaurant {
        private int num;
        private String name;
        private int point;

        public Restaurant(int num, String name, int point) {
            this.num = num;
            this.name = name;
            this.point = point;
        }

        public int getNum() {
            return num;
        }

        public String getName() {
            return name;
        }

        public int getPoint() {
            return point;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Restaurant> restaurants = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int point = sc.nextInt();
            restaurants.add(new Restaurant(i + 1, name, point));
        }

        restaurants
                .sort(comparing(Restaurant::getName).thenComparing(Restaurant::getPoint, reverseOrder()));
        for (Restaurant r : restaurants) {
            System.out.println(r.getNum());
        }
    }

}
