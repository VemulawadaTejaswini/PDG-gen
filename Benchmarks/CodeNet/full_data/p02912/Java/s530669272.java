import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = Integer.parseInt(sc.next());
      int m = Integer.parseInt(sc.next());

      long ans = 0;

      long[] a = new long[n];
      for(int i=0;i<n;i++){
        a[i] = sc.nextLong();
      }

      for(int i=1;i<=m;i++){
        Arrays.sort(a);
        a[n-1] = a[n-1]/2;
      }

      for(int i=0;i<n;i++){
        ans += a[i];
      }

      System.out.println(ans);


    }
}
