import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int P=sc.nextInt();
		int[]a=new int[N];
		long ki=0;
		long gu=0;
		for(int i=0;i<N;i++){
			a[i]=sc.nextInt();
			if(a[i]%2==0)gu++;
			else ki++;
		}
		long ans=1;
		if(P==0){
			ki=comb(ki,2);
			ki+=1;
			for(int i=0;i<gu;i++){
				ans*=2;
			}
			ans=ans*ki;
			System.out.println(ans);
		}else{
			for(int i=0;i<gu;i++){
				ans*=2;
			}
			long pa=0;
			for(int i=1;i<ki;i+=2){
				pa+=comb(ki,i);
				System.out.println(pa);
			}
			ans*=(long)pa;
			System.out.println(ans);
			
		}
	}
	
	long kaijou(long n){
		int ans=1;
		for(int i=1;i<=n;i++){
			ans*=i;
		}
		return ans;
	}
	long comb(long n, long m){
		long c=1;
		m=(n-m<m ? n-m :m);
		for(long ns=n-m+1,ms=1;ms<=m;ns++,ms++){
			c*=ns;
			c/=ms;
		}
		return c;
		
	}
}
