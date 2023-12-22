import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();

    int Porder = 0;
    int[] P = new int[N];
    for(int i=0; i<N; i++) {
      P[i] = scan.nextInt();
      int underCount = 0;
      for(int j=0; j<i; j++) {
        if(P[j] < P[i]) {
          underCount++;
        }
      }
      Porder += kaijo(N-i-1) * (P[i]-underCount-1);
    }

    int Qorder = 0;
    int[] Q = new int[N];
    for(int i=0; i<N; i++) {
      Q[i] = scan.nextInt();
      int underCount = 0;
      for(int j=0; j<i; j++) {
        if(Q[j] < Q[i]) {
          underCount++;
        }
      }
      Qorder += kaijo(N-i-1) * (Q[i]-underCount-1);
    }

    System.out.println(Math.abs(Porder - Qorder));

    scan.close();
  }

  public static int kaijo(int N) {
    int result = 1;
    for(int i=1; i<=N; i++) {
      result *= i;
    }
    return result;
  }
}