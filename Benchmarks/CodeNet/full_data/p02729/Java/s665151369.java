import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); // even N_C_2
    int M = sc.nextInt(); // odd M_C_2
    System.out.println(N * (N - 1) / 2 + M * (M - 1) / 2);
  }
}
