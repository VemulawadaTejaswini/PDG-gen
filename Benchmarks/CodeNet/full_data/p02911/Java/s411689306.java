import java.util.*;
 
public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N =sc.nextInt();//N人
      int K =sc.nextInt();//Kポイント
      int Q =sc.nextInt();//Q回戦
      
      int n[] =new int[N];
      int a[] =new int[Q];//入力されるであろう勝った人の番号を格納する
      
      for(int j=0; j<Q; j++){
      a[j] =sc.nextInt();
      }
      
      int kq = K-Q;//一回も答えれなかったときのポイント
      Arrays.fill(n,kq);//n[N]の中身の初期値を一回も答えれなかった時のポイントに設定しておく
      
      for(int j=0; j<Q; j++){
		n[a[j]-1]++;//a[3]...aの0番目に入っているのは3,しかし配列だとn[3]=2であるため-1をしている
      }
      for(int j=0; j<N; j++){
        if(n[j]<=0){//n[j]==加算された数が入っている,0,0,1,-1,-1,-1
        System.out.println("No");
        }
        else{
        System.out.println("Yes");
        }
        }
    }
}
     