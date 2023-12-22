import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double ans = 1;
		double a = Math.pow(10, 9) + 7;
		int N = scan.nextInt();
		for(int i = 1; i <= N; i++) {
			ans = ans * i;
		}
		ans = ans % a;
		int rs = (int)ans;
		scan.close();
		System.out.println(rs);
	}
}
