import java.util.Scanner;

public class Main implements Runnable{
	public static void main(String[] args) {
		new Thread(null, new Main(), "", 16 * 1024 * 1024).start();
	}
		public void run() {
			Scanner sc = new Scanner(System.in);
		    int N = sc.nextInt();
		    int K = sc.nextInt();
		    int[] a = new int[N];
		    int cnt = 0;
		    long ans = 0;

		    for(int i = 0; i < N; i++) {
		    	a[i] = sc.nextInt();
		    }

		    int r = 0;
		    for(int i = 0; i < N; i++) {
		    	while(ans < K) {
		    		if(r == N) break;

		    		ans += a[r];
		    		r++;
		    	}
		    	if(ans < K) break;
		    	cnt += N - r + 1;
		    	ans -= a[i];
		    }

		    System.out.println(cnt);
		}
}