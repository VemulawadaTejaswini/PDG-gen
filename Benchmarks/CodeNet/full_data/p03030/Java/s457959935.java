import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      Map<String, List<int[]>> map = new HashMap<>();
      for(int i = 1; i <= n; i++) {
        String city = sc.next();
        if(!map.containsKey(city))
            map.put(city, new ArrayList<>());
        map.get(city).add(new int[]{sc.nextInt(), i});
      }
      List<String> cities = new ArrayList<>(map.keySet());
      Collections.sort(cities, (c1, c2) -> c1.compareTo(c2));
      for(String city : cities) {
          List<int[]> res = map.get(city);
          Collections.sort(res, (r1, r2) -> r2[0] - r1[0]);
          for(int[] r : res)
            System.out.println(r[1]);
      }
      
  }
}