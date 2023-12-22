import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		long ans = 0;

		for(int i = 1; i <= k; i++) {
			for(int j = 1; j <= k; j++) {
				for(int a = 1; a <= k; a++) {
					int temp = getGcd(i, j);
					ans += getGcd(a, temp);
				}
			}
		}

		System.out.println(ans);
		sc.close();
	}

	private static int getGcd(int p, int q){
		while(q != 0){
			int r = p % q;
			p = q;
			q = r;
		}
		return p;
	}

}