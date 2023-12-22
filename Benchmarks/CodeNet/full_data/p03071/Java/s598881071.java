import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		String NN = keyboard.next();
			int N = Integer.parseInt(NN);
			
		int[] yama = new int[N];
		for(int i=0; i < N; i++) {
			yama[i] = keyboard.nextInt();
		}
		
		int count = 0;
			for(int j = 0; j < N; j++) {
				if(j == 0) {
					count ++;
					continue;
				}else {
				if(yama[j] >= yama[0] && yama[j]>= yama[j-1]) 
						count ++;
				}
			}
			System.out.print(count);

		keyboard.close();	
	}
}