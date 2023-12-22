import java.util.Arrays;
import java.util.Scanner;
public class Main{
	static Scanner s = new Scanner(System.in);
	static int n,a[];
	public static void main(String[] args) {
		n = s.nextInt();
		a = new int[n];
		for(int i=0;i<n;i++) a[i]=s.nextInt();
		Arrays.sort(a);

		/*
		long[] ruisekiwa = new long[n];
		ruisekiwa[0]=a[0];
		for(int i=1;i<n;i++) ruisekiwa[i]=a[i]+a[i-1];
		System.out.println(Arrays.toString(ruisekiwa));
		*/

		int last=a[n-1],count=1;

		long sum=a[0],result=1;
		for(int i=1;i<n;i++) {
			if(sum*2>=a[i]) {
				count++;
			}else {
				count=1;
			}
			sum+=a[i];
		}
		System.out.println(count);
	}
}