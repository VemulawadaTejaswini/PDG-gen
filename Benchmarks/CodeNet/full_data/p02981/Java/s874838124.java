import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
	
		int N = keyboard.nextInt();
		int A = keyboard.nextInt();
		int B = keyboard.nextInt();
		
		
		if(N * A > B) {
			System.out.println(B);
		}else{
			System.out.println(N*A);
		}
		keyboard.close();	
	}
}
