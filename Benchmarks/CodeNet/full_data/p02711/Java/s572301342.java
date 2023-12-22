import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String nn = String.valueOf(n);
		for (int i = 0; i < nn.length(); i++) {
			if (nn.charAt(i) == '7') {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}

}
