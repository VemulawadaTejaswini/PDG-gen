import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		String[] s = stdIn.next().split("");
		
		for(int i = 0; i < s.length-1; i++) {
			if(s[i] .equals( "h") && s[i+1].equals("i")) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
		
		
		
		
	}

}
