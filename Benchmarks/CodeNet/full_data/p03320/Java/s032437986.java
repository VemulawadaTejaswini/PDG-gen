import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    long K = new Scanner(System.in).nextLong();

    String trailingNines = "";
    for (int i = 1; i <= K; i++) {
      if (i > 1 && i % 9 == 1) trailingNines += "9";
      System.out.printf("%d%s\n", (i - 1) % 9 + 1, trailingNines);
    }
  }
}
