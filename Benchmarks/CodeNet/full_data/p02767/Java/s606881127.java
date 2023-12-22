import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
        
      	int n[] = new int[N];
      	
      	for(int i=0; i<N; i++){
            n[i] =sc.nextInt();//N番目に住んでいる住人を格納
      	} 
      
      	int th = 0;//住人たちの体力の総和
      	int pp[] = new int[101];//体力の総和を格納
      	for(int p=1; p<=100; p++){//集会のP座標をまわす,1~100まで
           th = 0;//体力の総和をリセットすることで,次にまわされる体力の総和が0から入っていく
        for(int i=0; i<N; i++){//N番目に住んでいる住人,0~N-1まで
         	int h =(n[i]-p)*(n[i]-p);//住人が集会P座標に向かうのにいる体力,p=1から入っている
         	th +=h;//住人に必要な体力を足していく
          	pp[p] = th;//thにpp[p]を入れることで100個のthが格納される,p=1から入っている
      	}
        }
      	  int min = pp[1];//最小値を求めるために,pp[1]を最初に最小値の初期値として定める,計算式のときにp=1から使っているからpp[1]から始まる
          for(int m=2; m<pp.length; m++){//100個のthをまわす,2~101まで(比較するときに初期値は1が入っているためmは2から比べ始める)
          if(min>pp[m]){//初期値が次のpp[m]より大きい場合
          min = pp[m];//minの場所にまた新たな最小値を入れていく
          }
          }
          System.out.println(min); 
    }
}