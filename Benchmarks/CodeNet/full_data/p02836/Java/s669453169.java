import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int l = s.length();
		int count = 0;
		for(int i=0; i < l /2; i++) {
			if (s.charAt(i) != s.charAt(l - 1 - i))
				count++;
		}
		System.out.println(count);
		sc.close();
	}
}