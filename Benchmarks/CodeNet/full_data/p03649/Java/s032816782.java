import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());
		
		String[] nico = sc.nextLine().split(" ");
		
		long[] maki = new long[n];
		for (int i = 0; i < n; i++) {
			maki[i] = Long.parseLong(nico[i]);
		}
		
		long total = 0;
		
		for (int i = 0; i < n; i++) {
			if (maki[i] > (n - 1)) {
				long count = maki[i] / n;
				
				for (int j = 0; j < n; j++) {
					if (j == i) continue;
					maki[j] = maki[j] + count;
				}
				maki[i] = maki[i] % n;
				
				i = -1;
				total = total + count;
			}
		}
		System.out.println(total);
	}
}