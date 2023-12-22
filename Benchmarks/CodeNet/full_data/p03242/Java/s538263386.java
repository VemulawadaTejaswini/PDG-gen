
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String num = scan.nextLine();
		String out;
		
        for (int i = 0; i < num.length() ; i++) {
        	char c = num.charAt(i);
        	if(c == '1') {
        		System.out.print("9");
        	} else {
        		System.out.print("1");
        	}
        }
	}
}
