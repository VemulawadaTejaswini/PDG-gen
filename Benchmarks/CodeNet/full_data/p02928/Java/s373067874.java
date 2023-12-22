import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		long ans = 0;

		Scanner sc = new Scanner(System.in);
		int  n = sc.nextInt();
		long  k = sc.nextLong();
//		longd = sc.nextInt();
//
//		boolean f = false;
		int[] ai = new int[n];
//		int[] tmp = new int[n];
		for (int i = 0; i < n; i++) {
			ai[i] = sc.nextInt();
//			tmp[i] = 0;
		}

//		int[] bi = new int[n];
//		for (int i = 0; i < k; i++) {
//			bi[i] = sc.nextInt();
//		}

		long tmp = 0;
		long tmp2 = 0;

		for(int i=0; i < n; i++) {
			for(int j = i+1; j < n; j++){
				if(ai[i] > ai[j]) {
					tmp++;
				}
				if(ai[i] < ai[j]) {
					tmp2++;
				}
			}
		}
//		System.out.println(tmp);

		for(long i = 1; i <= k; i++) {
			if(i == 1) {
				ans = (i * tmp) + ans;
			} else {
				ans = (i * tmp) + ans + ((i-1) * tmp2);
			}
		}
//		System.out.println(ans);
		ans = ans % 1000000007;

		System.out.println(ans);

		sc.close();
	}
}