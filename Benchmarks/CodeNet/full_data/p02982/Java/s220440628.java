import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N  = keyboard.nextInt();
		int D  = keyboard.nextInt();
		
		int[]X = new int[N*D];
		
		for(int i = 0; i < N*D; i++) {
				X[i] = keyboard.nextInt();	
		}
		
		int count = 0;
		double a = 0;

		for(int i = 0; i < N*D-D+1; i+=D) {
			for(int j = i+D; j < N*D-D+1; j+=D) {
				for(int k = 0; k < D; k++) {
					a += Math.pow(X[i+k]-X[j+k],2);
				}
				if(Math.sqrt(a)%1.0 == 0.0) {
					count++;
				}
				a = 0;
			}
		}
		
		System.out.println(count);
		keyboard.close();	
	}
}
