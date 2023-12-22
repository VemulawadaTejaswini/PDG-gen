import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long y = sc.nextLong();
    int ans1 = -1;
    int ans2 = -1;
    int ans3 = -1;
    for(int i = 0; i <= n; i++) {
      for(int j = 0; j <= (n - i); j++) {
        int k = n - (i + j);
        long t = (long)10000 * (long)i + (long)5000 * (long)j + (long)1000 * (long)k;
        if(t == y) {
          ans1 = i;
          ans2 = j;
          ans3 = k;
        }
      }
    }
    System.out.println(ans1 + " " + ans2 + " " + ans3);
  }
}