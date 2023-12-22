import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int c = sc.nextInt();
    int[] a = new int[m];
    for (int i = 0; i < m; i++){
      a[i] = sc.nextInt();
    }
    int ans = 0;
    for (int i = 0; i < n; i++){
      int s = 0;
      for (int j = 0; j < m; j++){
        int b = sc.nextInt();
        s += a[j] * b;
      }
      if (s+c > 0) ans++;
    }
    System.out.println(ans);
  }
}