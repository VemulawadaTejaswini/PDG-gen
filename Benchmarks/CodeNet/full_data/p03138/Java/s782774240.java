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
  static long B;
  static long C;
  static double min = 9999999;
  static long ans = 0;




  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    long K = scanner.nextLong();

    long[] map = new long[N];
    long[] maru = new long[51];
    for (int i = 0; i < N; i++) {
      map[i] = scanner.nextLong();

      int j = 0;
      while(map[i] > 0){
        maru[j] += (int)(map[i] & 1);
        map[i] = map[i] >> 1;
        j++;
//        System.out.println(j);
      }
    }

//    for (int i = 0; i < 50; i++) {
//      System.out.println(maru[i]);
//    }

    long ans = 0;
    long total = 0;
    for (int i = 49; i >= 0; i--) {

      if(maru[i] * 2 < N){
        if(total + ((long)1 << i) < K){
          total += ((long)1 << i);
          ans += (N - maru[i]) * ((long)1 << i);
        }else{
          ans += maru[i] * ((long)1 << i);
        }
      }else{
        ans += maru[i] * ((long)1 << i);
      }
//
//      if(total + (1 << i) < K){
//        if(maru[i] * 2 < N){
//          total += 1 << i;
//          ans += (N - maru[i]) * (1 << i);
//        }
//      }else{
//        ans += maru[i] * (1 << i);
//      }
    }

    System.out.println(ans);

  }

}
