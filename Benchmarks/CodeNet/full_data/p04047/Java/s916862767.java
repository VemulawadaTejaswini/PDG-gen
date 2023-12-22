import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}

	void solve(){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]L=new int[2*n];
		for(int i=0;i<2*n;i++) {
			L[i]=sc.nextInt();
		}
		Arrays.sort(L);
		long ans=0;
		for(int i=0;i<2*n;i++) {
			if(i%2==0)ans+=L[i];
		}
		System.out.println(ans);
	}
}
