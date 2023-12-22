import java.util.*;
import java.util.stream.*;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    char[] s = in.nextLine().toCharArray();
    if (s[0] != s[1] && s[1] != s[2] && s[2] != s[3]) {
      System.out.println("Good");
    } else {
      System.out.println("Bad");
    }
  }
}
