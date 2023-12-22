import java.util.Scanner;

public class Main {
  public static void main(String ...args) {
    final Scanner scanner = new Scanner(System.in);
    final int num = scanner.nextInt();
    final int result = multipleOf2and(num);
    System.out.println(result);
  }

  private static int multipleOf2and(final int num) {
	return (num % 2 == 0) ? num : num * 2;
  }
}
