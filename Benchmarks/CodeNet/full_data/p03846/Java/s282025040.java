import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    
    int[] count = new int[100000];

    for (int i = 0; i < N; i++) {
      int a_ = Integer.valueOf(sc.next());
      count[a_]++;
    }

    sc.close();

    long mod = 1000000000 + 7;

    // Nが偶数の場合はtrue、奇数の場合はfalse
    boolean isEven = false;

    if (N % 2 == 0) {
      isEven = true;
    }

    if (isEven) {

      for (int i = 0; i < 100000; i++) {
        if (i == 0) {
          if (count[i] != 0) {
            System.out.println(0);
            return;
          }
        } else {
          if (i < N) {
            if (i % 2 == 1) {
              if (count[i] != 2) {
                System.out.println(0);
                return;
              }
            } else {
              if (count[i] != 0) {
                System.out.println(0);
                return;
              }
            }
          } else {
            if (count[i] != 0) {
              System.out.println(0);
              return;
            }
          }
        }
      }

    } else {

      for (int i = 0; i < 100000; i++) {
        if (i == 0) {
          if (count[i] != 1) {
            System.out.println(0);
            return;
          }
        } else {
          if (i < N) {
            if (i % 2 == 0) {
              if (count[i] != 2) {
                System.out.println(0);
                return;
              }
            } else {
              if (count[i] != 0) {
                System.out.println(0);
                return;
              }
            }
          } else {
            if (count[i] != 0) {
              System.out.println(0);
              return;
            }
          }
        }
      }

    }

    long[] result = new long[N];

    if (isEven) {
      
      result[0] = 2;
      
      if (2 < N) {
        result[2] = 4;
      }
      
      for (int i = 3; i < N; i++) {
        if (i%2 == 1) {
          result[i] = result[i-1];
        } else {
          result[i] = result[i-1] * 2 % mod;
        }
      }

    } else {
      
      result[0] = 1;
      
      if (1 < N) {
        result[1] = 2;
      }

      for (int i = 2; i < N; i++) {
        if (i%2 == 0) { 
          result[i] = result[i-1];
        } else {
          result[i] = result[i-1] * 2 % mod;
        }
      }

    }

    System.out.println(result[N-1]);

  }

}