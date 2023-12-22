import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		String b  = keyboard.next();
		String ans = "";
		
		if(b.equals("A")){
			ans = "T";
			}else if(b.equals("T")){
			ans = "A";
			}else if(b.equals("G")){
			ans = "C";
			}else{
			ans = "G";
			}

		System.out.println(ans);
		keyboard.close();	
	}
}