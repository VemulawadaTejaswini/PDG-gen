import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    new Main().run();
  }

  void run() {
    LinkedList<Character> list = new LinkedList<>();
    for (char c : sc.nextLine().toCharArray()) {
      switch (c) {
        case 'B':
          if(list.size() > 0) {
            list.removeLast();
          }
          break;
        default:
          list.add(c);
      }
    }
    list.stream().forEach(System.out::print);
    System.out.println();
  }

  int ni() {
    return Integer.parseInt(sc.next());
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}