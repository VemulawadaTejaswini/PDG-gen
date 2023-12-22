import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main main = new Main(sc);
    main.show();
  }

  Scanner sc;
  int n;
  int[] a;
  String ans;

  public Main(Scanner sc) {
    this.sc = sc;
    n = sc.nextInt();
  }
  
  public void show() {
    System.out.println(solve());
  }
  
  private String solve() {
    for (int i = 1; i < 10; i++) {
      for (int j = 1; j < 10; j++) {
        if (i*j==n) return "Yes";
      }
    }
    return "No";
  }
  
  private int[] vi(int n) {
    int[] a = new int[n];
    for (int i = 0; i < n; i++) a[i] = sc.nextInt();
    return a;
  }
}


