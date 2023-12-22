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

    int N = scanner.nextInt();

    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int C = scanner.nextInt();

    int[] bou = new int[8];
    for (int i = 0; i < N; i++) {
      bou[i] = scanner.nextInt();
    }

    int ans  = 99999999;

    for (int a = 0; a < 4; a++) {
      for (int b = 0; b < 4; b++) {
        for (int c = 0; c < 4; c++) {
          for (int d = 0; d < 4; d++) {
            for (int e = 0; e < 4; e++) {
              for (int f = 0; f < 4; f++) {
                for (int g = 0; g < 4; g++) {
                  for (int h = 0; h < 4; h++) {

                   int[] map = new int[4];
                   int[] cnt = new int[4];

                    map[a] += bou[0];
                    map[b] += bou[1];
                    map[c] += bou[2];
                    map[d] += bou[3];
                    map[e] += bou[4];
                    map[f] += bou[5];
                    map[g] += bou[6];
                    map[h] += bou[7];

                    cnt[a] += 1;
                    cnt[b] += 1;
                    cnt[c] += 1;
                    cnt[d] += 1;
                    cnt[e] += 1;
                    cnt[f] += 1;
                    cnt[g] += 1;
                    cnt[h] += 1;





                    map[0] = 99999999;

                    Arrays.sort(map);

                    int cost = 0;
//                    System.out.println(map[0] + " " + map[1] + " " + map[2]);

                    if(map[0] == 0 || map[1] == 0 || map[2] == 0)cost += 129348;

                    cost += Math.abs(map[0] - C);

                    cost += Math.abs(map[1] - B);
                    cost += Math.abs(map[2] - A);
                    cost += Math.max(0, (cnt[1] - 1) * 10);
                      cost += Math.max(0, (cnt[2] - 1) * 10);
                      cost += Math.max(0, (cnt[3] - 1) * 10);

//                    ans = Math.min(ans, cost);
                    if(ans > cost){

//                        System.out.println(map[0] + " " + map[1] + " " + map[2]);
                        ans = cost;
                    }

                  }
                }
              }
            }
          }
        }
      }
    }


    System.out.println(ans);
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
      ans[2] = s[r] - x + x - t[ll] + Math.min(s[r] - x, x - t[ll]);
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
