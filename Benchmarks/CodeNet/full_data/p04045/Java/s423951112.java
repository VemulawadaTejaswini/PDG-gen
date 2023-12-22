import java.util.*;


public class Main {
  static int N, K;
  static int[] D;

  public static boolean isOK(int n) {
    while(n > 0) {
      int d = n % 10;
      for(int i = 0 ; i < K; i++) {
        if(D[i] == d) return false;
      }
      n /= 10;
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    N = sc.nextInt();
    K = sc.nextInt();

    D = new int[K];
    for(int i = 0; i < K; i++) {
      D[i] = sc.nextInt();
    }

    int n = N;
    while(!isOK(n)) n++;

    System.out.println(n);
  }
}
