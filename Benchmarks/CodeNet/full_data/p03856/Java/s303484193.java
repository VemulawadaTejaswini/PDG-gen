import java.util.*;

public class Main {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		String[] list = {"dream", "dreamer", "erase", "eraser"};
		String s = in.nextLine();
		
		while(s.length() > 0) {
			boolean f = true;
			for(String end: list) {
				if(s.endsWith(end)) {
					f = false;
					s = s.substring(0, s.length() - end.length());
				}
			}
			if(f) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}