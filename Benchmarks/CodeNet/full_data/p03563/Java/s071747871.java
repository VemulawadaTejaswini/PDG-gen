import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int r, g;
		r = sc.nextInt();
		g = sc.nextInt();
		sc.close();
		int ans;
		
		ans = 2 * g - r;
		System.out.println(ans);
	}

}
