import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int p1 = 0;
    int p2 = 0;
    int[] a = new int[n];
    int[] b = new int[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    for(int i = 0; i < n; i++) {
      b[i] = sc.nextInt();
    }
    for(int i = 0; i < n; i++) {
      if(a[i] >= b[i]) {
        p2 += (a[i] - b[i]);
      } else {
        p1 += ((b[i] - a[i]) / 2);
      }
    }
    String ans = "No";
    if(p1 >= p2) ans = "Yes";
    System.out.println(ans);
  }
}
