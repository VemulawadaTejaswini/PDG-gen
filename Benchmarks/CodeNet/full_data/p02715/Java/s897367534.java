import java.util.Scanner;

public class Main {

	static long bignum = 1000000000+7;

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		long[] sum = new long[k+1];

		for(int i = k;i>0;i-- ) {
			long s = divn(k/i,n);

			for(int j=2;j*i<k+1;j++) {
				s -= sum[j*i];
				s = div(s);
			}
			sum[i]=s;
		}
		long ans = 0;
		for(int i =1;i<k+1;i++) {
			ans += sum[i]*i;
			ans = div(ans);
		}
		System.out.println(ans);

	}

	static long divn(int target, int times) {
		int sqtimes = (int)Math.sqrt(times);
		long ans = 1;
		for(int i =0;i<sqtimes;i++) {
			ans = (ans * target)%(1000000000+7);
		}
		long holder = ans;
		ans = 1;
		for(int i =0;i<sqtimes;i++) {
			ans = (ans*holder)%(1000000000+7);
		}
		for(int i=0;i<times - sqtimes*sqtimes;i++) {
			ans = (ans * target)%(1000000000+7);
		}
		return ans;
	}

	static long div(long a) {
		if(a<0)a+=1000000000+7;
		return a%(1000000000+7);
	}

	static int gcd(int a,int b,int c) {
		int ans = 1;
		int max = Math.max(Math.max(a, b),c);
		for(int i =max;i>0;i--) {
			if(a%i==0) {
				if(b%i==0) {
					if(c%i==0) {
						ans = i;
						break;
					}
				}
			}
		}
		return ans;
	}





}
/*
class City{
	int order;
	int prefecture;
	int year;
	int number;
	City(int order,int prefecture, int year){
		this.order = order;
		this.prefecture = prefecture;
		this.year = year;
	}
}
*/
