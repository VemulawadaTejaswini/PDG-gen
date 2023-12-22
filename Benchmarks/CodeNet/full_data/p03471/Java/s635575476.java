import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = sc.nextInt();
		for(int x = 0; x <= n; x++) {
			for(int y = 0 ; x+y <= n ; y++) {
				int z=n-x-y;
				if((10000*x + 5000*y +1000*z)==sum) {
					StringBuilder sb = new StringBuilder();
					sb.append(x);
					sb.append(" ");
					sb.append(y);
					sb.append(" ");
					sb.append(z);
					System.out.println(sb.toString());
					return;
				}
			}
		}
		System.out.println("-1 -1 -1");

	}
}
