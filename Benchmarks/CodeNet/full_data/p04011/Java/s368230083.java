import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N = keyboard.nextInt();
		int K = keyboard.nextInt();
		int X = keyboard.nextInt();
		int Y = keyboard.nextInt();
		
		int L = N - K;
		
		if(N > K) {
			System.out.println(X * K + Y * L);
		}else {
			System.out.println(X * N);
		}
			
		keyboard.close();	
	}
}
