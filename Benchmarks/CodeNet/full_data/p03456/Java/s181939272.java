import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String a = scanner.next();
    String b = scanner.next();

    new Main().execute(a, b);
  }

  public void execute(String a, String b) {
    int number = Integer.parseInt(a + b);
    int round = (int) Math.sqrt(number);

    System.out.println(round * round == number ? "Yes" : "No");

  }
}
