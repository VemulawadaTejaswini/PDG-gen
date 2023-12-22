import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    int ans = 0;
    for(int u = 0; u < (n - 1); u++) {
      String str = s.substring(u);
      int t = str.length();
      int[] z = new int[t];
      z[0] = t;
      int i = 1;
      int j = 0;
      while(i < t) {
        while(((i + j) < t) && (str.charAt(j) == str.charAt(i + j))) j++;
        z[i] = j;
        if(j == 0) {
          i++;
          continue;
        }
        int k = 1;
        while((k < j) && ((k + z[k]) < j)) {
          z[i + k] = z[k];
          k++;
        }
        i += k;
        j -= k;
      }
      for(int y = 1; y < t; y++) {
        ans = Math.max(ans, Math.min(z[y], y));
      }
    }
    System.out.println(ans);
  }
}
