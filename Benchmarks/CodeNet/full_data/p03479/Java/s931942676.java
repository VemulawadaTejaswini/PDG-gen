import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long X = scanner.nextLong();
    long Y = scanner.nextLong();
    long z = Y / X;
    int k = 0;
    while (z > 0) {
      k++;
      z >>= 1;
    }
    System.out.println(k);
  }
}
