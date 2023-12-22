import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int K = input.nextInt();
		N-=K;
		K--;
		long ans = 1;
		ans+=N/K;
		if (N%K!=0) ans++;
		System.out.println(ans);
	}
}