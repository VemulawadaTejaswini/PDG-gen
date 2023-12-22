import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int cost = scanner.nextInt();
    int total = scanner.nextInt();
    int max = scanner.nextInt();
 
    if (cost == 0) {
      return 0;
    } else {
      return Math.min(max, total / cost);
    }
  }
}