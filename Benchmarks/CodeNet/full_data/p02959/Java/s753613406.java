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
    
    long sum = 0;
    long rep = 0;
    for (int i = 0; i < n; i++) {
      a[i] -= rep;
      sum += Math.min(a[i] + a[i+1], b[i]);
      if (a[i] > b[i]) {
        rep = 0;
      } else {
        rep = Math.min(b[i] - a[i], a[i+1]);
      }
      // System.out.println("a:" + a[i] + " m:" + m + " rep:" + rep + " sum:" + sum);
    }
    
    System.out.println(sum);
  }
}
