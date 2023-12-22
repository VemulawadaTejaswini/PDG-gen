import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int[] numbers = new int[n];
    for (int i = 0; i < n; i++) {
      numbers[i] = Integer.parseInt(sc.next());
    }
    if (n == 1) {
      pw.println(numbers[0]);
      return;
    }
    int secondMin = getSecondMin(numbers);
    for (int i = secondMin; i >= 1; i--) {
      int numOfIndivisible = 0;
      for (int number : numbers) {
        if (number % i != 0) {
          numOfIndivisible++;
        }
        if (numOfIndivisible > 1) {
          break;
        }
      }
      if (numOfIndivisible <= 1) {
        pw.println(i);
        return;
      }
    }
    throw new RuntimeException();
  }

  static int getSecondMin(int[] numbers) {
    int min = Integer.MAX_VALUE;
    int secondMin = Integer.MAX_VALUE;
    for (int i = 0; i < numbers.length; i++) {
      if (min > numbers[i]) {
        secondMin = min;
        min = numbers[i];
      } else if (secondMin > numbers[i]) {
        secondMin = numbers[i];
      }
    }
    return secondMin;
  }
}
