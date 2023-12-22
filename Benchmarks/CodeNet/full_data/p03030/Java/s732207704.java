import java.util.*;
class Restaurant {
    String city;
    int point;
    int i;
    public Restaurant(String city, int point, int i) {
        this.city = city;
        this.point = point;
        this.i = i;
    }
}
class RestaurantComparator implements Comparator<Restaurant>{
    @Override
    public int compare(Restaurant restaurant1, Restaurant restaurant2){
      int ans=restaurant1.city.compareTo(restaurant2.city);
          if(ans!=0){
            return ans;
          }
            return Integer.compare(restaurant1.point, restaurant2.point)*-1;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Restaurant> list = new ArrayList<Restaurant>();
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            String city = sc.next();
            int point = sc.nextInt();
            list.add(new Restaurant(city, point, i));
        }
        Collections.sort(list, new RestaurantComparator());
        for (Restaurant restaulant: list) {
            System.out.println(restaulant.i);
        }
    }
}