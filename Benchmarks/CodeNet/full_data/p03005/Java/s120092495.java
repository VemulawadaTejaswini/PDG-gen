import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
	
		int N = keyboard.nextInt();
		int K = keyboard.nextInt();

		System.out.println(N - K);
		keyboard.close();	
	}
}