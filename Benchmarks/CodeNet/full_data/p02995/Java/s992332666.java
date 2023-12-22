import java.util.Scanner;

public class Main{

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		long a=sc.nextLong();
		long b=sc.nextLong();
		long c=sc.nextLong();
		long d=sc.nextLong();

		long cc=b/c-(a-1)/c; //cで割り切れるもの
		long dd=b/d-(a-1)/d; //dで割り切れるもの
		long max=1;
		for(long i=c;i>=1;i--){
			if(c%i==0 && d%i==0){
				max=i;
				break;
			}
		}
		long min=c*d/max; //最小公倍数
		long abcd=b/min-(a-1)/min; //cとdで割り切れるもの
		System.out.println(b-a+1-cc-dd+abcd);


	}
}
