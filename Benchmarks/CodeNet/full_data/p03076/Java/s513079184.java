import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double min = 10;
		double ans = 0;
		for (int i = 0; i < 5; i++) {
			double A = sc.nextInt();
			ans += Math.ceil(A / 10) * 10;
			double a = A % 10;
			if (min > a&&a!=0) {
				min = a;
			}
		}
		sc.close();
		int ans2=(int)(ans-(10-min));
		System.out.println(ans2);
	}
}
