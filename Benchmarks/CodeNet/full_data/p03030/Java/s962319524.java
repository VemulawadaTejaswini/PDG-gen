import java.util.*;
public class Main(){
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    HashMap<String, int> hashmap = new HashMap<String, int>();
    ArrayList <String> cities = new ArrayList<>();
    for (int i = 0; i < n; i++){
      String city = scanner.next();
      int score = scanner.nextInt();
      if(!cities.contains(city)) {
        cities.add(city);
      }
      hashmap.put(city, score);
    }
    for (int i = 0 ; i < cities.size() ; i++){
      String row = array.get(i);
      System.out.println(row);
    }
  }
}