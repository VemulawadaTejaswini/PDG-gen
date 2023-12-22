import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int[] r = new int[101];
		
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		
		for (int i=0; i<N; i++) {
			int x = cin.nextInt();
			r[x]++;
		}

		int ans = 0;
		for (int i=100; i>=1; i--) {
			if (r[i] != 0) {
				ans++;
//				System.out.println(i + ":"+ r[i]);
			}
		}

		System.out.println(ans);
		
		cin.close();
	}

}