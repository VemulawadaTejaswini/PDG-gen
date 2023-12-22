import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
		long k=sc.nextInt();

		//青と赤のそれぞれの区切り方をかける//
		long p=1_000_000_007;
		for(int i=1;i<=k;i++){
			long b=1;
			long r=1;
			for(long j=0;j<=i-2;j++){
				b*=k-1-j;
				
			}
			for(long j=1;j<=i-1;j++){
				b/=j;
				
			}
			
			for(long j=0;j<=i-1;j++){
				r*=n-k+1-j;
			
			}
			for(long j=1;j<=i;j++){
				r/=j;
				
			}
			
			System.out.println(r*b%p);
			
		}
	}
}