import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int k=sc.nextInt();
		if(n>m) {
			int temp=n;
			n=m;
			m=temp;
		}
		
		for(int i=0;i<=m;i++) {
			for(int j=0;j<=n;j++) {
				if(k==n*i+(m-2*i)*j || k==m*j+(n-2*j)*i) {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}
}