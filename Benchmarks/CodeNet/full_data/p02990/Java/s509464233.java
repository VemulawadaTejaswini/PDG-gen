import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();

		//青と赤のそれぞれの区切り方をかける//
		int p=10^9+7;
		for(int i=1;i<=k;i++){
			long b=1;
			long r=1;
			for(int j=0;j<=i-2;j++){
				b*=k-1-j;
				
			}
			for(int j=1;j<=i-1;j++){
				b/=j;
				
			}
			
			for(int j=0;j<=i-1;j++){
				r*=n-k+1-j;
			
			}
			for(int j=1;j<=i;j++){
				r/=j;
				
			}
			
			System.out.println(b*r%p);
		}
	}
}