import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int q = sc.nextInt();

    String s = sc.next();

    int l[] = new int[q];
    int r[] = new int[q];
    for (int i = 0; i < q; i++) {
      l[i] = sc.nextInt();
      r[i] = sc.nextInt();
    }

    String[] strArray = s.split("");
    for (int i = 0; i < q; i++) {
      int cnt = 0;
      for (int j = l[i] - 1; j < r[i] - 1; j++) {
        if ((strArray[j] + strArray[j + 1]).equals("AC")) {
          cnt++;
        }
      }
      System.out.println(cnt);
    }
  }
}
