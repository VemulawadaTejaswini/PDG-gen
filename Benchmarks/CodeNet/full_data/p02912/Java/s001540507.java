import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextLong();
		}
		scan.close();
		//大きい額の商品に割引をしていく
		for(int i=m;i>0;i--) {
			Arrays.sort(a);
			a[a.length-1]=(long)(a[a.length-1]/2);
		}
		long cnt=0;
		for(int i=0;i<n;i++) {
			cnt+=a[i];
		}
		System.out.println(cnt);
	}

}
