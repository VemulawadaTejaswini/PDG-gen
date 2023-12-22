import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);   
      //取得
	  int N = sc.nextInt();
      int[] B = new int[N-1];
      for(int i=0;i<N-1;i++){
        B[i] = sc.nextInt();
      }
      //Bの中身を変える
      for(int i=0;i<N-1;i++){
        if(B[i]>B[i+1]){
        B[i] = B[i+1];
        }
      }
      //Bの値をAに移す
      int[] A = new int[N];
      int sum = B[0];
      for(int i=1;i<N;i++){
          A[i]=B[i-1];
          sum+=A[i];
      }
      System.out.println(sum);
    }
}