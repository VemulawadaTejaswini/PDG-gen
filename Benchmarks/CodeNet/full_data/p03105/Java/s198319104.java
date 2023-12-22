import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int A  = keyboard.nextInt();
		int B  = keyboard.nextInt();
		int C  = keyboard.nextInt();
		
		int ans = 0;
		int k = B/A;
		ans = k >C ? C : k;
				
		System.out.println(ans);
		keyboard.close();	
	}
}