import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long N = scanner.nextLong();
    System.out.println(N % 2 == 0 ? N : N * 2);
  }
}
