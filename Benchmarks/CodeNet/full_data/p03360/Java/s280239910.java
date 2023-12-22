import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int K = scan.nextInt();
		scan.close();
		int ans = 0;
		if(A >= B && A >= C) {
			ans = A * (int)Math.pow(2, K) + B + C;
		}else if(B >= A && B >= C) {
			ans = B * (int)Math.pow(2, K) + A + C;
		}else if(C >= A && C >= B) {
			ans = C * (int)Math.pow(2, K) + A + B;
		}
		System.out.println(ans);

	}
}