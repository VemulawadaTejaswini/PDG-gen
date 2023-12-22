import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=new int[n];
		int[]count=new int[100000];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt()-1;
			count[a[i]]++;
		}
		int ans=0;
		for(int i=0;i<100000;i++) {
			if(count[i]%2!=0)ans++;
		}
		System.out.println(ans);
	}
}