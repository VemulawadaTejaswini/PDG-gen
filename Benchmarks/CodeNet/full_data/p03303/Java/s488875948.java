import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int n = in.nextInt();
		for(int i = 0;i < s.length();i += n) {
			System.out.print(s.charAt(i));
		}
	}
}
