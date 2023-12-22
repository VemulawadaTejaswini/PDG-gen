import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N= keyboard.nextInt();
		int A = keyboard.nextInt();
		int B = keyboard.nextInt();
		
		int ans = 0;
		
		if(N%(A+B) == 0) {
			ans = N/(A+B)*A;
		}else if(N%(A+B) <= A) {
			ans = N/(A+B)*A+N%(A+B);
		}else{
			ans = N/(A+B)*A+A;
		}
		
		System.out.print(ans);
		keyboard.close();	
		
	}
}
