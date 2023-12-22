import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] c = sc.next().toCharArray();
    for (char _c : c) {
      _c = (char)(_c + 1);
      System.out.println(_c);
    }
  }
}