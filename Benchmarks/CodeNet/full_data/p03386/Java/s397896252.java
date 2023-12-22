import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      Scanner in = new Scanner(System.in);

      int A = in.nextInt();
      int B = in.nextInt();
      int K = in.nextInt();
      int a = A;
      int cnt = 0;

      // A〜Bの範囲を超えて探索しないように
      if(K > B) {
          K = B-A+1;
      }
      // 小さい方から出力
      while(cnt < K) {
          System.out.println(a);
          a++;
          cnt++;
      }
      // 大きい方から出力
      int cnt2 = 0;
      int b = B - K + 1;
      while(cnt2 < K) {
          if(b >= a) {
              System.out.println(b);
          }
          cnt2++;
          b++;
      }

    }

}
