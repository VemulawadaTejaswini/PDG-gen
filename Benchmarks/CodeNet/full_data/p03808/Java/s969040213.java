import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=new int[n];
		long sum=0;
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		long nsum=n*(n+1)/2;
		if(sum%nsum!=0){
			System.out.println("NO");
			return;
		}
		
		for(int t=0;t<sum/nsum;t++){
			int id=0;
			int max=0;
			for(int i=0;i<n;i++){
				if(max<a[i]){
					max=a[i];
					id=i;
				}
			}
			for(int i=0;i<n;i++){
				if(i==id)a[i]-=n;
				else a[i]-=(i-id+n)%n;
			}
		}
		
		for(int i=0;i<n;i++){
			if(a[i]!=0){
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}

}