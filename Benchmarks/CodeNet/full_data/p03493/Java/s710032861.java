import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		
		String s = sc.next();
		if (s.charAt(0) == '1') ans++;
		if (s.charAt(1) == '1') ans++;
		if (s.charAt(2) == '1') ans++;
		
		System.out.println(ans);
	}
}