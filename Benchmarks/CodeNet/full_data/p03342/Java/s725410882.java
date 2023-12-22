import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}

		int ans = n;	//l=rはすべて大威を満たすので，最初からっそれを入れておく

		for(int i = 0; i < n; i++) {
			int xorp = a[i];
			int sump = a[i];

			for(int j = i+1; j < n; j++) {
				int xor = xorp^a[j];
				int sum = sump + a[j];
				if(xor == sum) {
					ans++;
				}
				xorp = xor;
				sump = sum;
			}
		}

		System.out.println(ans);

	}

}