
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[] = new int[n+1];
		for(int i=0; i<=n; i++) {
			a[i]=-1;
		}
		for(int i=0; i<m; i++) {
			int s = sc.nextInt();
			int c = sc.nextInt();
			if(a[s]!=-1 && a[s]!=c) {
				System.out.println(-1);
				sc.close();
				return;
			}
			a[s]=c;
		}
		int ans = 0;
		for(int i=1; i<=n; i++) {
			int d=-1;
			if(i==1) {
				if(a[i]==-1) {
					d=1;
				}else if(a[i]==0) {
					System.out.println(-1);
					sc.close();
					return;
				} else {
					d=a[i];
				}
			}else {
				if(a[i]==-1) {
					d=0;
				}else {
					d=a[i];
				}
			}
			ans = ans * 10 + d;
		}
		System.out.println(ans);
		sc.close();
	}
}
