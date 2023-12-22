import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long countA= 0;
		long countB=0;
		long a[] = new long[N];
		long b[] = new long[N];
		for (int i=0;i<N;i++) {
			a[i] = sc.nextLong();
			countA+=a[i];
		}
		for (int i=0;i<N;i++) {
			b[i] = sc.nextLong();
			countB+=b[i];
		}
		if (countB>=countA) {
			long ca =0;
			long cb=0;
			for (int i=0;i<N;i++) {
				if (a[i]>=b[i]) {
					cb +=a[i]-b[i];
				} else {
					ca+=(b[i]-a[i])/2;
					ca +=(b[i]-a[i])%2;
					cb +=(b[i]-a[i])%2;
				}
			}
			long count= countB-countA;
			if (count<cb||count<ca) {
				System.out.println("No");
			} else {
				if ((count-ca)*2==count-cb) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}
		} else {
			System.out.println("No");
		}
	}
}