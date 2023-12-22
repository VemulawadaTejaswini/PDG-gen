import java.util.*;


public class Main {
  static int N, K;
  static boolean[] D;
  static int A;

  public static boolean isOK() {
    int a = A;
    while(a > 0) {
      if(D[a % 10]) return false;
      a = a / 10;
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    N = sc.nextInt();
    K = sc.nextInt();
    D = new boolean[10];
    for(int i = 0; i < K; i++) {
      int d = sc.nextInt();
      D[d] = true;
    }

    A = N;
    while(!isOK()) A++;

    System.out.println(A);
  }
}
