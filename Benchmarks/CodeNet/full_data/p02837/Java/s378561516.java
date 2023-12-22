import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int ans = 0;
    int A[] = new int[N];
    int x[][] = new int[N][N];
    int y[][] = new int[N][N];
    for (int i=0;i<N;i++) {
      A[i] = sc.nextInt();
      for(int j=0;j<A[i];j++){
        x[i][j] = sc.nextInt();
        y[i][j] = sc.nextInt();
      }
    }
    //ここまで入力

    //bit全探索
    for(int bits=1; bits < (1 << N); bits++){
      boolean flag = true;
      for(int i=0; i<N; i++){
        //不親切な人の証言は考慮しない
        if((bits & (1 << i)) == 0) continue;
        for(int j=0; j<A[i]; j++){
          if((((bits >> x[i][j]-1) & 1) ^ y[i][j]) == 1) flag = false;
          //（bitsが101のとき、人１の証言が人2は1ですなど）正直者が、正直者だと証言した人が正直者ではない場合
          //正直者が、不親切な人だと証言した人が正直者だった場合
        }
      }

      if(flag == true){
        int cnt = 0;
        for(int j = 0; j < N; j++) {
          if ((bits >> j) % 2 == 1){
            cnt++;
            ans = Math.max(ans, cnt);
          }
        }
      }

    }
    System.out.print(ans);
  }
}
