import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    HashMap<Integer, Integer> map = new HashMap<>();
    int prev = 0;
    int prevIndex = 0;
    for(int i = 0; i < s.length() - 1; i++) {
      if (s.charAt(i) == 'R' && s.charAt(i + 1) == 'L') {
        map.put(i, 1);
        map.put(i + 1, 1);
        int distance = i - prev;
        if(distance % 2 == 0) {
          if (s.charAt(i-1) == 'L') {
            map.put(prevIndex, map.get(prevIndex) + distance / 2);
            map.put(prevIndex+1, map.get(prevIndex+1) + distance / 2);
          } else {
            map.put(i, map.get(i) + distance / 2);
            map.put(i+1, map.get(i+1) + distance / 2);
          }
        } else {
          if (s.charAt(i-1) == 'L') {
            map.put(prevIndex, map.get(prevIndex) + distance / 2 + 1);
            map.put(prevIndex+1, map.get(prevIndex + 1) + distance / 2);
          } else {
            map.put(i, map.get(i) + distance / 2);
            map.put(i+1, map.get(i+1) + 1 + distance / 2);
          }
        }
        prev = i + 2;
        prevIndex = i;
      }
    }
    for(int i = 0; i < s.length(); i++) {
      if(map.containsKey(i)) {
        System.out.print(map.get(i) + " ");
      } else {
        System.out.print("0 ");
      }
    }
  }
}