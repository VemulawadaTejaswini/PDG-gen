import java.util.*;

/**
 * C - Otoshidama
 */
public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int Y = sc.nextInt();
    int res10000 = -1, res5000 = -1, res1000 = -1;

    for (int i = 0; i <= N; i++) {
      for (int j = 0; j <= N - i; j++) {
        int cntRest = N - i - j; 
        // 残りのお札は全部1000円だから、3重ループしなくても金額が分かる
        int total = 10000 * i + 5000 * j + 1000 * cntRest;
        if (total == Y) {
          res10000 = i;
          res5000 = j;
          res1000 = cntRest;
        }
      }
    }

    System.out.println(res10000 + " " + res5000 + " " + res1000);
  }
}