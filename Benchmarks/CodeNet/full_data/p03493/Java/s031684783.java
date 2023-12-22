import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    String places = scanner.nextLine();
    int count = 0;
    count += places.charAt(0) == '1' ? 1 : 0;
    count += places.charAt(1) == '1' ? 1 : 0;
    count += places.charAt(2) == '1' ? 1 : 0;
    System.out.println(count);
  }
}