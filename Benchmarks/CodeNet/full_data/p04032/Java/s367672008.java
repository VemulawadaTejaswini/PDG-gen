import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int start = -1;
    int end = -1;
    for(int i = 0; i < s.length(); i++) {
      for(int j = i + 1; j < s.length(); j++) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int k = i; k < j + 1; k++) {
          String str = String.valueOf(s.charAt(k));
          if(map.containsKey(str)) {
            map.put(str, map.get(str) + 1);
          } else {
            map.put(str, 1);
          }
        }
        int m = 0;
        for(String str : map.keySet()) {
          m = Math.max(m, map.get(str));
        }
        if(m > (j - i + 1) / 2) {
          start = i + 1;
          end = j + 1;
        }
      }
    }
    System.out.println(start + " " + end);
  }
}