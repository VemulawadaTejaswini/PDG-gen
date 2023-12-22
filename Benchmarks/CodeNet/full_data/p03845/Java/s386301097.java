import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N  = keyboard.nextInt();
		int[] T = new int[N];
		int sum = 0;
        
        for(int i = 0; i < N; i++){
          T[i]  = keyboard.nextInt();
          sum += T[i];
        }
        
		int M  = keyboard.nextInt();
		
		int[] P = new int[M];
		int[] X = new int[M];
		int[] ans = new int[M];
		
		for(int j = 0; j < M; j++){
          P[j]  = keyboard.nextInt();
          X[j]  = keyboard.nextInt();
          ans[j] = sum - T[P[j]-1] +X[j] ;
        }
        
        for(int k = 0; k < M; k++){
		System.out.println(ans[k]);
		}
		keyboard.close();	
	}
}
