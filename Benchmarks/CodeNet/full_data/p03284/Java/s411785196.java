import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int N = Integer.parseInt(sc.next());
      int K = Integer.parseInt(sc.next());
      System.out.println(N % K == 0 ? "0" : "1");
    }
  }
}
