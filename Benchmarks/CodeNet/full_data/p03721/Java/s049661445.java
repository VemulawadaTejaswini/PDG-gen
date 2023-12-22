
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long k=sc.nextLong();
		long a[] = new long[100000+1];
		for(int i=0; i<n; i++) {
			int v=sc.nextInt();
			long w=sc.nextLong();
			a[v]+=w;
		}
		long cnt=0;
		int ans=-1;
		for(int i=0; i<=100000; i++) {
			cnt+=a[i];
			if(cnt>=k) {
				ans=i;
				break;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}


