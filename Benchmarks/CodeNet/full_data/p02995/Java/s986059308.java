import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		long a=sc.nextLong();
		long b=sc.nextLong();
		long c=sc.nextLong();
		long d=sc.nextLong();
		a=a-1;
 
        long s1=a-(a/c+a/d-a/lcm(c,d));
        long s2=b-(b/c+b/d-b/lcm(c,d));
 
        System.out.println(s2-s1);
        sc.close();
    }
 
    static long gcd(long a,long b) {
        if(b%a==0) {
            return a;
        }
        return gcd(b%a,a);
    }
 
    static long lcm(long a,long b) {
        return a*b/gcd(a,b);
	}
}