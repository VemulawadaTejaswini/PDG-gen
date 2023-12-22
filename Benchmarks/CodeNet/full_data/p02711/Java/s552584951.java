import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int count = 0;
		for (int i=0; i < 3; i++) {
			if (N.charAt(i) == '7') {
				count++;
			}
		}
		if (count > 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
