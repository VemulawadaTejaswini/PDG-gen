
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long n = scanner.nextLong();
    long k = scanner.nextLong();
    long number = n % k;

    while (true) {
      long next=  Math.abs(number - k);
      if (number > next) {
        number = next;
      } else {
        break;
      }
    }
    System.out.println(number);
  }
}
