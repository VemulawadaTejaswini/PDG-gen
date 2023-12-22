import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,m;
		long[] a;
		long b;
		long c;
		long sum=0;

		n=sc.nextInt();
		m=sc.nextInt();
		a = new long[n];

		for(int i=0; i<a.length; i++){
			a[i] = sc.nextLong();
		}
		Arrays.sort(a);

		for(int i=0; i<m; i++){
			b = sc.nextLong();
			c = sc.nextLong();
			for(int j=0; j<b; j++){
				if(a[j]<c){ a[j]=c; }
				else {break;}
			}
			Arrays.sort(a);
		}
		for(int i=0; i<a.length; i++){
			sum += a[i];
		}
		System.out.println(sum);
	}
}