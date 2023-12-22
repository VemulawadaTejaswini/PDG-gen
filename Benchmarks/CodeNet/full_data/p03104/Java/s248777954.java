
import java.util.*;


public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	class Pair{
		int a;
		int b;
		Pair(int a,int b){
			this.a=a;
			this.b=b;
		}
	}


	public void run() {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();

		long ans = calc(b) ^ calc(a-1);
		System.out.println(ans);
		sc.close();
	}

	private long calc(long x) {

		x++;

		long ans = 0;

		for(int i=0; i<50; i++) {
			long loop = 1L<<(i+1);

			long cnt = (x/loop) * (loop/2);
			cnt += Math.max(0L,  (x%loop) - (loop/2));
			if(cnt % 2 != 0) {
				ans += (1L<<i);
			}
		}

		return ans;
	}


}
