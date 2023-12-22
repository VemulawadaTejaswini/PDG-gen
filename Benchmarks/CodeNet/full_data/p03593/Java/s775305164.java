import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    for(int i = 0; i < h; i++) {
      String s = sc.next();
      for(int j = 0; j < w; j++) {
        String str = String.valueOf(s.charAt(j));
        if(map.containsKey(str)) {
          map.put(str, map.get(str) + 1);
        } else {
          map.put(str, 1);
        }
      }
    }
    String ans = "Yes";
    if((h % 2 == 0) && (w % 2 == 0)) {
      ans = "Yes";
      for(String s : map.keySet()) {
        if((map.get(s) % 4) != 0) {
          ans = "No";
          break;
        }
      }
    }
    if((h % 2 == 1) && (w % 2 == 0)) {
      ans = "Yes";
      int d = 0;
      for(String s : map.keySet()) {
        if((map.get(s) % 2) != 0) {
          ans = "No";
          break;
        }
        if((map.get(s) % 4) == 2) {
          d++;
        }
      }
      if(d > (w / 2)) ans = "No";
    }
    if((h % 2 == 0) && (w % 2 == 1)) {
      ans = "Yes";
      int d = 0;
      for(String s : map.keySet()) {
        if((map.get(s) % 2) != 0) {
          ans = "No";
          break;
        }
        if((map.get(s) % 4) == 2) {
          d++;
        }
      }
      if(d > (h / 2)) ans = "No";      
    }
    if((h % 2 == 1) && (w % 2 == 1)) {
      ans = "No";
      int d = 0;
      int kisuu = 0;
      int k = 0;
      for(String s : map.keySet()) {
        if((map.get(s) % 2) != 0) {
          kisuu++;
          k = map.get(s);
        }
        if((map.get(s) % 4) == 2) {
          d++;
        }
      }
      if(((k - 1) % 4) == 2) d++;
      if((kisuu == 1) && (d <= ((h / 2) + (w / 2)))) ans = "Yes";
    }
    System.out.println(ans);
  }
}