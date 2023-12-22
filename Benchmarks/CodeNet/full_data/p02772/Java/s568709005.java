import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N = keyboard.nextInt();
		
		String ans = "APPROVED";
		for(int a = 0; a<N; a++) {
			int Ain = keyboard.nextInt();
			if(Ain%2 == 0) {
				if(Ain%3 != 0 && Ain%5 != 0) {
					ans = "DENIED";
				}
			}
		}
			
		System.out.println(ans);
		keyboard.close();	
	}
}
