import java.util.*;

public class Main {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    String amount = scanner.next();
    int dislikes = scanner.nextInt();

    Set<Integer> dislike = new HashSet<>();
    for (int ix = 0; ix < dislikes; ix++) {
      dislike.add(scanner.nextInt());
    }

    StringBuilder builder = new StringBuilder();
    for (int ix = amount.length() - 1; ix >= 0; ix--) {
      int value = amount.charAt(ix) - '0';
      int check = value;
      while (check <= 9) {
        if (!dislike.contains(check)) break;
        check++;
      }

      builder.append(check);
    }

    System.out.println(builder.reverse());
  }
}