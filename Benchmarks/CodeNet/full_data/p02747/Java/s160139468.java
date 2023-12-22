import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		String s = stdIn.next();
		
		String hitachi = "";
		
		for(int i = 1; i <= 5; i++) {
			hitachi += "hi";
			
			if(hitachi.equals(s)) {
				System.out.println("Yes");
				return;
			}
			
		}
		System.out.println("No");
		
		
	}

}
