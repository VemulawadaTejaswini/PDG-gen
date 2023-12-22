import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int p[] = new int[n];

    for (int i = 0; i < n; i++) {
      p[i] = sc.nextInt();
    }

    int max = p[0];
    int count = 1;
    for (int i = 1; i < n; i++) {
      if (max > p[i]) {
        max = p[i];
        count++;
      }
    }
    System.out.println(count);
  }
}
