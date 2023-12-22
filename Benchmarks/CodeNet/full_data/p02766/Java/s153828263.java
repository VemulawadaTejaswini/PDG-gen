import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    final int N = scan.nextInt();
    final int K = scan.nextInt();
    final String anser = Integer.toString(N, K);
    System.out.println(anser.length());
  }
}