import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int n = Integer.parseInt(sc.next());
    long a[] = new long[n];
    for (int i = 0; i < n; i++) {
      a[i] = Long.parseLong(sc.next());
    }
    int l = 0, r = 1;
    long sum = a[0], xor = a[0];
    int ans = 1, count = 1;
    while (r < n) {
      sum += a[r];
      xor ^= a[r];
      count++;
      if (sum != xor) {
        while (l < r) {
          sum -= a[l];
          xor ^= a[l];
          l++;
          count--;
          if (sum == xor) {
            break;
          }
        }
      }
      ans += count;
      r++;
    }
    
    System.out.println(ans);
  }
}