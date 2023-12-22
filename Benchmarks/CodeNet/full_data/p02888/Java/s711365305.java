import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] l = new int[n];
    int ans = 0;
    
    for (int i = 0; i < n; i++) {
      l[i] = sc.nextInt();
      if (i >= 2) {
        for (int j = 0; j < i; j++) {
          for (int k = 0; k < j; k++) {
            if (l[i] + l[j] > l[k] && l[j] + l[k] > l[i] && l[i] + l[k] > l[j]) ans++;
          }
        }
      }
    }
    
    System.out.println(ans);
  }
}
