import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String dummy = sc.nextLine();

    String[] s = sc.nextLine().split(" ");
    String[] t = sc.nextLine().split(" ");
    
    int[] a = new int[n+1];
    int[] b = new int[n];

    for (int i = 0; i < n + 1; i++) {
      a[i] = Integer.parseInt(s[i]);
      if (i < n) b[i] = Integer.parseInt(t[i]);
    }
    
    int sum = 0;
    int rep = 0;
    for (int i = 0; i < n + 1; i++) {
      a[i] -= rep;
      int m = (i < n ? Math.min(a[i], b[i]) : 0) + rep;
      sum += m;
      if (i < n) rep = Math.min(Math.max(b[i] - a[i] , b[i]), a[i+1]); // 余力
      // System.out.println("m:" + m + " rep:" + rep + " a:" + a[i] + " sum:" + sum);
    }
    
    System.out.println(sum);
  }
}
