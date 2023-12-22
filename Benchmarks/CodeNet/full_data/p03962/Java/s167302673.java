import java.util.Scanner;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // 思考停止整数取得
    int a =  scanner.nextInt();
    int b =  scanner.nextInt();
    int c =  scanner.nextInt();

    // list（普通のコレクション）, map（マッピングありコレクション）, set（重複なしコレクション）
    TreeSet<Integer> colorSet = new TreeSet<>();
    // ArrayList<Integer> colorList = new ArrayList<>();

    // 重複なしコレクションに色a, b, cを追加していく（重複は無視される）
    colorSet.add(a);
    colorSet.add(b);
    colorSet.add(c);
    System.out.println(colorSet.size());
  }
}