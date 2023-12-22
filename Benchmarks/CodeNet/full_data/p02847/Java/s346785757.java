import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a=sc.nextLong(),b=sc.nextLong();
		long x = sc.nextLong();
		long min=1, max=9, digit=0;
		for(int i=1;i<10;i++) {
			if(x<cost(a,b,min)) {
				System.out.println(min-1);
				return ;
			}
			if(cost(a,b,min)<=x && x<=cost(a,b,max)) {
				digit=i;
				break;
			}
			min*=10;
			max=min*10-1;
		}
		if(x<cost(a,b,min)) {
			System.out.println(min-1);
			return ;
		}
		if(digit==0) {
			System.out.println("1000000000");
			return ;
		}
		long ans = (long)(x-b*digit)/a;
		System.out.println(ans);
	}
	public static long cost(long a, long b, long x) {
		return a*x + b*digit(x);
	}

	public static long digit(long x) {
		long count=0;
		while(x!=0) {
			count++;
			x/=10;
		}
		return count;
	}
}