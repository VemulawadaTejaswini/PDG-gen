import java.util.Scanner;

class Main {

  static int cntAC(String s, int heard, int low) {
    int cnt = 0;
    for (int i = heard - 1; i < low - 1;) {
      if (s.charAt(i) == 'A' && s.charAt(i + 1) == 'C') {
        cnt++;
        i = i + 2;
      } else {
        i = i + 1;
      }
    }
    return cnt;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = Integer.parseInt(scanner.next());
    int Q = Integer.parseInt(scanner.next());
    String s = scanner.next();
    int[] l = new int[Q];
    int[] r = new int[Q];
    for (int i = 0; i < Q; i++) {
      l[i] = Integer.parseInt(scanner.next());
      r[i] = Integer.parseInt(scanner.next());
    }

    for (int i = 0; i < Q; i++) {
      System.out.println(cntAC(s, l[i], r[i]));
    }

  }

}
