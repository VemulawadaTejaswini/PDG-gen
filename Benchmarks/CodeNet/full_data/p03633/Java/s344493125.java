import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		long b = sc.nextLong();
		for(int i = 1; i<a; i++){
			long h=sc.nextLong();
			b=b*h/gcd(b,h);
		}
		System.out.println(b);
	}
	public static long gcd(long q,long p){
		long x = q%p;
		if(x==0){
			return p;
		}else{
			return gcd(p,x);
		}
	}
}