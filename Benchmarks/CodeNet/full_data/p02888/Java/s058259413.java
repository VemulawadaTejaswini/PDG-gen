import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] l = new int[n];
    for(int i = 0; i < n; i++) {
      l[i] = sc.nextInt();
    }
    Arrays.sort(l);
    long ans = 0;
    for(int i = 0; i < n; i++) {
      for(int j = i + 1; j < n; j++) {
        int t = l[i] + l[j];
        int left = 0;
        int right = n;
        int k = 0;
        while(left < right) {
          int med = (left + right) / 2;
          if(l[med] < t) {
            k = med;
            left = med + 1;
          } else {
            right = med;
          }
        }
        ans += ((long)Math.max(0, k - j));
      }
    }
    System.out.println(ans);
  }
}
