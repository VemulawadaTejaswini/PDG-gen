import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int as[] = new int[n+2];
		as[0] = 0;
		as[n+1] = 0;
		int tot = 0;
		for (int i=1; i<=n; i++) {
			as[i] = scanner.nextInt();
			tot += Math.abs(as[i] - as[i-1]);
		}
		tot += Math.abs(as[n]);
		for (int i=1; i<=n; i++) {
			System.out.println(tot - Math.abs(as[i]-as[i-1]) - Math.abs(as[i+1]-as[i]) + Math.abs(as[i+1] - as[i-1]));
		}
	}

}