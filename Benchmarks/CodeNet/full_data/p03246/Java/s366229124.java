import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int count = scanner.nextIn();

	Set<Integer> entries = new HashSet<>();
    for (int ix = 0; ix < count; ix++) {
      entries.add(ix);
    }
    
    if (entries.size() == 1) {
      System.out.println(0);
    } else {
      System.out.println(Math.abs(entries.size() - 2));
    }
  }
}