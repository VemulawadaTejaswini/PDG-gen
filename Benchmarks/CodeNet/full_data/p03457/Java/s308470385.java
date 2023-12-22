import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int[] time = new int[n+1];
    int[] x = new int[n+1];
    int[] y = new int[n+1];
    time[0] = 0;
    x[0] = 0;
    y[0] = 0;
    for(int i = 1; i <= n; i++) {
      time[i] = Integer.parseInt(sc.next());
      x[i] = Integer.parseInt(sc.next());
      y[i] = Integer.parseInt(sc.next());
    }
    int dis, dtime;
    boolean flag = true;
    for(int i = 1; i <= n; i++) {
      dis = Math.abs(x[i] - x[i-1]) + Math.abs(y[i] - y[i-1]);
      dtime = time[i] - time[i-1];
      if(!(dis <= dtime && dis % 2 == dtime % 2)) flag = false;
      if(!flag) break;
    }
    System.out.println((flag)? "Yes" : "No");
  }
}
