import java.util.Scanner;

public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		int m=sc.nextInt();
		int initialm=m;
		long ans=1;
		long conb=1;
		int cnt=0;
		boolean bool=true;


		for (int i=2;i<=m;++i){
			cnt=0;
			while (m%i==0 && m!=1){
				m=m/i;
				++cnt;
				bool=false;
			}

			if(i>Math.sqrt(initialm)&&bool==true) break;

			conb=1;

			for(int k=1;k<=cnt;++k){
				conb=(conb*(cnt+n-1-k+1)/k)%1000000007;
			}
			ans=(ans*conb)%1000000007;
		}

		if( bool ==true)System.out.println(n);
		else System.out.println(ans);


	}
}