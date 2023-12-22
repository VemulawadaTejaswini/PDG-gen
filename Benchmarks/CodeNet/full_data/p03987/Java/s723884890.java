import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long[]a=new long[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextLong();
		}
		int[] count=new int[n];
		for(int i=0;i<n;i++){
			int left=1;
			int right=1;
			while(i-left>=0 && a[i-left]>a[i]){
				left++;
			}
			while(i+right<=n-1 && a[i+right]>a[i]){
				right++;
			}
			count[i]=right*left;
		}
		long ans=0;
		for(int i=0;i<n;i++){
			ans+=a[i]*count[i];
		}
		System.out.println(ans);
	}
}