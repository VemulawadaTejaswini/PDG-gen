import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt(), B = sc.nextInt();
    int C = sc.nextInt(), X = sc.nextInt(), Y = sc.nextInt();
    
    System.out.println(solve(A,B,C,X,Y));
  }

  private static long solve(int A, int B, int C, int X, int Y) {
    long ret = 1L<<60;
    for(int ab = 0; ab<=Math.max(X, Y)*2; ab++) {
      long temp = ab * C;
      // 買うべきA, Bの枚数
      int a = X-ab/2, b = Y-ab/2;
      if(a<0)a=0;
      if(b<0)b=0;
      temp += a*A + b*B;
      ret = Math.min(ret, temp);
    }
    return ret;
  }
}
