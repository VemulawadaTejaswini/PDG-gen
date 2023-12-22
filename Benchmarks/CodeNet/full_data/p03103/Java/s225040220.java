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


  static class pair implements Comparable{
          public long a;
          public long b;

          pair(){
              this.a = 0;
              this.b = 0;
          }

    @Override
    public int compareTo(Object o) {

            if(((pair)o).a > this.a)return -1;
        if(((pair)o).a < this.a)return 1;

      return 0;
    }

    pair(long a, long b){
              this.a = a;
              this.b = b;
          }

          public void set(long a, long b) {
              this.a = a;
              this.b = b;
          }
      }



  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();


    pair[] map = new pair[N];

    for (int i = 0; i < N; i++) {

        long tempa = scanner.nextLong();
        long tempb = scanner.nextLong();
        map[i] = new pair(tempa, tempb);

    }

    Arrays.sort(map);

    int cnt = 0;
    long ans = 0;

      for (int i = 0; i < N; i++) {
//          System.out.println(map[i].a);
//          if(cnt >= M)break;

//          System.out.println(ans + " " + cnt);
          if(cnt + map[i].b >= M){
//              cnt = M;
              ans += map[i].a * (M - cnt);
              break;
          }else{
              cnt += map[i].b;
              ans += map[i].a * map[i].b;
          }

//          if(cnt >= M)break;

      }


      System.out.println(ans);

//    System.out.println(getAns());





  }

//  static public int getAns(){
//    Scanner scanner = new Scanner(System.in);
//
//    int w = scanner.nextInt();
//
//
//
//
//    return (H - h) * (W - w);
//  }

}
