import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		Long[] a = new Long[n];
		String[] a2 = new String[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
			a2[i] = String.format("%42s", Long.toBinaryString(a[i])).replace(" ", "0");
		}
		
		long x = 0;
		for (int i=41; i>=0; i--) {
			if (Math.pow(2, i) > k) {
				continue;
			}
			
			int one = 0;
			int zero = 0;
			for (int j=0; j<n; j++) {
				char c = a2[j].charAt(41 - i);
				//System.out.println(a2[j] + "の" + (41 - i) + "文字目は" + c + "です");
				one =+ 1 ^ Character.getNumericValue(c);
				zero =+ 0 ^ Character.getNumericValue(c);
			}
			
			if (one > zero) {
				long tmp = (long) (x + Math.pow(2, i));
				if (k >= tmp) {
					x = tmp;
				}
			}
		}
		
		long kotae = 0;
		for (int i=0; i<n; i++) {
			kotae += x ^ a[i];
		}
		//System.out.println(x);
		System.out.println(kotae);
	}
}
