import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int L=sc.nextInt();

		int min = 200005;
		int sum = 0;
		int sign = 1;
		for(int i=1; i<=N; i++) {
			if(Math.abs(L+i-1)<min) {
				min = Math.abs(L+i-1);
				sign = L+i-1<0 ? -1 : 1;
			}
			sum += L+i-1;
		}
		System.out.println(sum-min*sign);
		sc.close();
	}
}
