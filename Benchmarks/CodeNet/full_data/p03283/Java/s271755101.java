import java.util.*;

public class Main {
	public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
      	int N = input.nextInt();
      	int M = input.nextInt();
      	int Q = input.nextInt();
      	int[][] se = new int[N][N];
      	
      	for (int i = 0; i < M; i++) {
        	int s = input.nextInt() - 1;
        	int e = input.nextInt() - 1;
         	se[s][e]++;
        }
      	for (int i = 0; i < Q; i++) {
        	int s = input.nextInt() - 1;
        	int e = input.nextInt() - 1;
          	int ans = 0;
          	for (int j = s; j <= e; j++) {
              	for (int k = e; k >= j; k--){
                	if (se[j][k] > 0) {
                    	ans+= se[j][k];
                    }
                }
            }
        	System.out.println(ans);
        }
      	
      	
    } 	
}
