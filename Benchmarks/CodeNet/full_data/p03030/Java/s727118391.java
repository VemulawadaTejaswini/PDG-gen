import java.util.*;

class Restaurant {
  public String name;
  public int score;
  public int index;
  
  public Restaurant(String name, int score, int index) {
    this.name = name;
    this.score = score;
    this.index = index;
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    ArrayList<Restaurant> restaurant = new ArrayList<Restaurant>();
    for (int i=1; i<=N; i++) {
      String name = sc.next();
      int score = sc.nextInt();
      restaurant.add(new Restaurant(name,score,i));
    }

    Comparator<Restaurant> workComparator = new Comparator<Restaurant>(){
      @Override
      public int compare(Restaurant r1, Restaurant r2) {
        if (! r1.name.equals(r2.name)) {
        return r1.name.compareTo(r2.name);
        } else if (r1.name.equals(r2.name)) {
          return (r1.score > r2.score) ? -1:1;
        } else {
          return -1;
        }
      }
    };            
    Collections.sort(restaurant, workComparator);
    for (Restaurant r : restaurant) {
      System.out.println(r.index);
    }
  }
}