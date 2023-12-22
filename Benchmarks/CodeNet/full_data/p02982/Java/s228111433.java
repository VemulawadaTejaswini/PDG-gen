import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N  = keyboard.nextInt();
		int D  = keyboard.nextInt();
		
		int[][]X = new int[N][D];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < D; j++) {
				X[i][j] = keyboard.nextInt();	
			}
		}
		
		int count = 0;
		double a = 0;

		for(int i = 0; i < N; i++) {
			for(int j = i+1; j < N; j++) {
				a = 0;
				for(int k = 0; k < D; k++) {
					a += Math.pow(X[i][k]-X[j][k],2);
				}
				if(Math.sqrt(a)%1.0 == 0.0) {
					count++;
				}
			}
		}
		
		System.out.println(count);
		keyboard.close();	
	}
}
