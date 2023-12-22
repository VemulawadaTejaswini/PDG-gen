import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    //ここから累積和のやつ
    long[] s = new long[N + 1];
    for(int i = 1; i <= N; i++){
      s[i] = sc.nextLong();
      s[i] += s[i - 1];
    }
    //累積和のやつここまで

    int L = 1;
    int R = 3; //切り口Lと切り口Rを定義
    long ans = s[N];

    for(int i = 2; i < N - 1; i++){
      long last = s[N];
      while(L < i){ //切り口Lは中央より左に来る
        long dist = Math.abs(s[i] - s[L]*2); //1番左の塊の長さと左から2番目の塊の長さとの差の絶対値
        if(dist > last){break;} //distが単調増加しはじめたら探索をやめる
        else{last = dist; //distが単調減少している間はlastを更新し探索続行
        L++; //切り口Lを右に寄せる
        }
      }
      L++; //単調減少するギリギリのところにLを戻す

      //ここからは同様のことをRでやる
      last = s[N];
      while(R < N){
        long dist = Math.abs(s[N] + s[i] - s[R]*2);
        if(dist > last){break;}
        else{last = dist;
        R++;
        }
      }
      R--;
      //同様のやつここまで

      long max = Math.max(Math.max(Math.max(s[L], s[i] - s[L]), s[R] - s[i]), s[N] - s[R]);
      long min = Math.min(Math.min(Math.min(s[L], s[i] - s[L]), s[R] - s[i]), s[N] - s[R]);
      ans = Math.min(max - min, ans);
    }

    System.out.println(ans);
  }
}
