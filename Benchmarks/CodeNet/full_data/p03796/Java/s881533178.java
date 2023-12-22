import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner S = new Scanner(System.in);
    int N = S.nextInt();
    int Ans = 1;
    for (int i = 1; i < N; i++) {
      Ans *= i;
      if (Ans >= 100000007){
        Ans /= 100000007;
      }
    }
    System.out.println(Ans);
  }
}
