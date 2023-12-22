import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int Q = sc.nextInt();
    int[] A = new int[N];
    Arrays.fill(A, K-Q);
    for (int i = 0; i < Q; i++) {
      int a = sc.nextInt();
      A[a-1]++;
    }
    for (int a : A) {
      if (a > 0) {
        System.out.println("Yes"); 
      } else {
        System.out.println("No");
      }
    }
  }
}