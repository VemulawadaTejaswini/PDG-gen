import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		int[] up = new int[n]; //最もでかいbitの桁
		for(int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
			up[i] = (int) (Math.log(a[i])/Math.log(2));
		}

		int ans = n;	//l=rはすべて大威を満たすので，最初からっそれを入れておく

		for(int i = 0; i < n; i++) {
			int xorp = a[i];
			int sump = a[i];
			int max = (int) Math.pow(2, up[i]+1);
			for(int j = i+1; j < n; j++) {
				int xor = xorp^a[j];
				int sum = sump + a[j];
				if(xor == sum) {
					ans++;
				}

				int temp = (int) Math.pow(2, up[j]+1);
				if(temp > max) {
					max = temp;
				}

				if(sum >= max) {
					break;
				}
				xorp = xor;
				sump = sum;
			}
		}

		System.out.println(ans);

	}

}