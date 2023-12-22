import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final double h = scanner.nextDouble();
    final double a = scanner.nextDouble();

    System.out.println(Math.ceil(h/a));
  }
}
