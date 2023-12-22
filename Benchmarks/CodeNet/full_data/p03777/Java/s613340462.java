import java.util.*;

public class Main {
  public static void main(String[] args) {
    Main m = new Main();
    m.show(m.solve());
  }

  int a;
  int b;
  
  public Main() {
    Scanner sc = new Scanner(System.in);
    try {
      a = sc.next().equals("H") ? 1 : 0;
      b = sc.next().equals("H") ? 1 : 0;
   } finally {
      sc.close();
    }
  }
  
  boolean solve() {
    return a == b;
  }

  void show(boolean ans) {
    System.out.println(ans ? "H" : "D");
  }
}
