import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] S = scanner.next().toCharArray();
    int[] cnt = new int[4];
    for (char ch : S) {
      switch (ch) {
        case 'N':
          cnt[0] = 1;
          break;
        case 'S':
          cnt[1] = 1;
          break;
        case 'E':
          cnt[2] = 1;
          break;
        case 'W':
          cnt[3] = 1;
          break;
      }
    }
    if ((cnt[0] ^ cnt[1]) == 0 && (cnt[2] ^ cnt[3]) == 0) System.out.println("Yes");
    else System.out.println("No");
  }
}
