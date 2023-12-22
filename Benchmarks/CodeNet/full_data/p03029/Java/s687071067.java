import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int A = scanner.nextInt();
    int P = scanner.nextInt();

    P += A * 3;
    System.out.println(P / 2);
  }
}