import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int t = s.length() - 2;
		String result = "";
		result = s.charAt(0) + String.valueOf(t) + s.charAt(s.length() -1);
		System.out.println(result);
	}
}
