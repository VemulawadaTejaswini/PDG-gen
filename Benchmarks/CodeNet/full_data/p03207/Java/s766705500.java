import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    int p = 0, sum = 0;
    int max = 0;
    for (int i = 0; i < N; i++) {
      p = Integer.parseInt(sc.next());
      sum += p;
      if (p > max) {
        max = p;
      }
    }
    System.out.println(sum - max / 2);
  }
}