import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Santa.
 */
public class Main {

  static int N;
  static int K;
  static long Q;
  static int A;
  static int B;
  static long C;
  static double min = 9999999;
  static long ans = 0;




  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    A = scanner.nextInt();

    B = scanner.nextInt();

    int Q = scanner.nextInt();

    long[] s = new long[A + 2];
    long[] t = new long[B + 2];


    s[0] = 0;
    for (int i = 1; i <= A; i++) {
      s[i] = scanner.nextLong();
    }
    s[A + 1] = 10000000001L;
    t[0] = 0;
    for (int i = 1; i <= B; i++) {
      t[i] = scanner.nextLong();

    }
    t[B + 1] = 10000000001L;


//    Arrays.sort(s);
//    Arrays.sort(t);dd

//    System.out.println("ok");

    for (int i = 0; i < Q; i++) {
      long x = scanner.nextLong();
      System.out.println(retAns(s,t, x));
    }


  }

  public static long  retAns(long[] s, long[] t, long x){
    int l = 0;
    int r = A + 1;
    int mid;
    while(l + 1 < r){
      mid = (l + r) / 2;
      if(s[mid] > x){
        r = mid;
      }else{
        l = mid;
      }
//      System.out.println(l + " " + r );
    }

//    System.out.println(l + " " + r);

//    System.out.println(s[l] + " " + s[r]);
    int ll = 0;
    int rr = B + 1;

    while(ll + 1  < rr){
      mid = (ll + rr) / 2;
      if(t[mid] > x){
        rr = mid;
      }else{
        ll = mid;
      }
//      System.out.println("o");
    }

//    System.out.println(t[ll] + " " + t[rr]);


    long[] ans = new long[4];

    if(l == 0 || ll == 0){
      ans[0] = 999999999999999999L;
    }else{
      ans[0] = Math.max(x - s[l], x - t[ll]);
    }

    if(l == 0 || rr == B + 1){
      ans[1] = 999999999999999999L;
    }else{
      ans[1] = x - s[l] + t[rr] - x + Math.min(x - s[l], t[rr] - x);
    }

    if(r == A + 1 || ll == 0){
      ans[2] = 999999999999999999L;
    }else{
      ans[2] = s[r] - x + t[ll] + Math.min(s[r] - x, x - t[ll]);
    }

    if(r == A + 1 || rr == B + 1){
      ans[3] = 999999999999999999L;
    }else{
      ans[3] = Math.max(s[r] - x , t[rr] - x) ;
    }


//    System.out.println();
//    System.out.println("ans = ");
    long min = 999999999999999999L;
    for (int i = 0; i < 4; i++) {
      min = Math.min(min, ans[i]);
//      System.out.println(ans[i]);
    }


//    System.out.println(min);












    return min;
  }


}
