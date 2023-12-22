
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, k, x, y, ans;
		
		n = sc.nextInt();
		k = sc.nextInt();
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(n > k) ans = k * x + (n - k) * y;
		else ans = n * x;
		System.out.println(ans);
		sc.close();
	}

}
