
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int ans=0;
		int next=1;
		for(int i=0; i<n; i++) {
			int a=sc.nextInt();
			if(a==next) {
				next++;
			} else {
				ans++;
			}
		}
		if(ans==n) {
			System.out.println(-1);
		} else {
			System.out.println(ans);
		}

		sc.close();
	}
}
