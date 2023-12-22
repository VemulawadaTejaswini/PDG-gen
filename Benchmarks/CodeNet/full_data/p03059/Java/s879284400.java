
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int A, B, T;
		Scanner scanner = new Scanner(System.in);
		
		A = scanner.nextInt(); 
		B = scanner.nextInt(); 
		T = scanner.nextInt();
	
		scanner.close();
		
		int gen = 0;
		for (int time = 1; time <= T; time++) {
			if (time % A == 0) {
				gen = gen + B;
			}
		}
		System.out.println(gen);
		
		
	}

}
