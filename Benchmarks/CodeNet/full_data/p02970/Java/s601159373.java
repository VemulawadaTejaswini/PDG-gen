import java.util.*;

public class Main {
  public static void main(String[] args) {
    int N, D;
    try(Scanner sc = new Scanner(System.in)) {
      N = sc.nextInt();
      D = sc.nextInt();
    }
    int unit = 2 * D + 1;
    int rest = N % unit;
    int answer = (N - rest)/unit + (rest > 0 ? 1 : 0);
    System.out.println(answer);
  }
}