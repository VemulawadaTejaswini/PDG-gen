import java.util.Scanner;

public class Main {

	static long bignum = 1000000000+7;

	public static int[] rudder = new int[200001];
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int a  = sc.nextInt();
		int b  = sc.nextInt();
		
		long ans = 0;
		
		rudder[0]=1;
		for(int i=1;i<rudder.length;i++) {
			rudder[i]=(int) (((long)rudder[i-1]*i)%bignum);
		}
		
		ans =  2*bignum+powdev(2,n)-1;
		ans -= conv(n,a);
		ans -= conv(n,b);
		
		ans = ans%bignum;
		System.out.println(ans);
	}
	
	
	static long powdev(long num, int times) {
		int sqrt = (int)Math.sqrt(times);
		long subans = 1;
		for(int i=0;i<sqrt;i++) {
			subans = (subans * num)%bignum;
		}
	    long subansholder = subans;
	    for(int i=0;i<sqrt-1;i++) {
			subans = (subans * subansholder)%bignum;
		}
	    for(int i=0;i<times-sqrt*sqrt;i++) {
			subans = (subans * num)%bignum;
		}
		return subans;
		
	}
	
	static long conv(int a,int  b) {
		long ans = rudder[a];
		ans = ans * powdev(rudder[b],(int) (bignum-2))%bignum;
		ans = ans * powdev(rudder[a-b],(int) (bignum-2))%bignum;
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
