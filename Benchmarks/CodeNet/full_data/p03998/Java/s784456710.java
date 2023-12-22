import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		String SA = keyboard.nextLine();	
		String SB = keyboard.nextLine();	
		String SC = keyboard.nextLine();	
		
		String input = SA.substring(0,1);

		keyboard.close();	
              System.out.print(solve(SA,SB,SC,input));

	}


public static String solve(String A, String B, String C, String input2) {
		String output ;

			if(input2.equals("a")) {
				if(A.length() != 0) {
					output = A.substring(0,1);
					return solve(A.substring(1), B, C, output);
				}else {
					return "A";
				}
			}else if(input2.equals("b")) {
				if(B.length() != 0) {
					output = B.substring(0,1);
					return solve(A, B.substring(1), C, output);
				}else {
					return "B";
				}
			}else{ 	//(input2.equals("c")) 
				if(C.length() != 0) {
					output = C.substring(0,1);
					return solve(A, B, C.substring(1), output);
				}else {
					return "C";
				}
			}
		}
}
