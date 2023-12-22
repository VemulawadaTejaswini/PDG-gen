import java.util.*;
import java.io.*;

class Main {
  char[] S;
  public static void main(String[] args) {
    Main m = new Main();
    m.input();
    m.solve();
    m.out();
  }

  public void input() {
    Scanner sc = new Scanner(System.in);
    S = sc.next().toCharArray();
    sc.close();
  }

  public void solve() {
    S[3] = '8';
  }

  public void out() {
    System.out.println(String.valueOf(S));
  }
}
