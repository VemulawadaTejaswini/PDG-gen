
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();

		ArrayList<Integer> yakusu = new ArrayList<Integer>();
		for(int i=1; i*i<=m; i++) {
			if(m%i==0) {
				yakusu.add(i);
				if(m/i != i) {
					yakusu.add(m/i);
				}
			}
		}

		int ans = 1;
		for(int i : yakusu) {
			if((long)i*n<=m) {
				ans = Math.max(ans, i);
			}
		}
		System.out.println(ans);

		sc.close();
	}
}
