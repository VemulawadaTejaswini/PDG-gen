import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		int d;
		n = sc.nextInt();
		d = sc.nextInt();
		int range = d * 2 + 1;
		int ans = 0;
		if(n % range != 0) {
			ans = n / range + 1;
		} else {
			ans = n / range;
		}
		System.out.println(ans);
		sc.close();
	}

}
