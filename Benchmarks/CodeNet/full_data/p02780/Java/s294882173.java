import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
    int K = sc.nextInt();
    double[] d = new double[N];
    for (int i = 0; i < N; i++) {
       d[i] = 1.0 + 0.5*(sc.nextInt()-1);
    }
    double max = 0;
    for (int i = 0; i < K; i++) {
      max += d[i]; 
    }
    double total = max;
    for (int i = 0; i < N-K; i++) {
      total = total -d[i] + d[i+K];
      max = Math.max(max, total);
    }
    System.out.println(max);
  }
}