import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long s=sc.nextLong();
		for(long b=2;b<(long)Math.sqrt(n);b++){
			if(func(b,n)==s){
				System.out.println(b);
				return;
			}
		}
		//n=p*b+q
		//s=p+q
		//n-s=p*(b-1)
		for(long p=(long)Math.sqrt(n);p<=n-s/p+1;p++){
			long b=n-s/p+1;
			if(func(b,n)==s)System.out.println(b);
		}
		System.out.println(-1);
	}
	
	static long func(long b,long n){
		if(n<b)return n;
		else {
			long retval=0;
			while(n>=b){
				retval+=n%b;
				n=n/b;
			}
			retval+=n%b;
			return retval;
		}
	}
}