import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();
    
    Integer[] d = new Integer[k];
    for (int i = 0; i < k; i++) {
      d[i] = sc.nextInt();
    }

    boolean ok = true;
    while (ok) {
      int a1 = n / 10000;
      int a2 = (n % 10000) / 1000;
      int a3 = (n % 1000) / 100;
      int a4 = (n % 100) / 10;
      int a5 = n % 10;

      boolean ng1 = (n >= 10000 ? Arrays.asList(d).contains(a1) : false);
      boolean ng2 = (n >= 1000 ? Arrays.asList(d).contains(a2) : false);
      boolean ng3 = (n >= 100 ? Arrays.asList(d).contains(a3) : false);
      boolean ng4 = (n >= 10 ? Arrays.asList(d).contains(a4) : false);
      boolean ng5 = Arrays.asList(d).contains(a5);

      if (ng1 || ng2 || ng3 || ng4 || ng5) {
        n++;
      } else ok = false;
    }

    System.out.println(n);
  }
}