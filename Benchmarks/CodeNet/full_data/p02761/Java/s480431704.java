
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
		boolean ok = true;
		for(int i=0; i<m; i++) {
			int s = sc.nextInt();
			int c = sc.nextInt();
			if(a[s]==-1 || a[s]==c) {
				a[s]=c;
			}else {
				ok=false;
				break;
			}
		}
		String ans = "";
		if(a[1]==-1 || a[1]==0) {
			ok=false;
		}else {
			for(int i=1; i<=n; i++) {
				if(a[i]==-1) {
					ans += "0";
				}else {
					ans += Integer.toString(a[i]);
				}
			}
		}

		if(ok) {
			System.out.println(ans);
		}else {
			System.out.println(-1);
		}
		sc.close();
	}
}
