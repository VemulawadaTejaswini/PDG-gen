import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		long a[]=new long[n];

		long cnt=0;
		for(int i=0;i<n;i++) {
			a[i]=scan.nextLong();
			cnt+=a[i];
		}
		scan.close();
		//大きい額の商品に割引をしていく
		for(int i=m;i>0;i--) {
			Arrays.sort(a);
			int check=1;
			if(a.length-2>=0)check=func(check,a[a.length-1],a[a.length-2]);
			cnt-=a[a.length-1];
			a[a.length-1]=(long)(a[a.length-1]/Math.pow(2,check));
			cnt+=a[a.length-1];
		}
		System.out.println(cnt);
	}

	static int func(int check,long x,long y) {
		if(x/Math.pow(2,check)>y)return func(check,x,y);
		else return check;
	}
}