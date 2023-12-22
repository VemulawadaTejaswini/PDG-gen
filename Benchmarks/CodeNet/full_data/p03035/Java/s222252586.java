import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int A = keyboard.nextInt();
		int B = keyboard.nextInt();
		
		int ans = 0;
		
		if (A >= 13) {
			ans = B;
		}else if(A >= 6) {
			ans = B / 2;
		}else {
			ans = 0;
		}
		
		System.out.print(ans);
		keyboard.close();	
	}
}
