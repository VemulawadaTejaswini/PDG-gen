import java.util.*;

public class Main {
	static public void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String c = s.next();
		if (n%2 == 1) {
			System.out.println("No");
		} else {
			boolean yes = true;
			for (int i=0; i<n/2 && yes; i++) {
				if (c.charAt(i) != c.charAt(i+n/2))
					yes = false;
			}
			if (yes) System.out.println("Yes");
			else System.out.println("No");
		}
	}
}