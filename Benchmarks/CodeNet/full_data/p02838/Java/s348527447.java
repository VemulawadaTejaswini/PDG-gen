import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  @SuppressWarnings("resource")
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    List<Long> list = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      list.add(sc.nextLong());
    }

    long sum = 0;
    for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j < n; j++) {
        sum += list.get(i) ^ list.get(j);
      }
    }

    System.out.println(sum % (long) (Math.pow(10, 9) + 7));
  }
}
