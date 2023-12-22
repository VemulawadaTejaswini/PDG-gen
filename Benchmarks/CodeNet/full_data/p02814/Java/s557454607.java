import java.util.*;
import java.math.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long m=sc.nextLong();
		long l=1;
		int count2=0;
		for(int i=0; i<n; i++){
			long a =sc.nextLong();
			int tmp=0;
			while(a%2==0){
				a/=2;
				tmp++;
			}
			if(i==0){
				count2=tmp;
			}else if(count2!=tmp){
				System.out.println(0);
				return;
			}
			try{
			l=l*a/gcd(l,a);
			}catch(StackOverflowError e){
				System.out.println(00);
				return;
			}
		}
		long two=2;
		count2--;
		while(count2>0){
			if((count2 & 1)==1){
				l*=two;
			}
			two*=two;
			count2>>=1;
		}
		m/=l;
		System.out.println((m+1)/2);
	}
	private static long gcd(long m, long n) {
    if(m < n) return gcd(n, m);
    if(n == 0) return m;
    return gcd(n, m % n);
}
}
