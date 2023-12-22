import java.util.Scanner;
import java.util.TreeMap;
import java.util.Iterator;

public class Main {
  	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        TreeMap<String, TreeMap<Integer, Integer>> restaurants = new TreeMap<>();

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            String city = sc.next();
            TreeMap<Integer, Integer> restaurantsInCity = restaurants.get(city);
            if (restaurantsInCity == null) {
                restaurantsInCity = new TreeMap<>();
            }

            restaurantsInCity.put(sc.nextInt(), i);
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