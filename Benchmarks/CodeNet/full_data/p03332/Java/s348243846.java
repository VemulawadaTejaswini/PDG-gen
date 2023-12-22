import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    long K = sc.nextLong();
    solve(N, A, B, K);
  }

  private static void solve(int N, int A, int B, long K) {
    
    long q[] = new long[300001];
    long MAGIC = 998244353;
    q[0] = 1;
    for (int i=1; i<=N; i++) {
      q[i] = q[i-1] * i % MAGIC;
    }
    
    long ans = 0;
    
    for (int numA=0; numA<=N; numA++) {
      long remain = K - (A*numA);
      if (remain % B == 0) {
        int numB = (int) (remain / B);
        int minAB = (numA > numB) ? numA : numB;
        for (int finC = 0; finC <= minAB; finC++) {
          int finA = numA - finC;
          int finB = numB - finC;
          int finD = N - finA - finB - finC;
          if (finD >= 0 && finB >= 0 && finA >= 0) {
            long tmp = (((((q[finA]*q[finB]) % MAGIC) * q[finC]) % MAGIC) * q[finD]) % MAGIC;
            ans += q[N]/tmp;
          }
        }
      }
    }
    System.out.println(ans % MAGIC);
  }
}
