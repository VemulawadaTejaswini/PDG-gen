import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main m = new Main(sc);
    m.show(m.solve());
    // m.debug();
  }

  Scanner sc;
  int A = 0;
  int B = 0;
  boolean answer = true;

  // 標準入力用のコンストラクタ
  public Main(Scanner sc) {
    this.sc = sc;
    A = sc.nextInt();
    B = sc.nextInt();
  }

  // 判定処理
  boolean solve() { //交互に入れられるということは、AとBは両方とも8以下
      if (!(A<= 8 && B <= 8)){
        answer = false;
      }
      return answer;
  }

  // 回答の表示
  void show(boolean answer) {
      if (answer){
        System.out.println("Yay!");
      } else {
        System.out.println(":("); 
      }
  }
    
}
