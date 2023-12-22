import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int A  = keyboard.nextInt();
		int B  = keyboard.nextInt();
		
		int ans = -1;
		
		for(int i = 1; i<1500; i++) {
			if(i*8/100 == A && i*10/100 == B) {
				ans = i;
				break;
			} 
		}
				
		System.out.print(ans);
		keyboard.close();	
	}
}
