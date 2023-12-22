import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);   
       //値の取得
       int N = sc.nextInt();
	   long[] A = new long[N];
      for(int i=0;i<N;i++){
        A[i] = sc.nextLong();
      }
      //カウント
      int count = 0;
      //偶数があるなら操作
      while(even>0){
        int even=0;
      	for(int i=0;i<N;i++){
          if(A[i]%2==1){
            A[i]=A[i]*3;
          }else{
        	if((A[i]/2)%2==0){//２で割った数が偶数なら２で割る
          		A[i]=A[i]/2;
        	}else{
             	A[i]=A[i]*3;
        	}
            even++;
          }
      	}
        count++;
      }
      
      System.out.println(count);
    }
}
      
      