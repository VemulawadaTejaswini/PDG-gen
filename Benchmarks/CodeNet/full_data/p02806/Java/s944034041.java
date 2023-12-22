import java.util.*;

public class Main {
  public static void main(String[] args) {
    final Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
    for (int i = 0; i < N; ++i) {
      String S = sc.next();
      int T = sc.nextInt();
      map.put(S, T);
    }
    String X = sc.next();
    sc.close();

    String title = "";
    int loaded = 0;
    int sum = 0;
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      title = entry.getKey();
      sum += entry.getValue();
      if (title.equals(X)) {
        loaded = sum;
      }
    }

    System.out.println(sum - loaded);
  }
}