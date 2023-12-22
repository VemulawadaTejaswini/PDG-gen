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

    char[] ch = s.toCharArray();
    for (int i = 0; i < q; i++) {
      int cnt = 0;
      for (int j = l[i] - 1; j < r[i] - 1; j++) {
        if (ch[j] == 'A' && ch[j + 1] == 'C') {
          cnt++;
        }
      }
      System.out.println(cnt);
    }
  }
}
