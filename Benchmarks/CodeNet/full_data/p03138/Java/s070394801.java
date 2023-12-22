import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long k = sc.nextLong();
		
		
		int[] c1 = new int[64];
		int[] c0 = new int[64];
		for(int i = 0; i < 64; i++) {
			c1[i] = 0;
			c0[i] = 0;
		}
		for(int i = 0; i < n; i++) {
			long a = sc.nextLong();
			for(int j = 63; j >= 0; j--) {
				if(a % 2 == 0) {
					c0[j]++;
				}else {
					c1[j]++;
				}
				a /= 2;
			}
		}
		
		long ans = 0;
		for(long i = 0; i <= k; i++) {
			long l = i;
			long tmp = 0;
			boolean[] binary = new boolean[64];
			for(int j = 63; j >= 0; j--) {
				if(l % 2 != 0) {
					binary[j] = true;
				}
				l /= 2;
			}
			
			for(int j = 0; j < 64; j++) {
				tmp *= 2;
				if(binary[j]) {
					tmp += c0[j];
				}else {
					tmp += c1[j];
				}
			}
			
			ans = Math.max(ans, tmp);
		}
		
		System.out.println(ans);
	}
}