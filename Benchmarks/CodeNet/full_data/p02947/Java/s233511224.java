import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    long ans = 0;
    for(int i = 0; i < n; i++) {
      String s = sc.next();
      char[] c = s.toCharArray();
      Arrays.sort(c);
      String s2 = new String(c);
      if(map.containsKey(s2)) {
        ans += (long)map.get(s2);
        map.put(s2, map.get(s2) + 1);
      } else {
        map.put(s2, 1);
      }
    }
    System.out.println(ans);
  }
}