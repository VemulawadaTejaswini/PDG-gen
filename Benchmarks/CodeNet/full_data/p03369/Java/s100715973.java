import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		
		int priceRamen = 700;
		int ans = priceRamen;
		
		for (int i = 0; i < 3; i++) {
			if (a.charAt(0) == 'o'){
				ans += 100;
			}
		}
		
		System.out.println(ans);
	}
}
