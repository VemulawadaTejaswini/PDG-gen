import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			sc.nextInt();
			String s = sc.next();
			String s2 = s.replaceAll("ABC", "1");
			int ans = 0;
			for(char c : s2.toCharArray()) {
				if(c == '1') {
					ans++;
				}
			}
			System.out.println(ans);

		}
	}
}
