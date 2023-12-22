
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		char s[] = sc.next().toCharArray();

		int esum[] = new int[n+1];
		int wsum[] = new int[n+1];
		for(int i=0; i<n; i++) {
			if(s[i] == 'E') {
				esum[i+1] += esum[i]+1;
				wsum[i+1] += wsum[i];
			} else {
				esum[i+1] += esum[i];
				wsum[i+1] += wsum[i]+1;
			}
		}
		int ans = Integer.MAX_VALUE;
		for(int i=0; i<n; i++) {
			ans = Math.min(ans, wsum[i] + esum[n] - esum[i+1]);
		}
		System.out.println(ans);
		sc.close();
	}
}
