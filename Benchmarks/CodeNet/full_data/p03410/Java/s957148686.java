import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    int ans = 0;
    for(int i = 0; i < n; i++) a[i] = sc.nextInt();
    for(int i = 0; i < n; i++) b[i] = sc.nextInt();
    for(int i = 0; i < n; i++) {
      for(int j = 0; j < n; j++) {
        ans ^= a[i] + b[j];
      }
    }
    System.out.println(ans);
  }
}