import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		char[] n = scn.nextLine().toCharArray();
		int[] N = new int[n.length];
		for (int i = 0; i < n.length; i++) {
			N[i] = (int) (n[i] - 48);
		}
		int K = scn.nextInt();
		long ans = 0;

		if(K==1) {
			ans += N[0] + (N.length-1)*9;
			System.out.println(ans);
			return;
		}

		long buf = 1;
		for (int j = 0; j < K; j++) {
			buf *= (N.length - 1 - j) * 9;
			buf /= (j + 1);
		}
		ans += buf;

		buf = 1;
		for (int j = 0; j < K-1; j++) {
			buf *= (N.length - 1 - j) * 9;
			buf /= (j + 1);
		}
		ans += buf * (N[0]-1);

		if(K==2) {
			buf = 0;
			boolean y = false;
			for(int i = 1;i<N.length;i++) {
				if(!y && N[i]!=0) {
					y = true;
					buf+=N[i];
				}else {
					buf += 9;
				}
			}
			ans+= buf;
			System.out.println(ans);
			return;
		}

		int sec = N.length;
		for(int i = 1;i<N.length;i++) {
			if(N[i]!=0) {
				sec = i;
				break;
			}
		}
		if(sec == N.length) {
			System.out.println(ans);
			return;
		}

		buf = 1;
		for (int j = 0; j < K-1; j++) {
			buf *= (N.length - sec - 1 - j) * 9;
			buf /= (j + 1);
		}
		ans += buf;

		buf = 1;
		for (int j = 0; j < K-2; j++) {
			buf *= (N.length-sec - 1 - j) * 9;
			buf /= (j + 1);
		}
		ans += buf * (N[sec]-1);


		buf = 0;
		boolean y = false;
		for(int i = sec+1;i<N.length;i++) {
			if(!y && N[i]!=0) {
				y = true;
				buf+=N[i];
			}else {
				buf += 9;
			}
		}
		ans+= buf;
		System.out.println(ans);
	}

}
