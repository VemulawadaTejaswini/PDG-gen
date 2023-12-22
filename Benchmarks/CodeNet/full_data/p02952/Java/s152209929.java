import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		sc.close();

		int nLen = String.valueOf(N).length();
		int ans = 0;


		for(int i=1; i<nLen; i++) {
			if(i == 1) {
				ans += 9;
			}else if(i % 2 == 1) {
				ans += 9 * Math.pow(10, i - 1);
			}
		}
		if(nLen == 1) {
			ans += N;
		}else if(nLen%2 == 1) {
			ans += N - (Math.pow(10, nLen - 1)-1);
		}

		System.out.println(ans);

	}
}
