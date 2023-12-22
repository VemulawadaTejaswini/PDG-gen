
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int t=sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		int sub=0;
		int ans=t;
		int tmp=0;
		for(int i=n-1; i>0; i--) {
			sub=a[i]-a[i-1];
			if(sub>=t) {
				ans+=t;
				tmp=0;
			} else {
				tmp+=sub;
				if(tmp>=t) {
					ans+=t;
					tmp=tmp-t;
				}
			}

		}
		ans +=tmp;
		System.out.println(ans);
		sc.close();
	}
}


