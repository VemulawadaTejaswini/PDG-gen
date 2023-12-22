import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		s = s.replaceAll("eraser", "");
		s = s.replaceAll("erase", "");
		s = s.replaceAll("dreamer", "");
		s = s.replaceAll("dream", "");
		
		String ans = s.length() == 0 ? "YES" : "NO";
		System.out.println(ans);
		
		sc.close();
	}
}


