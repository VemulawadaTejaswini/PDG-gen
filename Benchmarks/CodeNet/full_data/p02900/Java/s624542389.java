import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		long ans2 = 0;
		long ans = 0;

		Scanner sc = new Scanner(System.in);
		long  a = sc.nextLong();
		long  b = sc.nextLong();

//		int  k = sc.nextInt();
//		long d = sc.nextLong();

//		String string = sc.next();
//		StringBuilder s = new StringBuilder(string);

//		boolean f = true;
//
//		int[] aa = new int[n];
//		int[] b = new int[n];
//		for (int i = 0; i < n; i++) {
//			aa[i] = sc.nextInt();
//			b[i] = 0;
//		}
//		for (int i = 0; i < k; i++) {
//			b[i] = sc.nextInt();
//		}
//		for (int i = 1; i <n; i++) {
//			b[i] = sc.nextInt();
//		}
//		int[][] c = new int[h][w];
//		for (int i = 0; i < h; i++) {
//			for(int j = 0; j < w; j++) {
//				c[i][j] = 0;
//			}
//		}

		long tmp_a = 0;
		long tmp_b = 0;
		if(a>b) {
			tmp_a = a;
			tmp_b = b;
		} else {
			tmp_a = b;
			tmp_b = a;
		}
//		long[] ls = new long[300];
//		int cnt1 = 0;

		long tmp =0;
		while(tmp_a%tmp_b!=0) {
			tmp = tmp_a%tmp_b;
			tmp_a = tmp_b;
			tmp_b = tmp;
//			ls[cnt1] = tmp;
//			cnt1++;
		}

		if(tmp == 0) {
			tmp = tmp_b;
		}
		long cnt=0;

		for(long i=1;i<=tmp;i++) {
			if (i == 2 || i == 3) {
			    if(a%i==0&&b%i==0) {
			    	cnt++;
			    }
			} else if (i % 2 == 0 || i % 3 == 0) {

			} else {
				if(a%i==0&&b%i==0) {
			    	cnt++;
			    }
			}
		}

		System.out.println(cnt);

		sc.close();
	}
}