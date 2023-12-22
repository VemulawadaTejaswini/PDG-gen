import java.util.Scanner;

class Main{
  static int words[] = new int[3];

  /** カウント */
  private static int COUNT_5, COUNT_7;

  /**
   * メインメソッド
   *
   * @param args 引数
   */
  public static void main(String[] args) {
    setData();
    calc();

    System.out.println(COUNT_5 == 2 && COUNT_7 == 1 ? "YES" : "NO");
  }

  /** 初期値設定 */
  private static void setData() {
    Scanner sc = new Scanner(System.in);
    words[0] = sc.nextInt();
    words[1] = sc.nextInt();
    words[2] = sc.nextInt();
  }

  /** 計算メソッド */
  private static void calc() {
    for (int word : words) {
      if (word == 5) {
        COUNT_5++;
      } else if (word == 7) {
        COUNT_7++;
      }
    }
  }
}