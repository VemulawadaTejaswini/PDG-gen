import java.util.ArrayList;
import java.util.Scanner;

public class Main { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");
		int wholeApple = Integer.parseInt(line[0]);
		int frgiApple = Integer.parseInt(line[1]);
		System.out.println((wholeApple*3+frgiApple)/2);

		
		
		
	}
}
	
	