import java.util.Arrays;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scanner.nextInt();
		}
		Arrays.sort(a);
		int s=n-1;
		int tmp[]=new int[n];
		for(int i=0;i<n;i++) {
			tmp[i]=s;
			if(i%2==1) {
				s-=2;
			}
		}
		Arrays.sort(tmp);
		for(int i=0;i<n;i++) {
			if(a[i]!=tmp[i]) {
				System.out.println(0);
				return;
			}
		}
		System.out.println((int)Math.pow(2, n/2));
	}
}