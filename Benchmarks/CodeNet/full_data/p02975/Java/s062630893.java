import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		long l = 0;
		for(int i=0;i<n;i++) {
			a[i] = sc.nextLong();
			l = l^a[i];
		}
		if(l==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}		
	}
}