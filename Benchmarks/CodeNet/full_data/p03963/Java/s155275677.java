import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main m = new Main(sc);
    m.show(m.solve());
    // m.debug();
  }

  Scanner sc;
  int N = 0;
  int K = 0;
  int answer = 0;

  // 標準入力用のコンストラクタ
  public Main(Scanner sc) {
    this.sc = sc;
    N = sc.nextInt();
    K = sc.nextInt();
  }

  // 判定処理
  int solve() {
      //int[] ball = new int[N];  //色の種類数を格納するボールの配列
      for (int i = 0; i < N; ++i){
        if (N == 1){
            answer = K;
            break;
        } else {
            //ball[i] = K;
            answer = (int) Math.pow(K,N);
        }
      }
      
      return answer;
  }

  // 回答の表示
  void show(int answer) {
        System.out.println(answer);
  }
    
}