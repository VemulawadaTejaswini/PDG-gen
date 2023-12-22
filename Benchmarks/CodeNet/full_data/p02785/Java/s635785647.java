import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    List<String> hlist = new ArrayList<String>();
    for (int i = 0; i < n; i++) {
      hlist.add(sc.next());
    }
    Collections.sort(hlist, Collections.reverseOrder());

    long[] h = new long[n];
    for (int i = 0; i < n; i++) {
      h[i] = Long.parseLong(hlist.get(i));
    }

    long ans = 0;
      for (int i = k - 1 + 1; i < n; i++) {
        ans += h[i];
      }

    System.out.println(ans);

  }
}
