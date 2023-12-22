import java.util.Scanner;

public class Main {
  static char[] colors = {'.', '#'};

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    Main tenkaC = new Main();
    System.out.println(tenkaC.solve(n, s));
  }

  public int solve(int n, String s) {
    int whiteSum = 0;
    int blackSum = 0;
    int index = endIndex(s, 0, 0);
    int color = 1;
    int next = 0;
    while (index < s.length()) {
      next = endIndex(s, color, index);
      if (color == 0) {
        whiteSum += (next - index);
        color = 1;
      } else {
        if (next < s.length()) {
          blackSum += (next - index);
        }
        color = 0;
      }
      index = next;
    }
    return whiteSum < blackSum ? whiteSum : blackSum;
  }

  private int endIndex(String s, int color, int index) {
    for (int i = index; i < s.length(); i++) {
      if (s.charAt(i) == colors[color]) {
        index = i;
      } else {
        break;
      }
    }
    return index + 1;
  }
}
