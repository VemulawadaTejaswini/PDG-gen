import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int ans = n;
		int num = n-k;
		int num2 = 0;

		while(true) {
			num2 = Math.abs(num);
			ans = Math.min(ans, num2);
			if(num < 0) {
				break;
			}
			num = num -k;
		}
		
		System.out.println(ans);

	}
}
