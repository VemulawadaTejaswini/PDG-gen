import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
      	int K = sc.nextInt();
      	int Q = sc.nextInt();
      	int i = 0;
        int count = 0;
      	int A[] = new int[Q];
      	for(i = 0;i < Q;i++){
          A[i] = sc.nextInt();
        }
      	for(i = 1;i <= N;i++){
          for(int j = 0; j < Q; j++){
            if(i == A[j]){
              count = count + 1;
            }
          }
          if(K - Q + count >= 1){
             System.out.println("Yes");            
          }
          else{
             System.out.println("No");
          }

        }  	
    }
}