import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    //ラウンド開始時のポイント
    int K = sc.nextInt();
    //正解数
    int Q = sc.nextInt();
    int[] point = new int[N];
    for(int i=0; i<Q; i++){
      int ansNum = sc.nextInt();
      for(int j=0; j<N; j++){
        if(ansNum - 1 == j)continue;
        point[j]--;
      }
    }
    for(int i=0; i<N; i++){
      if(point[i]>0)System.out.println("Yes");
      else System.out.println("No");
    }
  }
}
