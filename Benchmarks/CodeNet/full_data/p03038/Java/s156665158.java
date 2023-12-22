import java.util.*;
import java.lang.Integer;

class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      //カードの枚数（配列の長さ）
      int N = sc.nextInt();
      //繰り返しの回数
      int M = sc.nextInt();
      //カードを配列に格納
      long[] cards = new long[N];
      for(int i = 0; i < N; i++){
        cards[i] = sc.nextInt();
      }
      //配列を昇順にソート
      Arrays.sort(cards);
      //操作処理
      for(int i = 0; i < M; i++){
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        for(int j = 0; j < B; j++){
          if(cards[j] < C){
            cards[j] = C;
          }
          else{
            break;
          }
        }
        Arrays.sort(cards);
      }
      //総和をとって出力
      long sum = 0;
      for(int i = 0; i < N; i++){
        sum += cards[i];
      }
      System.out.println(sum);
    }
}
 