import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashMap<String, Integer> map1 = new HashMap<String, Integer>();
    HashMap<String, Integer> map2 = new HashMap<String, Integer>();
    int n = sc.nextInt();
    String[] str1 = new String[n];
    for(int i = 0; i < n; i++) {
      str1[i] = sc.next();
      if(map1.containsKey(str1[i])) {
        map1.put(str1[i], map1.get(str1[i]) + 1);
      } else {
        map1.put(str1[i], 1);
      }
    }
    int m = sc.nextInt();
    String[] str2 = new String[m];
    for(int i = 0; i < m; i++) {
      str2[i] = sc.next();
      if(map2.containsKey(str2[i])) {
        map2.put(str2[i], map2.get(str2[i]) + 1);
      } else {
        map2.put(str2[i], 1);
      }
    }
    int ans = 0;
    for(String s : map1.keySet()) {
      if(map2.containsKey(s)) {
        ans = Math.max(ans, map1.get(s) - map2.get(s));
      } else {
        ans = Math.max(ans, map1.get(s));
      }
    }
    System.out.println(ans);
  }
}