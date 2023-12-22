import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		int num =  s.length() - 2;
		
		
		System.out.println(s.substring(0,1) + num + s.substring(s.length()-1, s.length()));
		
		sc.close();
	}
}