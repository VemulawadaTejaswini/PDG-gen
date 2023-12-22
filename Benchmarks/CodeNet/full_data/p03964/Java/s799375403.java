import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		long t[]=new long[n];
		long a[]=new long[n];
		for(int i=0;i<n;i++) {
			t[i]=scanner.nextInt();
			a[i]=scanner.nextInt();
		}
		for(int i=1;i<n;i++) {
			long p=Math.max(t[i-1]/t[i], a[i-1]/a[i]);
			t[i]*=p;
			a[i]*=p;
		}
		System.out.println(t[n-1]+a[n-1]);
	}
}
