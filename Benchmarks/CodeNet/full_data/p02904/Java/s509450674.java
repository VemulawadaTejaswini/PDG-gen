import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();

    int[] o = new int[n];
    String p = "";
    for (int i = 0; i < n; i++) {
      o[i] = sc.nextInt();
      p += o[i];
    }

    HashSet<String> h = new HashSet<>();

    int a = n - (k - 1);
    for (int i = 0; i < a; i++) {
      String s = "";
      String t = "";
      String q[] = p.substring(i, i+k).split("");
      Arrays.sort(q);
      for (int j = 0; j < k; j++) {
        t += q[j];
      }
      if (i > 0) s += p.substring(0, i);
      s += t;
      if (i < (n-k)) s += p.substring(i+k, n);
      h.add(s);
    }

    System.out.println(h.size());

  }
}