import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		int c[] = new int[n];
		int cnt = 0;

		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0; i<n; i++) {
			if(c[i] != 0) continue;
			c[i]=1;
			for(int j=i+1; j<n; j++) {
				if(c[j] != 0) continue;
				if(a[i]>=a[j])continue;
				c[j]=1;
			}
			cnt++;
		}
		System.out.println(cnt);
		sc.close();
	}
}
