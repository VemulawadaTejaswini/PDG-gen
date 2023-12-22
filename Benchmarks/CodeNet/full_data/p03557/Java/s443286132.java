import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    Arrays.sort(A);

    int[] B = new int[N];
    for (int i = 0; i < N; i++) {
      B[i] = sc.nextInt();
    }
    
    int[] C = new int[N];
    for (int i = 0; i < N; i++) {
      C[i] = sc.nextInt();
    }
    Arrays.sort(C);

    //
    long ans = 0;
    for (int i = 0; i < N; i++) {
      ans += solve(A, B[i], C);
    }

    System.out.println(ans);
  }
  
  private static long solve(int[] A, int b, int[] C) {

    long ret = 0;
    
    int l = 0;
    int r = A.length - 1;
    int target = -1;
    while (l <= r) {
      int mid = (l+r)/2;
      if (A[mid] < b) {
        target = mid;
        l = mid + 1;
      } else {
        r = mid - 1;
      }
    }
    if (target == -1) {
      return 0;
    }
    ret += target + 1;

    l = 0;
    r = C.length - 1;
    target = -1;
    while (l <= r) {
      int mid = (l+r)/2;
      if (b < C[mid]) {
        target = mid;
        r = mid - 1;
      } else {
        l = mid + 1;
      }
    }
    if (target == -1) {
      return 0;
    }
    ret *= C.length - target;
    
    return ret;
  }
}