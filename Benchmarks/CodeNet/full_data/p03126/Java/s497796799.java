import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main m = new Main(sc);
    m.show(m.solve());
  }

  Scanner sc;
  int N;
  int M;
  int answer;
  int[] K;
  int[][] A;

  // 標準入力用のコンストラクタ
  public Main(Scanner sc) {
    this.sc = sc;
    N = sc.nextInt();   //調査人数
    M = sc.nextInt(); 	//食べ物の種類数
    K = new int[N]; 	//N人それぞれの好きな料理の個数
    A = new int[N][M];
    for (int i = 0; i < N; ++i){
        K[i] = sc.nextInt();
        for (int j = 0; j < K[i]; ++j){
            A[i][j] = sc.nextInt();
        }
    }
  }

  // 判定処理
  int solve() {
      int count = 0;
      int[] like = new int[M];   //各料理ごとに好きだと答えた人数を格納する配列
      for (int i = 0; i < N; ++i){
        for (int j = 0; j < K[i]; ++j){
            like[A[i][j] -1]++; //K[i]番目の料理が好き
        }
      }
      for (int i = 0; i < M; ++i){  //各料理の「好きだ」と解答した人数を調べる
        if (like[i] == N){  //その料理を全員が好きであればカウント
            ++count;
        }
      }
      
      answer = count;
      return answer;
  }

  // 回答の表示
  void show(int answer) {
        System.out.println(answer);
  }
    
}