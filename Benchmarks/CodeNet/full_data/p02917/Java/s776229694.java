import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int result = 0;
    int ahead;
    int current = 100000;
    for (int i = 0; i < N - 1; i++) {
      ahead = current;
      current = sc.nextInt();
      result += Math.min(ahead, current);
    }
    result += current;
    System.out.println(result);
  }
}