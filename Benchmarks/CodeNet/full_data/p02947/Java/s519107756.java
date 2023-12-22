import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String[] s = new String[n+1];

    Map<String, Integer> list = new HashMap<>();
    
    for (int i = 0; i < n; i++) {
      char[] t = sc.next().toCharArray();
      Arrays.sort(t);
      s[i] = "";
      for (int j = 0; j < 10; j++) {
        s[i] += String.valueOf(t[j]);
      }
      list.put(s[i], (list.get(s[i]) == null ? 0 : list.get(s[i])+1));
    }

    long ans = 0;
    for (Map.Entry<String, Integer> entry: list.entrySet()) {
      int cnt = entry.getValue();
      for (int i = 0; i <= cnt; i++) {
        ans += i;
      }
    }
    
    System.out.println(ans);
  }
}
