
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		int s=1;
		int curr=-1;
		for(int i=0; i<n; i++) {
			if(a[i]==s) {
				s++;
				curr=i;
			}
		}

		int ans = 0;
		if(curr==-1) {
			System.out.println(-1);
			sc.close();
			return;
		}
		for(int i=curr-1; i>=0; i--) {
			if(a[i]==a[curr]-1) {
				ans += (curr-(i+1));
				curr=i;
			}
		}
		System.out.println(ans+(curr));
		sc.close();
	}
}
