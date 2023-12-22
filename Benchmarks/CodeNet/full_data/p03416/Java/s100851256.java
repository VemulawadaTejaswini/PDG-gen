import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int tot = 0;
    for (int i = A; i <= B; i++) {
      if (palindromic(i)) tot++;
    }
    System.out.println(tot);
  }

  private static boolean palindromic(int n) {
    char[] s = Integer.toString(n).toCharArray();
    int i = 0;
    int j = s.length - 1;
    while (i < j) {
      if (s[i] != s[j]) return false;
      i++;
      j--;
    }
    return true;
  }
}
