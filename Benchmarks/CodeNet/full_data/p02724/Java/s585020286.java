import java.util.Scanner;


public class Main {


	public static void main(String[] args) {

		long ans = 0;
//		double ans = 0.0;
//		int ans = 0;
//		String ans = "";

		Scanner sc = new Scanner(System.in);
//		double waru = 1000000007;


		long n = sc.nextLong();
//		long m = sc.nextLong();
//		long k = sc.nextLong();

//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		int k = sc.nextInt();
//		int v = sc.nextInt();
//		String s = sc.next();


//		String string = sc.next();
//		StringBuilder s = new StringBuilder(string);

//		String[] strArray = string.split("");

		boolean f = false;

//		String[] s = new String[n];

//		int[] a = new int[n];
//		int[] b = new int[n];
//		long[] a = new long[n];
//		int[][] a = new int[n][m];

//		ArrayList<Long> list = new ArrayList<>();

//		for (int i = 0; i < n; i++) {
//			a[i]= sc.nextInt();
//		}
//		for (int i = 0; i < h; i++) {
//			for(int j = 0; j < w; j++) {
//				a[i][j] = sc.nextInt();
//			}
//		}

		long tmp = 0;
		long tmp2 = 0;
		if(n == 0) {
			System.out.println(ans);
			sc.close();
			return;
		}

		tmp2 = n/500;
		ans += tmp2*1000;
		tmp = n%500;
		tmp2 = tmp/5;
		ans += tmp2*5;

		System.out.println(ans);

		sc.close();
	}
}