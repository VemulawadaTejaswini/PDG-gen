import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    HashMap<String, Long> map = new HashMap<String, Long>();
    long ans = 0;
    for(int i = 0; i < n; i++) {
      String s = sc.next();
      int[] c = new int[26];
      for(int j = 0; j < 10; j++) {
        c[s.charAt(j) - 'a']++;
      }
      String str = "";
      for(int j = 0; j < 26; j++) {
        String ss = String.valueOf(c[j]);
        str += ss;
      }
      if(map.containsKey(str)) {
        ans += map.get(str); 
        map.put(str, map.get(str) + 1);
      } else {
        map.put(str, (long)1);
      }
    }
    System.out.println(ans);
  }
}