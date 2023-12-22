import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] a = new int[n];
    int b = 0;
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      if(a[i] == 1) b = i;
    }
    int t = 0;
    int c_0 = b;
    int c_1 = b;
    for(int i = 0; i < n; i++) {
      if(c_0 <= 0) break;
      c_0 -= (k - 1);
      t++;
      if(c_0 <= 0) break;
    }
    for(int i = 0; i < n; i++) {
      if(c_1 >= n - 1) break;
      c_1 += (k - 1);
      t++;
      if(c_1 >= n - 1) break;
    }
    System.out.println(t);
  }
}