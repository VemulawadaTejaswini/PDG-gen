import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
      	int M = sc.nextInt();
      	int[] A=new int[M];
        int sum=0;
      	for(i=0;i<M;i++){
        	A[i]=sc.nextInt();
        }
        for(i=0;i<M;i++){
        	sum=sum+A[i];
        }
      if(sum>N){
      	System.out.println(-1);
      }
      else{
        System.out.println(N-sum);
      }
		
		
	}
}