import java.util.*;
import java.math.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int right = 0;
    int penalty = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    HashSet<Integer> set = new HashSet<>();
    for(int i = 0; i < m; ++i) {
      int index = sc.nextInt();
      String s = sc.next();
      if(set.contains(index)) continue;
      if(s.equals("AC")) {
        penalty += map.getOrDefault(index, 0);
        ++right;
        set.add(index);
      } else {
        if(!map.containsKey(index)) {
          map.put(index, 1);
        } else {
          map.put(index, map.get(index) + 1);
        }
      }
    }
    System.out.println(right + " " + penalty);
  }
}