
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();
		int a = 0;
		for (int i=0;i<n;i++) {
			if (s.charAt(i)=='R') {
				a++;
			} else {
				a--;
			}
		}
		if(a>0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
