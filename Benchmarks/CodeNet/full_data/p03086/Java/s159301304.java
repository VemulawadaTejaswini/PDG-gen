import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

	void solve() {
		Scanner sc = new Scanner(System.in);
		char[] c = sc.next().toCharArray();
		sc.close();

		int cnt = 0;
		int maxL = 0;
		for(int i = 0; i < c.length; i++) {
			if (c[i]=='A'||c[i]=='C'||c[i]=='G'||c[i]=='T'){
				cnt++;
				maxL = Math.max(cnt, maxL);
			}else {
				cnt = 0;
			}
		}
		System.out.println(maxL);
	}

}
