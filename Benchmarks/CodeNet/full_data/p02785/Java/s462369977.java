import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int K = sc.nextInt();
      
        long h[] = new long[N];//体力hを格納する
      
		long th = 0;//体力hの合計

      	long ans = 0;//N-K回文の中で,ソートした体力hの加算合計
      
      	for(int i=0; i<N; i++){
          	h[i] =sc.nextLong();//体力hを入力する場所
          	th +=h[i];//体力hを加算していく
      	}
      
    	Arrays.sort(h);//ソートを使って体力hを昇順に並べ替える
      
        if(K>0){//Kが0以下の場合,合計から何もしなくてもよい
      	for(int j=0; j<N-K; j++){//モンスターN匹から必殺技K回ひいた回数まわす
        	ans +=h[j];//N-K回分,ソートした体力hを加算していく
     	}  
          	System.out.println(ans);
        }
      	else{
          	System.out.println(th);
        }
    }
}