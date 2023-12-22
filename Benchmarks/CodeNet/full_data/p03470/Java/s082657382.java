import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    int n = scanner.nextInt();

    List<Integer> values = new ArrayList<>();

    for (int valueCount = 1; valueCount <= n; valueCount++) {
      values.add(scanner.nextInt());
    }

    values.sort((a, b) -> {
      return b - a;
    });


    int count = 0;
    int currentValue = Integer.MAX_VALUE;

    for (int value : values) {
      if (value < currentValue) {
        currentValue = value;
        count++;
      } else {
        break;
      }

    }

    System.out.println(count);

    scanner.close();
  }
}
