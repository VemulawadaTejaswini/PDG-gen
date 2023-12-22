import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int n = S.length();
		int[]a = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=Integer.parseInt(S.substring(i, i+1));
		}
		sc.close();

		//偶数i と 奇数i
		int Even0 = 0,Odd1 = 0,Even1 = 0,Odd0 = 0;
		//偶数i
		for(int i=0;i<n;i+=2) {
			if(a[i]==0) Even0++;
			else Even1++;
		}
		//奇数i
		for(int i=1;i<n;i+=2) {
			if(a[i]==0) Odd0++;
			else Odd1++;
		}

		int cntA = Even0+Odd1;
		int cntB = Even1+Odd0;
		System.out.println((n-Math.max(cntA, cntB)));
	}

}
