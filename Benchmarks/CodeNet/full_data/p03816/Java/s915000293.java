import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int cnt[] = new int[100000+5];
		for(int i=0; i<n; i++) {
			cnt[sc.nextInt()]++;
		}
		int odd = 0;
		int even = 0;
		for(int i=0; i<cnt.length; i++) {
			if(cnt[i]>0) {
				if(cnt[i]%2==0) {
					even++;
				}else {
					odd++;
				}
			}
		}
		int ans = even+odd;
		if(even%2 !=0) {
			ans -= 1;
		}
		System.out.println(ans);
		sc.close();
	}

}
