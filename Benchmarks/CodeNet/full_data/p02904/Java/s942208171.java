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

    String[] s = new String[n-(n-k)];
    int cnt = 1;
    for (int i = 0; i < (n-(n-k)); i++) {
      s[i] = "";
      String q[] = p.substring(i, i+k).split("");
      Arrays.sort(q);
      String t = "";
      for (int j = 0; j < k; j++) {
        t += q[j];
      }
      if (i > 0) s[i] += p.substring(0, i);
      s[i] += t;
      if (i < (n-k)) s[i] += p.substring(i+k, n);
      h.add(s[i]);
    }

    System.out.println(h.size());

  }
}