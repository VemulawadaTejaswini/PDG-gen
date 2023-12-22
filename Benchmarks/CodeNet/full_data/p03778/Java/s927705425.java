import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int ans = 0;
		Scanner scan = new Scanner(System.in);
		int W = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		if(a < b) {
			ans = b - (a + W);
		}else {
			ans = a - (b + W);
		}
		if(ans < 0) ans = 0;
		System.out.println(ans);
		scan.close();
	}
}
