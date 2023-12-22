import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    System.out.println(IntStream.range(0, N).filter(i -> sc.nextInt() >= K).count());
  }
}