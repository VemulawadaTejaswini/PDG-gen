import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] idx1 = new int[N];
    int[] idx2 = new int[N];
    for (int i = 0; i < N; i++) {
      int P = sc.nextInt();
      P--;
      idx1[P] = i;
      idx2[P] = i;
    }
    
    int minIdx = 0;
    for (int i = N-2; i >= 0; i--) {
      if (idx1[i] > idx1[i+1]) {
        idx1[i] = --minIdx;
      }
    }
    int maxIdx = N-1;
    for (int i = 0; i < N-1; i++) {
      if (idx2[i] > idx2[i+1]) {
        idx2[i+1] = ++maxIdx;
      }
    }
    
    System.out.println(Math.min(-minIdx, maxIdx-N+1));
  }
}
