import java.util.*;
// warm-up
// Same pattern multiple times. I think its a sign
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt(), X = sc.nextInt(), t=0;
		for (int i=0; i<=A; i++) {
			for (int j=0; j<=B; j++) {
				if ((X-(500*i)-(100*j))%50!=0) continue;
				int k = (X-(500*i)-(100*j))/50;
				if (k>=0 && k<=C) t++;
			}
		}
		System.out.println(t);
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}