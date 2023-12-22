import java.util.Scanner;


public class Main {


	public static void main(String[] args) {

//		long ans = 0;
//		long ans2 = 0;
		int ans = 0;
//		String ans = "";

		Scanner sc = new Scanner(System.in);


//		long n = sc.nextLong();
//		long m = sc.nextLong();
//		long k = sc.nextLong();

		int n = sc.nextInt();
//		int m = sc.nextInt();
//		int k = sc.nextInt();
//		int v = sc.nextInt();
//		String s = sc.next();


//		String string = sc.next();
//		StringBuilder s = new StringBuilder(string);
//		String string2 = sc.next();
//		StringBuilder s2 = new StringBuilder(string);

		boolean f = false;

		String[] s = new String[n];

		int[] a = new int[n];
//		long[] a = new long[n];

//		int[][] a = new int[n][m];



//		for (int i = 0; i < h; i++) {
//			for(int j = 0; j < w; j++) {
//				a[i][j] = sc.nextInt();
//			}
//		}

		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
			a[i] = sc.nextInt();
		}
		String x = sc.next();

//		if() {
//
//		} else {
//
//		}


		for(int i = 0; i < n; i++) {
			if(f)ans += a[i];
			if(x.equals(s[i])) {
				f = true;
			}
		}

		System.out.println(ans);

		sc.close();
	}


}