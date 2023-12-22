import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    char[] s = sc.next().toCharArray();

    int lcs[][] = new int[N+1][N+1];
    int len = 0, index = 0;
    for (int i = 1; i <= N; i++) {
      for (int j = i + 1; j <= N; j++) {
        if (s[i-1] == s[j-1] && lcs[i-1][j-1] < j - i) {
          lcs[i][j] = lcs[i-1][j-1] + 1;
          if (lcs[i][j] > len) {
            len = lcs[i][j];
            index = Math.max(i, index);
          }
        } else {
          lcs[i][j] = 0;
        }
      }
    }

    System.out.println(len);
  }
}
