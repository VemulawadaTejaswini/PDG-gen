import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();

    char[] chars = s.toCharArray();
    if (check(chars)) {
      System.out.println("AC");
    } else {
      System.out.println("WA");
    }
  }

  static boolean check(char[] s) {
    if (s[0] != 'A') return false;
    int numC = 0;
    for (int i = 1; i < s.length; i++) {
      if (i >= 2 && i <= s.length - 2 && s[i] == 'C') {
        numC++;
        continue;
      }
      if (s[i] < 'a' || s[i] > 'z') {
        return false;
      }
    }
    return numC == 1;
  }
}