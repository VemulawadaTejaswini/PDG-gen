import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String input = scan.next();
		int pos1 = - 1 , pos2 = - 1;
		int i , length = input.length();
		for (i = 0;i < length;i ++) {
			if (input.charAt(i) == 'A') {
				pos1 = i;
				break;
			}
		}
		for (i = length - 1;i >= 0;i --) {
			if (input.charAt(i) == 'Z') {
				pos2 = i;
				break;
			}
		}
		
		System.out.println(pos2 - pos1 + 1);
		
	}
	
    
}






	