import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long A=sc.nextLong();
		long B=sc.nextLong();
		long max=max(A,B);
		long cnt=0;
		long sqmax=(long)Math.sqrt(max);
		for(long i=1;i<=sqmax;i++) {
			if(max%i==0) {
				long j=max/i;
				if(sosu(i)) {
					cnt++;
				}
				if(i!=j&&sosu(j)) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
	public static boolean sosu(long a) {
		long x=(long)Math.sqrt(a);
		for(long i=2;i<=x;i++) {
			if(a%i==0) {
				return false;
			}
		}

		return true;
	}
	public static long max(long a,long b) {
		long x=(long)Math.sqrt(a);
		for(long i=1;i<=x;i++) {
			if(a%i==0) {
				i=a/i;
				if(b%i==0) {
					return i;
				}
				i=a/i;
			}
		}
		for(long i=x;i>0;i--) {
			if(a%i==0) {
				//x=a/x;
				if(b%i==0) {
					return i;
				}
				//x=a/x;
			}
		}
		return 1;
	}

}