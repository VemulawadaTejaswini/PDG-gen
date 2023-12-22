import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, TreeMap<Integer, Integer>> restaurants = new TreeMap<>();

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            String city = sc.next();
            TreeMap<Integer, Integer> restaurantsInCity = restaurants.get(city);
            if (restaurantsInCity == null) {
                restaurantsInCity = new TreeMap<>(new Comparator<Integer>() {
                    public int compare (Integer m, Integer n) {
                        return m.compareTo(n) * -1;
                    }
                });
            }

            restaurantsInCity.put(sc.nextInt(), i + 1);
            restaurants.put(city, restaurantsInCity);
        }

        Iterator<String> itr = restaurants.keySet().iterator();
        while (itr.hasNext()) {
            TreeMap<Integer, Integer> resutaurantsInCity = restaurants.get(itr.next());
            Iterator<Integer> index = resutaurantsInCity.values().iterator();
            while (index.hasNext()) {
                System.out.println(index.next());
            }
        }
    }
}
