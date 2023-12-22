
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int ans = 1;
		for(int i = 2; i < x; i++) {
			int j = i;
			if(x >= Math.pow(j, 2)) {
				while(j <= x) {
					j *= i;
				}
				j /= i;
				ans = Math.max(ans, j);
			}
		}
		System.out.println(ans);

	}

}
