import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int Q = sc.nextInt();
    int H = Math.min(sc.nextInt(), Q*2);
    int S = Math.min(sc.nextInt(), H*2);
    int D = Math.min(sc.nextInt(), S*2);
    long N = sc.nextLong();
    
    if (S * 2 <= D) {
      System.out.println(S * N);
    } else if (N % 2 == 0) {	
      System.out.println(D * N / 2);
    } else {
      System.out.println(D * (N / 2) + S);
    }
  }
}