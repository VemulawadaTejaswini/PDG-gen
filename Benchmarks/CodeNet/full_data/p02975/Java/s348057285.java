import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextLong();
		}
		boolean b = true;
		for(int i=0;i<n;i++) {
			if(a[i] != (a[(i+n-1)%n]^a[(i+1)%n])) {
				b = false;
			}
		}
		if(b) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}