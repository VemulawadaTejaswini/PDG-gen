import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
      	int N = input.nextInt();
      	int M = input.nextInt();
      	int[] P = new int[M];
      	int[] Y = new int[M];
      	Integer[][] sorted = new Integer[N][M];
      
      	for (int i = 0; i < N; i++) {
        	Arrays.fill(sorted[i], 100000000);
        }
      
      	for (int i = 0; i < M; i++) {
          	P[i] = input.nextInt();
          	Y[i] = input.nextInt();
          	
          	sorted[P[i]-1][i] = Y[i];
        }
      	for (int i = 0; i < N; i++) {
        	Arrays.sort(sorted[i]);
        }
      
      	for (int i = 0; i < M; i++) {
          	int val1 = P[i];
          	int val2 = Arrays.asList(sorted[P[i]-1]).indexOf(Y[i]) + 1;
			System.out.printf("%06d%06d\n", val1, val2);
        }
    } 	
}
