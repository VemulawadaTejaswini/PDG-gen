import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    Arrays.sort(a);
    int pos = 0;
    int[] b = new int[n];
    for(int i = 0; i < n; i++) {
      if(a[pos] + 2 >= a[i]) {
      } else {
        b[pos] = i - pos;
        pos++;
        i--;
      }
    }
    if(b[0] == 0) b[0] = n; 
    int ans = 0;
    for(int i = 0; i < n; i++) {
      ans = Math.max(ans, b[i]);
    }
    if(n > 1) {
      System.out.println(ans);
    } else {
      System.out.println(1);
    }
  }
}