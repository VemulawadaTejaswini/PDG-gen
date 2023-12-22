import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int ans = 0;
		int num1 = 0;
		int num2 = 0;
		for (int i = 1; i <= N; i++) {
			if (K % 2 == 0) {
				if (i % K == 0) {
					num1++;
				} else if (i % K == K / 2) {
					num2++;
				}
				
			} else if (i % K == 0) {
					num1++;
			}
		}
		ans = (num1*num1*num1) + (num2*num2*num2);
		System.out.println(ans);
	}
}
