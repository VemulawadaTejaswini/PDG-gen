import java.util.Scanner;

class Main{
	static long mod=1000000007;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			long n=sc.nextLong(),ans=1;
			for(long i=2;i<=n;i++){ ans*=i; ans%=mod; }
			System.out.println(ans);
		}
	}
}