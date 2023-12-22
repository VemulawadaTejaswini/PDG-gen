import java.util.Scanner;
public class Mainv {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int ans = 0;

		//1がaが大きい、2はｂが大きい、０は同じ
		if(a.length() > b.length()) {
			ans = 1;
		}else if(a.length() < b.length()) {
			ans = 2;
		}else {
			for (int i = 0; i < a.length(); i++) {
				if (a.charAt(i) > b.charAt(i)) {
					ans = 1;
					break;
				}else if (a.charAt(i) < b.charAt(i)) {
					ans = 2;
					break;
				}
			}
		}
		if(ans == 1) {
			System.out.println("GREATER");
		}else if(ans == 2) {
			System.out.println("LESS");
		}else {
			System.out.println("EQUAL");
		}
		sc.close();
	}
}