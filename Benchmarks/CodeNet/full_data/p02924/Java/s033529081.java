
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();

    long cnt = 0;
    for (long i = x - 1; i > 0; i--) {
      cnt = cnt + i;
    }
    System.out.println(cnt);

  }
}
