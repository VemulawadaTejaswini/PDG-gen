import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    double p = 0;
    for (int i = 1; i < N+1; i++) {
      int x = (int) Math.floor(Math.log(((double) K - 1)/i)/Math.log(2) + 1);
      p += Math.pow((double) 1/2, (double) x) / N;
    }
    System.out.println(String.format("%.12f", p));
  }
}