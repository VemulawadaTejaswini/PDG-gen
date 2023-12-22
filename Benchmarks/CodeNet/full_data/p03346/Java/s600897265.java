import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] idx = new int[N];
    for (int i = 0; i < N; i++) {
      int P = sc.nextInt();
      idx[--P] = i;
    }
    
    int minIdx = 0;
    for (int i = N-2; i >= 0; i--) {
      if (idx[i] > idx[i+1]) {
        idx[i] = --minIdx;
      }
    }
    
    System.out.println(-minIdx);
  }
}