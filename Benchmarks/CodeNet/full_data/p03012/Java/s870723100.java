import java.util.*;
public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] W = new int[N+1];
    for (int i = 1; i <= N; i++) {
      W[i] = sc.nextInt();
    }

    int[] sumL2R = new int[N+1];
    for (int i = 1; i <= N; i++) {
      sumL2R[i] = sumL2R[i-1] + W[i];
    }
    int[] sumR2L = new int[N+1];
    sumR2L[N] = W[N];
    for (int i = N-1; i >= 1; i--) {
      sumR2L[i] = sumR2L[i+1] + W[i];
    }
    
    int minIndex = 1;
    int minDiff = Integer.MAX_VALUE;
    for (int i = 1; i <= N-1; i++) {
      int diff = Math.abs(sumL2R[i]-sumR2L[i+1]);
      if (diff < minDiff) {
        minIndex = i;
        minDiff = diff;
      }
    }
    
//    System.out.println(Arrays.toString(sumL2R));
//    System.out.println(Arrays.toString(sumR2L));
//    System.out.println("index: " + minIndex);
//    System.out.println("diff: " + minDiff);
    System.out.println(minDiff);
  }  
}