import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    List<Map<Character, Integer>> list = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      String a = sc.next();
      Map<Character, Integer> m = new HashMap<>();
      list.add(m);
      for (char c : a.toCharArray()) {
        m.put(c, m.getOrDefault(c, 0) + 1);
      }
    }
    
    long ans = 0;
    for (int i = 0; i < N; i++) {
      for (int j = i+1; j < N; j++) {
        if (list.get(i).equals(list.get(j))) {
          ans++;
        }
      }
    }
    
    System.out.println(ans);
  }
}