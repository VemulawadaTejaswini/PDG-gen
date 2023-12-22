import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long mod = 1000000007;
		long taka[] = new long[n+2];
		long ao[] = new long[n+2];
		for(int i = 1; i <= n; i++) {
			taka[i] = sc.nextLong();
		}
		taka[0]=0;taka[n+1]=taka[n];
		for(int i = 1; i <= n; i++) {
			ao[i] = sc.nextLong();
		}
		ao[0]=ao[1];ao[n+1]=0;
		long ans = 1L;
		for(int i = 1; i <= n; i++) {
			if(taka[i-1]<taka[i]&&ao[i]>ao[i+1]) {//両方更新されている場合
				if(taka[i]==ao[i]) {
					//nothing
				} else {
					System.out.println(0);
					return;
				}
			} else if(taka[i-1]<taka[i]&&ao[i]==ao[i+1]) {
				//nothing ans *= 1;
				if(taka[i] <= ao[i]) {
					//nothing
				} else {
					System.out.println(0);
					return;
				}
			} else if(taka[i-1]==taka[i]&&ao[i]>ao[i+1]) {
				//nothing
				if(ao[i] <= taka[i]) {
					//nothing
				} else {
					System.out.println(0);
					return;
				}
			} else if(taka[i-1]==taka[i]&&ao[i]==ao[i+1]) {
				ans *= Math.min(taka[i], ao[i]);
				ans %= mod;
			} else {
				System.out.println(0);
				return;
			}
		}
		System.out.println(ans%mod);
	}
}
