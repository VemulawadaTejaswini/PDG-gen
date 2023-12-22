import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] a = new int[100];
    int ans = 0;
    for(int i = 0; i < 3; i++) {
      int c = sc.nextInt() - 1;
      if(a[c] > 0) {
        a[c]++;
      } else {
        ans++;
        a[c]++;
      }
    }
    System.out.println(ans);
  }
}