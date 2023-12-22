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
      
      //割れる回数
      for(int i=0;i<N;i++){
        while(A[i]%2==0){
          A[i]=A[i]/2;
          count++;
        }
      }
      
      System.out.println(count);
    }
}