import java.util.Scanner;

public class Main { 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int ans = ((N - M) * 100 + 1900 * M ) * (int)Math.pow(2,M);
    System.out.println(ans);
  }
}