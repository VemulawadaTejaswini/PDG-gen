import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		String[] c = new String[h];
		for(int i = 0; i < h; i++) {
			c[i] = sc.next();
		}
		String ans;
		for(int i = 0; i < h; i++) {
			ans = c[i];
			System.out.println(ans);
			System.out.println(ans);
		}
	}
}