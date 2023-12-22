
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();

		int cnt = 1;
		int sum=0;

		for(int i=0; i<n; i++) {
			int l=sc.nextInt();
			sum += l;
			if(sum<=x) {
				cnt++;
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}
