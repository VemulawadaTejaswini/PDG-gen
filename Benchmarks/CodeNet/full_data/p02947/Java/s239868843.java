import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    long ans = 0;
    String str = "";
    char[] ch = new char[10];
    Map<String, Integer> map = new HashMap<>();
    for(int i = 0; i < n; i++) {
      str = sc.next();
      for(int j = 0; j < 10; j++) {
        ch[j] = str.charAt(j);
      }
      Arrays.sort(ch);
      str = String.valueOf(ch);
      if(map.containsKey(str)) {
        map.put(str, map.get(str) + 1);
      } else {
        map.put(str, 1);
      }
    }
    long num;
    for(String temp : map.keySet()) {
      num = map.get(temp);
      ans += num * (num - 1) / 2;
    }
    System.out.println(ans);
  }
}
