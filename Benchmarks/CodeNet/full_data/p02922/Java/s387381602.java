
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int ans = 0;
		int outlet = 1;
		while (outlet < B) {
			--outlet;
			outlet += A;
			ans++;
		}
		System.out.println(ans);
		sc.close();
	}
}