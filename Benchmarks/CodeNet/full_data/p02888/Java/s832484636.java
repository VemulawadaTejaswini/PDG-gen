import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    int[] l = Stream.of(sc.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
    sc.close();
    int count = 0;
    for (int i = 0; i < n - 2; i++) {
      for (int j = i + 1; j < n - 1; j++) {
        for (int k = j + 1; k < n; k++) {
          if (l[i] >= l[j] + l[k]) {
            continue;
          }
          if (l[j] >= l[k] + l[i]) {
            continue;
          }
          if (l[k] >= l[i] + l[j]) {
            continue;
          }
          count++;
        }
      }
    }
    System.out.println(count);
  }
}