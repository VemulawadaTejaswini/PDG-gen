import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long s=sc.nextLong();
		for(long b=2;b<n;b++){
			if(func(b,n)==s){
				System.out.println(b);
				return;
			}
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