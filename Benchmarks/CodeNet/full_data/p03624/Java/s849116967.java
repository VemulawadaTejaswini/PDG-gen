import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String ns = sc.next();
    String[] s = ns.split("");
    String[] abc = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    for (int i = 0; i < s.length; i++) {
      for (int j = 0; j < abc.length; j++) {
        if (s[i].equals(abc[j])) {
          abc[j] = "None";
        }
      }
    }
    String ans = "None";
    for (int i = 0; i < abc.length; i++) {
      if (!abc[i].equals("None")) {
        ans = abc[i];
        break;
      }
    }
    System.out.println(ans);
  }
}