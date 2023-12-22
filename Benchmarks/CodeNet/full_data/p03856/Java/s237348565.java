import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		String[] de = {"dream", "dreamer", "erase", "eraser"};
		
		s = s.replaceAll("dreamer", "");
		s = s.replaceAll("eraser", "");
		s = s.replaceAll("dream", "");
		s = s.replaceAll("erase", "");
		
		String ans = s.length() == 0 ? "YES" : "NO";
		System.out.println(ans);
		
		sc.close();
	}
}


