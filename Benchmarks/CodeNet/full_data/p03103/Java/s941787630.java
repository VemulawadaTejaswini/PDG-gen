import java.util.*;
import java.math.BigInteger;

public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      BigInteger cost = new BigInteger("0");
      int[][] arr = new int[n][2];
      for(int i = 0; i < n; i++) {
        arr[i][0] = sc.nextInt();
        arr[i][1] = sc.nextInt();
      }
      Arrays.sort(arr, (a1, a2) -> a1[0] - a2[0]);
      for(int i = 0; i < n && m > 0; i++) {
        long cnt = Math.min(arr[i][1], m);
        cost = cost.add(BigInteger.valueOf(cnt * arr[i][0]));
        m -= cnt;
      }
      System.out.println(cost.toString());
  }
}