import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double n = sc.nextInt();
		double k = sc.nextInt();
		double ans = n;
		double num = n-k;
		double num2 = 0;

		while(true) {
			num2 = Math.abs(num);
			ans = Math.min(ans, num2);
			if(num < 0) {
				break;
			}
			num = num -k;
		}
		
		System.out.println((int)ans);

	}
}
