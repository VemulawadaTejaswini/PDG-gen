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

          pair(long a, long b){
              this.a = a;
              this.b = b;
          }

          public void set(long a, long b) {
              this.a = a;
              this.b = b;
          }

    @Override
    public int compareTo(Object o) {

        if(((pair)o).b > this.b)return 1;
        if(((pair)o).b < this.b)return -1;
      return 0;
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    int N = scanner.nextInt();
    int M = scanner.nextInt();
    pair[] p = new pair[M];
    long[] map = new long[N];
    long ans = 0;
    for (int i = 0; i < N; i++) {
      map[i] = scanner.nextLong();
      ans += map[i];
    }

      for (int i = 0; i < M; i++) {
          p[i] = new pair();
          p[i].a = scanner.nextInt();
          p[i].b = scanner.nextLong();

      }

    Arrays.sort(map);
    Arrays.sort(p);

int j = 0;
int cnt = 0;
      for (int i = 0; i < N; i++) {
         if(map[i] > p[j].b) {
             break;
         }else{
//             System.out.println(map[i] + " " + p[j].b);
             ans += p[j].b - map[i];
             cnt++;
             if(cnt == p[j].a){
                 j++;
                 cnt=0;
             }
             if(j >= M)break;
         }
      }

      System.out.println(ans);

  }
}

