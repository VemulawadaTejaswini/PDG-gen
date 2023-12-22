import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		int[] l = new int[q];
		int[] r = new int[q];

		int max = 0;
		for(int i = 0; i < q; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();

			max = Math.max(max, l[i]);
			max = Math.max(max, r[i]);
		}

		boolean[] pnums = new boolean[max+1];
		for(int i = 2; i <= max; i++) {
			if(pnums[i] != false);
			for(int j = i+i; j <= max; j+=i) {
				pnums[j] = true;
			}
		}

		int cnt = 0;
		int[] cnts = new int[max+1];
		cnts[0] = 1;
		cnts[1] = 1;
		for(int i = 2; i <= max; i++) {
			if( pnums[i] == false && pnums[(i+1)/2] == false )
				cnt++;
			cnts[i] = cnt;
		}

		for(int i = 0; i < q; i++) {
			System.out.println(cnts[r[i]] - cnts[l[i]-1]);
		}
	}
}