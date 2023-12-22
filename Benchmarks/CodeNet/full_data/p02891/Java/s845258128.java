
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		long k = sc.nextInt();


		int num = 0;
		if(s.charAt(0) == s.charAt(s.length() - 1)) {
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == s.charAt(0)) {
					num++;
				} else {
					break;
				}
			}
			s = s.substring(num) + s.substring(0, num);
		}

		if (s.matches(String.valueOf(s.charAt(0)) + "+")) {
			//all same character
			System.out.println(s.length() * k / 2);
		} else {
			//start != end
			int ans = 0;
			int rep = 1;
			for(int i = 0; i < s.length() - 1; i++) {
				if(s.charAt(i) == s.charAt(i + 1)) {
					rep++;
				} else {
					ans += rep / 2;
					rep = 1;
				}
			}
			ans += rep / 2;
			System.out.println(ans * k);
			
		}
		
	}

}