import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();

    String[] s = new String[N];

    for (int i = 0; i < N; i++) {
      s[i] = sc.next();
    }

    int M = sc.nextInt();

    String[] t = new String[M];

    for (int i = 0; i < M; i++) {
      t[i] = sc.next();
    }

    sc.close();

    HashMap<String, Integer> map = new HashMap<String, Integer>();

    for (int i = 0; i < N; i++) {
      if (map.containsKey(s[i])) {
        int count = map.get(s[i]);
        map.put(s[i],count + 1);
      } else {
        map.put(s[i],1);
      }
    }

    for (int i = 0; i < M; i++) {
      if (map.containsKey(t[i])) {
        int count = map.get(t[i]);
        map.put(t[i],count - 1);
      } else {
        map.put(t[i],-1);
      }
    }

    int count = 0;

    Set<String> keys = map.keySet();

    for (int i = 0; i < keys.size(); i++) {
      String key = keys.toArray(new String[0])[i];
      count = Math.max(count, map.get(key));
    }

    System.out.println(count);

  }

}