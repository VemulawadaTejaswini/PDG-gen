import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int s = sc.nextInt();

    sc.close();

    int[] v = new int[1000000];
    int[] a = new int[1000000];

    for (int i = 1; i < 1000000; i++) {
      if (i == 1) {
        v[s] = i;
        a[i] = s;
      } else {
        int v_ = func(a[i-1]);
        if (v[v_] != 0) {
          System.out.println(i);
          break;
        } else {
          v[v_] = i;
          a[i] = v_;
        }
      }
    }

  }

  public static int func(int n){

    if (n % 2 == 0) {
      return n / 2;
    } else {
      return 3 * n + 1;
    }
  }

}