import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    scanner.nextLine();

    ArrayList<Restaurant> restaurants = new ArrayList<Restaurant>();
    for (int i = 1; i <= N; i++) {
      String[] tmp = scanner.nextLine().split(" ");
      String city = tmp[0];
      int score = Integer.parseInt(tmp[1]);
      restaurants.add(new Restaurant(city, score, i));
    }

    restaurants.sort((a, b) -> a.city.compareTo(b.city));

    String prevCity = "";
    ArrayList<Restaurant> sameCityRestaurants = new ArrayList<>();

    for (Restaurant restaurant : restaurants) {
      if (prevCity.equals("")) {
        prevCity = restaurant.city;
        sameCityRestaurants.add(restaurant);
      } else {
        if (restaurant.city.equals(prevCity)) {
          sameCityRestaurants.add(restaurant);
        } else {
          sameCityRestaurants.sort((a, b) -> b.score - a.score);
          for (Restaurant r : sameCityRestaurants) {
            System.out.println(r.index);
          }
          sameCityRestaurants.clear();
          sameCityRestaurants.add(restaurant);
          prevCity = restaurant.city;
        }

      }
    }
    sameCityRestaurants.sort((a, b) -> b.score - a.score);
    for (Restaurant r : sameCityRestaurants) {
      System.out.println(r.index);
    }
  }
}

class Restaurant {
  String city;
  int score;
  int index;

  Restaurant(String city, int score, int index) {
    this.city = city;
    this.score = score;
    this.index = index;
  }
}