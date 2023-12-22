import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    String[] a = new String[n];

    for (int i = 0; i < n; i++) {
      a[i] = sc.next();
    }

    sc.close();

    String[] dp1 = new String[n];
    String[] dp2 = new String[n];

    dp1[0] = a[0];
    dp2[0] = a[0];

    for (int i = 1; i < n; i++) {
      dp1[i] = a[i] + " " + dp2[i - 1];
      dp2[i] = dp1[i - 1] + " " + a[i];
    }

    System.out.println(dp1[n - 1]);

  }

}
