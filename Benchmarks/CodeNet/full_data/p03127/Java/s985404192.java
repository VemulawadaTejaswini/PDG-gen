import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long[] A = new long[N];
    for (int i =0; i<N; i++) {
      A[i] = sc.nextLong();
    }
    Arrays.sort(A);
    long min = 1000000000;
    for (int i =0; i<N-1; i++) {
      min = Math.min(gcm(A[i],A[i+1]),min);
    }
    System.out.println(min);
  }
  
  public static long gcm(long a, long b) {
    if (a%b == 0) {
      return b;
    } else {
      return gcm(b,a%b);
    }
  }
}