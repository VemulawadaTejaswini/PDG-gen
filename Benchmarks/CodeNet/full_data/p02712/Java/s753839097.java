
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    // 整数の入力
    int N = sc.nextInt();
    // 出力
    System.out.println(
        IntStream.rangeClosed(1, N)
            .asLongStream()
            .filter(n -> (n % 3 != 0) && (n % 5 != 0))
            .sum());
  }
}
