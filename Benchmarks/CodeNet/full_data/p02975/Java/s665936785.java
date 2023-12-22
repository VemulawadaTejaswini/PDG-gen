import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a;
		for (int i = 0; i < n; i++) {
			a = sc.nextInt();
			if (0 != a) {
            	System.out.println("No");
				return;
            }
		}
      	System.out.println("Yes");
	}
}
