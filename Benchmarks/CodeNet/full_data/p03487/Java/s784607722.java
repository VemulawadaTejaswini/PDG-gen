import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int a[] = new int[n];
		for (int i = 0; i <= n - 1; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);
		int sta, gol;
		int ans = 0;
		sta = 0;
		gol = 0;
		int nag = 0;

		if(n!=1){
		for (int i = 0; i <= n - 2; i++) {
			if ((a[i] != a[i + 1])) {

				gol = i;
				nag = gol - sta + 1;
				sta = i + 1;

				ans = ans + Math.abs(a[i] - nag);
			} else if (i == n - 2 && (a[i] == a[i + 1])) {

				gol = i + 1;
				nag = gol - sta + 1;
				sta = i + 1;

				ans = ans + Math.abs(a[i] - nag);
			}

		}}else{
			if(a[0]!=1){ans=1;}else{ans=0;}
		}
		System.out.println(ans);
	}
}