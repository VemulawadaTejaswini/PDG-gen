import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main m = new Main(sc);
    m.show(m.solve());
  }

  Scanner sc;
  int N = 0;
  String s = null;
  boolean answer = true;

  // 標準入力用のコンストラクタ
  public Main(Scanner sc) {
    this.sc = sc;
    N = sc.nextInt();
    s = sc.next();
  }

  // 判定処理
  boolean solve() {
      int countR = 0;
      int countB = 0;
      for (int i = 0; i <s.length(); ++i){
        if (s.charAt(i) == 'R'){
            ++countR ;
        } else {
            ++countB;
        }
      }
      if (countR < countB){ //青のほうが多かったら
        answer = false; 
      }
      
      return answer;
  }

  // 回答の表示
  void show(boolean answer) {
      if (answer){
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
  }
    
}
