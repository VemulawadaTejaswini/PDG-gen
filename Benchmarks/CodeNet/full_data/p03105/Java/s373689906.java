import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // 入力
    try (Scanner sc = new Scanner(System.in);) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();

      int max = b / a;

      int answer = c < max ? c : max;
      System.out.println(answer);
    }
  }
}