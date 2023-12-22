import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long K = sc.nextLong();
    long[] A = new long[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextLong();
    }
    
    long ans = 0;
    for (int a = 60; a >= -1; a--) {
      long maskA = 1L<<a;
      if (a != -1 && (K&maskA) == 0) continue;
      long tmp = 0;
      for (int b = 60; b >= 0; b--) {
        long maskB = 1L<<b;
        
        int bitNum = 0;
        for (int i = 0; i < N; i++) {
          if ((A[i]&maskB) != 0) bitNum++;
        }

        if (b > a) {
          if ((K&maskB) != 0) {
            tmp += (N-bitNum)*maskB;
          } else {
            tmp += bitNum*maskB;
          }
        } else if (b == a) {
           tmp += bitNum*maskB;
        } else {
          tmp += bitNum > N-bitNum ? bitNum*maskB : (N-bitNum)*maskB ;
        }
      }
      ans = Math.max(ans, tmp);
    }
    
    System.out.println(ans);
  }
}
