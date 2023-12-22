import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int ans = 1;
		for (int i=1; i <=N; i++){
			ans *= i;
			ans = ans%1000000007;
		}
		System.out.println(ans);
	}
}