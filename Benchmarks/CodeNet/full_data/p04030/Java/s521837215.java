import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    String S = sc.next();

    sc.close();

    String[] s = S.split("");

    Deque<String> deque = new ArrayDeque<>();

    for (int i = 0; i < s.length; i++) {
      if (s[i].equals("0")) {
        deque.addLast("0");
      } else if (s[i].equals("1")) {
        deque.addLast("1");
      } else {
        if (0 < deque.size()) {
          deque.pollLast();
        }
      }
    }

    String result = "";

    for (String value : deque) {
      result += value;
    }

    System.out.println(result);

  }

}