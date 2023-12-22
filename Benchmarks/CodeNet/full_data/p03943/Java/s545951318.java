import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int a = keyboard.nextInt();
		int b = keyboard.nextInt();
		int c = keyboard.nextInt();
		
		String ans;
		if(a + b == c) {
			ans = "Yes";
		}else if(b + c == a){
			ans = "Yes";
		}else if(c + a == b){
			ans = "Yes";
		}else {
			ans = "No";
		}

			System.out.println(ans);
			
		keyboard.close();	
	}
}
