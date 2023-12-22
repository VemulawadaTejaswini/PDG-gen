import java.util.*;

public class Main {

  public static void main(String[] args) {
    Main m = new Main();
    m.exec();
  }

  private void exec() {
    Scanner scan = new Scanner(System.in);
    String s = scan.next();
    String head = s.substring(0, 1);
    String tail = s.substring(s.length() - 1);
    System.out.println(head + String.valueOf(s.length() - 2) + tail);
  }
}