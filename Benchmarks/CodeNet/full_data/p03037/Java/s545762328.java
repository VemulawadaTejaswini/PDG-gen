import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int N = scan.nextInt();
      	int M = scan.nextInt();
      	int[] L = new int[M];
      	int[] R = new int[M];
      	int[] counter = new int[L];
      	for(int i = 0; i < M; i++){
        	L[i] = scan.nextInt();
          	R[i] = scan.nextInt();
          	for(int j= L[i]; j <= R[i]; j++){
            	counter[j]++;
            }
        }
      	int ans = 0;
      	for(int k = 0; k < M; k++){
        	if(counter[k] == N){
            	ans++;
            }
        }
      	System.out.print(ans);
      	
    }
}