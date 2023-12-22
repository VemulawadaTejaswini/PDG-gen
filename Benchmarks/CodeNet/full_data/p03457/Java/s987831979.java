import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int[] time = new int[n];
    int[] x = new int[n+1];
    int[] y = new int[n+1];
    x[0] = 0;
    y[0] = 0;
    for(int i = 1; i <= n; i++) {
      time[i-1] = Integer.parseInt(sc.next());
      x[i] = Integer.parseInt(sc.next());
      y[i] = Integer.parseInt(sc.next());
    }
    boolean flag = true;
    for(int i = 1; i <= n; i++) {
      if(Math.abs(x[i] - x[i-1]) + Math.abs(y[i] - y[i-1]) <= time[i-1]) {
        if(Math.abs(x[i] - x[i-1]) + Math.abs(y[i] - y[i-1]) % 2 == time[i-1] % 2) continue;
      }
      flag = false;
    }
    System.out.println((flag)? "Yes" : "No");
  }
}
