import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main m = new Main(sc);
    m.show(m.solve());
  }

  Scanner sc;
  int N = 0;
  int answer = 0;

  // 標準入力用のコンストラクタ
  public Main(Scanner sc) {
    this.sc = sc;
    N = sc.nextInt();
  }

  // 判定処理
  int solve() {
      for (int i = 0; i < N; ++i){
        answer += i+1;  //１人目の子供(配列の要素数0)→１個・・・N人目の子供(配列の要素数N-1)→N個
      }
      
      return answer;
  }

  // 回答の表示
  void show(int answer) {
        System.out.println(answer);
      
  }
    
}