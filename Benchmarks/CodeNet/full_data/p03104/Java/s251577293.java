import java.util.Scanner;

public class Main {
  private static final String DELIMITER = " ";

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] firstLine = scanner.nextLine().split(DELIMITER);
    Long a = Long.valueOf(firstLine[0]);
    Long b = Long.valueOf(firstLine[1]);

    Long acc = a;
    for (Long i = a + 1; i <= b; i ++) {
      acc = acc ^ i;
    }
    System.out.println(acc);
  }
}