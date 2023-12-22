
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long cnt=0;
		for(int b=1; b<=N; b++) {
			int p = N/b;
			int q = N%b;
			cnt += p * Math.max(0,b-K) + Math.max(0, q-K+1);
		}
		if(K==0) cnt -= N;
		System.out.println(cnt);
		sc.close();
	}

}
