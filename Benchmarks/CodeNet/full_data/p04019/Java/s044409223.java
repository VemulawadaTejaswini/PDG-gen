import java.util.Scanner;

public class Main {
	private static Scanner stdIn;
	
	public static void main(String[] args) {
		stdIn = new Scanner(System.in);
		
		String s = stdIn.nextLine();
		int n = 1;
		
		if(s.indexOf("N") >= 0) {
			if(s.indexOf("S") < 0){
				n = -1;
				System.out.println("No");
            }
		}else if(s.indexOf("S") >= 0) {
			if(s.indexOf("N") < 0){
				n = -1;
				System.out.println("No");
            }
		}
		
		if(s.indexOf("E") >= 0) {
			if(s.indexOf("W") < 0){
				n = -1;
				System.out.println("No");
            }
		}else if(s.indexOf("W") >= 0) {
			if(s.indexOf("E") < 0){
				n = -1;
				System.out.println("No");
            }
		}
		
		if(n == 1)
			System.out.println("Yes");
	}
}
