import java.io.*;

public class Main {
	public static void main(String args[]) {
		InputStreamReader in = new InputStreamReader(System.in);
		
		String s = in.toString();
		if(s.charAt(2) == s.charAt(3) && s.charAt(4) == s.charAt(5)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
