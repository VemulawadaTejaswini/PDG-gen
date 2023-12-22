import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		String S = stdin.next();
		
		if(S.equals("Sunny")) {
			System.out.print("Cloudy");
		}
		else if(S.equals("Cloudy")) {
			System.out.print("Rainy");
		}
		else {
			System.out.print("Sunny");
		}
	}
}