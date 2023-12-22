import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Restaurant> restaurants = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            String s = sc.next();
            int p = sc.nextInt();
            Restaurant restaurant = new Restaurant();
            restaurant.id = i;
            restaurant.name = s;
            restaurant.score = p;
            restaurants.add(restaurant);
        }

        Collections.sort(restaurants);

        for (Restaurant restaurant: restaurants){
            System.out.println(restaurant.id);
        }

    }

    private static class Restaurant implements Comparable{
        public int id;
        public String name;
        public int score;

        @Override
        public int compareTo(Object o) {
            Restaurant restaurant = (Restaurant)o;

            if (!this.name.equals(restaurant.name)){
                return this.name.compareTo(restaurant.name);
            }
            return restaurant.score - this.score;
        }
    }

}