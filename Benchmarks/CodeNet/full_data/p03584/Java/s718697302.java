import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		int[] a = new int[n];
		int[] b = new int[n];

		for (int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
		}

		long ans = 0;

		for (int j=0;j<n;j++) {
			if((a[j] & ~k) == 0) {
				ans += b[j];
			}
		}
		
		for (int i=1;i<32;i++) {
			if((k>>i) %2 != 0) {
				long tmp = 0;
				int x = ((k>>i)<<i)-1;
				for (int j=0;j<n;j++) {
					if((a[j] & ~x) == 0) {
						tmp += b[j];
					}
				}
				ans = Math.max(ans, tmp);
			}
		}
		System.out.println(ans);
	}

}
