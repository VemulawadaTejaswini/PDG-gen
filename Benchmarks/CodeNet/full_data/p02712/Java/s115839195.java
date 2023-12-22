import java.util.Scanner;


public class Main {


	final int MOD = 1000000007;


	public static void main(String[] args) {

		long ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

		int n = sc.nextInt();
//		int k = sc.nextInt();

		//-------------------------------------------------------------------------------------

		for(int i =0; i < n; i++) {
			if(i%3 != 0 && i%5 != 0) {
				ans += i;
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
}