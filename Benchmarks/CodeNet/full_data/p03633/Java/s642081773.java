import java.util.Scanner;
public class Main {
	
	static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
	static int lcm (int a, int b) {return a*b/gcd(a,b);}
	static long Lgcd (long a, long b) {return b>0?Lgcd(b,a%b):a;}
	static long Llcm (long a, long b) {return a*(b/Lgcd(a,b));}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan=new Scanner(System.in);
		long ans=1;
		int a=scan.nextInt();
		for(int i=0;i<a;i++) {
			long b=scan.nextLong();
			if(ans!=b) {
			ans=Llcm(ans,b);
		}
			}
		System.out.println(ans);
		
	}

}
