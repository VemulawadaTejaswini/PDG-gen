import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    // TODO 自動生成されたメソッド・スタブ
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();

    int i = 0;
    int cnt = 0;
    while (i != -1) {
      i = s.indexOf("ABC");
      if (i == -1) {
        break;
      }
      cnt++;
      s = s.substring(i + 3);
    }
    System.out.println(cnt);
  }
}
