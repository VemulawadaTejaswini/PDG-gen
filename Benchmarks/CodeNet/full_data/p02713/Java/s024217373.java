import java.util.Scanner;


public class Main {


	final int MOD = 1000000007;


	public static void main(String[] args) {

		long ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

//		int n = sc.nextInt();
		int k = sc.nextInt();

		//-------------------------------------------------------------------------------------

		for(int i = 1; i <= k; i++) {
			for(int j = 1; j <= k; j++) {
				int tmpGcd = gcd(i, j);
				for(int l = 1; l <= k; l++) {
					ans += gcd(tmpGcd, l);
				}
			}
		}


		//-------------------------------------------------------------------------------------

//		if(f) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("No");
//		}

		System.out.println(ans);

		sc.close();
	}

	static int gcd (int a, int b) {
		int temp;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return b;
	}
}