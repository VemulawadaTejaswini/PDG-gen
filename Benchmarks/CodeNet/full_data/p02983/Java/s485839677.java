import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int L  = keyboard.nextInt();
		int R  = keyboard.nextInt();
		int[]X = new int[R-L+1];
		
		if(R < 2019 || 2019 < L) {
			for(int i = 0; i <R-L+1; i++) {
				X[i] = (L+i) % 2019;
			}
			Arrays.sort(X);
			System.out.print(X[0]*X[1]%2019);
		}else{
			System.out.print(0);
		}
		keyboard.close();	
	}
}
