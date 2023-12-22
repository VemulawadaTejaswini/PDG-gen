import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int L = scn.nextInt();
		if(L >= 0) {
			System.out.println(N*(N-1)/2 + (N-1)*L);
		}else {
			if(N > -L) {
				int ans = 0;
				for(int i = 0;i < N;i++) {
					ans += L+i;
				}
				System.out.println(ans);
			}else {
				int ans = 0;
				for(int i = 0;i < N-1;i++) {
					ans += L+i;
				}
				System.out.println(ans);
			}
		}
	}

}