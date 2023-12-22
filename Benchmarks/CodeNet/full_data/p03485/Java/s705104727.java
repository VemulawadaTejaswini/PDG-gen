import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		double ave = (a + b) / 2;
		double upave = Math.ceil(ave);
		int ans = (int)upave;
		System.out.println(ans);
	}
}