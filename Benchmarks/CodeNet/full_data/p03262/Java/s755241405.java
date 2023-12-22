import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int N = scanner.nextInt();
		final int X = scanner.nextInt();

		int[] xs = new int[N];
		for (int i=0; i<N; i++) xs[i]=scanner.nextInt();
		Arrays.sort(xs);

		int minDist = Integer.MAX_VALUE;
		int ans = 0;

		for (int i=0; i<N; i++){
			minDist = Math.min(minDist, Math.abs(xs[i]-X));
			if (i!=0){
				if (ans==0) ans = Math.abs(xs[i]-xs[i-1]);
				else ans = euc(ans, Math.abs(xs[i]-xs[i-1]));
			}
		}
		if (ans==0) ans = minDist;
		else ans = euc(ans, minDist);
		System.out.println(ans);
	}

	static int euc(int a, int b){
		if (a<b){	//a>=bほしょー
			int c = a;	a = b;	b = c;
		}
		while(a%b!=0) {
			int c = a%b;	a=b;	b=c;
		}
		return b;
	}

}