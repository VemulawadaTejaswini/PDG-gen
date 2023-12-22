import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int n = scanner.nextInt();
    int l = scanner.nextInt();
    
    ArrayList<String> word = new ArrayList<>();
    
    // n回データを取得し格納する
    for(int i = 0; i < n; i++) {
      word.add(scanner.next());
    }
    
    // データをソートする
    // abw
    // eop
    // cpo
    // xxb
    // bqq
    boolean changed = true; // 交換が発生したかどうかのフラグ（初期値はtrue）
    while(changed) {
      changed = false; // まだこのループで交換は行われてない
      for(int i = 1; i < n; i++) {
        // 自分とその前を比較して、自分が相手より小さかったら
        if(compare(word.get(i), word.get(i - 1))) {
	      // 自分と相手の場所を入れ替える
          String tmp; // *退避しておくところ
          tmp = word.get(i); // *自分を退避
          word.set(i, word.get(i - 1)); // *自分のいたところに相手を入れる
          word.set(i - 1, tmp); // *相手のいたところに退避しておいた自分を入れる
          changed = true; // 交換が発生した
        }
      }
  	}
    
    // listの中の要素を区切らずに連続して出力
    for(String w: word) {
      System.out.print(w);
    }
  }
  
  /**
   * 二つの文字列を比較し、一つ目の方が辞書順で小さければtrue
   * そうでなければfalseを返す
   */
  public static boolean compare(String str1, String str2) {
    return str1.compareTo(str2) <= 0;
  }
}
