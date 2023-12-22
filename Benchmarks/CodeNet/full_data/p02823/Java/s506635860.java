import java.util.Scanner;


public class Main {


	public static void main(String[] args) {

		long ans = 0;
//		int ans = 0;
//		String ans = "";

		Scanner sc = new Scanner(System.in);


		long n = sc.nextLong();
//		int n = sc.nextInt();
		long a = sc.nextLong();
		long b = sc.nextLong();
//		int m = sc.nextInt();
//		String s = sc.next();


//		String string = sc.next();
//		StringBuilder s = new StringBuilder(string);

		boolean f = false;

//		String[] s = new String[n];
//		int[] ans = new int[n];
//		int[] a = new int[n];

//		for (int i = 0; i < h; i++) {
//			for(int j = 0; j < w; j++) {
//				a[i][j] = sc.nextInt();
//			}
//		}

//		for (int i = 0; i < n; i++) {
//			a[i] = sc.nextInt();
//		}


		ans = Math.abs(a-b);
		long tmp = ans;
		long senter = (a+b)/2;

		if(ans == 0) {
			System.out.println(ans);
			f = true;
		}

		if(!f) {
			if(ans%2 == 0) {
				ans = ans/2;
			} else {
				if(n/2 > senter) {
					if(a < b) {
						ans = a-1 + ((tmp-1)/2);
					} else {
						ans = b-1 + ((tmp-1)/2);
					}
				} else {
					if(a < b) {
						ans = n-b-1 + ((tmp-1)/2);
					} else {
						ans = n-a-1 + ((tmp-1)/2);
					}
				}

			}
			System.out.println(ans);
		}

		sc.close();
	}

}