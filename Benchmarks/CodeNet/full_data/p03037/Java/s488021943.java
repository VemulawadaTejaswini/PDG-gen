import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N  = keyboard.nextInt();
		int M  = keyboard.nextInt();
		
		 int[] L = new int[M];
		 int[] R = new int[M];
		
		for(int i = 0; i < M ; i++) {
			L[i] = keyboard.nextInt();
			R[i] = keyboard.nextInt();
		}
		
		int min = 0;
		int MAX = 0;
		
		int[] count = new int[N+1];
		
		for(int m = 0; m < M; m++) {
			min = L[m];
			MAX = R[m];
		for(int j = 1 ; j <= N ; j++) {
				if( j >= min && j <= MAX) {
					count[j] ++;
					}
			}	
		}
		
		int ans = 0;
		
		for(int l = 1; l < N+1; l++) {
			if(count[l] == M) {
				ans ++;
			}
		}
		
		System.out.println(ans);
		keyboard.close();	
	}
}
