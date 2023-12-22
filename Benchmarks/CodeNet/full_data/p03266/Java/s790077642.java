import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		scan.close();
		if(K % 2 == 0) {
			long cnt1 = 0;
			long cnt2 = 0;
			for(int i = 1; i <= N; i++) {
				if(i % K == 0) {
					cnt1 ++;
				}
				if(i % K == K / 2) {
					cnt2 ++;
				}

			}
			long ans = cnt1 * cnt1 * cnt1 + cnt2 * cnt2 * cnt2;
			System.out.println(ans);
		}else {
			long cnt1 = 0;
			for(int i = 1; i <= N; i++) {
				if(i % K == 0) {
					cnt1 ++;
				}
			}
			long ans = cnt1 * cnt1 * cnt1;
			System.out.println(ans);
		}

	}
}