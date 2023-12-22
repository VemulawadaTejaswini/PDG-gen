import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[4];
    for(int i = 0; i < 4; i++) {
      a[3 - i] = n % 10;
      n /= 10;
    }
    String[] op = new String[3];
    int flg = 0;
    for(int i = 0; i < 2; i++) {
      for(int j = 0; j < 2; j++) {
        for(int k = 0; k < 2; k++) {
          int f = a[0];
          if(i == 0) {
            f += a[1];
            op[0] = "+";
          } else {
            f -= a[1];
            op[0] = "-";
          }
          if(j == 0) {
            f += a[2];
            op[1] = "+";
          } else {
            f -= a[2];
            op[1] = "-";
          }
          if(k == 0) {
            f += a[3];
            op[2] = "+";
          } else {
            f -= a[3];
            op[2] = "-";
          }
          if(f == 7) {
            flg = 1;
            break;
          }
        }
        if(flg == 1) break;
      }
      if(flg == 1) break;
    }
    String ans = a[0] + op[0];
    for(int i = 1; i < 3; i++) {
      ans += (a[i] + op[i]);
    }
    ans += (a[3] + "=7");
    System.out.println(ans);
  }
}