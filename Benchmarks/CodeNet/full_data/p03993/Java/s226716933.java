import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);   
       //値の取得
       int N = sc.nextInt();
	   int[] A = new int[N];
       for(int i=0;i<N;i++){
        A[i] = sc.nextLong();
       }
      //カウント
      int count=0;
      //両想いうさぎ
      for(int i=0;i<N;i++){
        if((A[A[i]-1)= i+1)){
          count++;
        }
      }              
       System.out.println(count/2);
    }
}