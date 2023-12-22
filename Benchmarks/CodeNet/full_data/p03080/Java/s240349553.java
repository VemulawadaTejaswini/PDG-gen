import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		sc.close();
		int R = 0, B = 0;
		for (int i = 0; i < s.length(); i++) {
			if (String.valueOf(s.charAt(i)).equals("R"))
				R++;
			else
				B++;
		}
		System.out.println(R > B ? "Yes" : "No");
	}
}
