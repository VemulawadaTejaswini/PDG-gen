import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long X = sc.nextLong();
		long Y = sc.nextLong();

		int ans = 0;
		for(long i=X; i<=Y; i*=2) {
			ans++;
		}

		System.out.println(ans);
	}
}
