import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] tmp = sc.nextLine().split(" ");
		int n = Integer.parseInt(tmp[0]);
		int m = Integer.parseInt(tmp[1]);
		int[] l = new int[m];
		int[] r = new int[m];
		for(int i=0; i<m; i++) {
			tmp = sc.nextLine().split(" ");
			l[i] = Integer.parseInt(tmp[0]);
			r[i] = Integer.parseInt(tmp[1]);
		}
		sc.close();

		int lmax = 0;
		int rmin = 1000000;
		for(int i=0; i<m; i++) {
			if (l[i] > lmax) lmax = l[i];
			if (r[i] < rmin) rmin = r[i];
		}
		System.out.println(lmax <= rmin ? rmin-lmax+1 : 0);
	}
}
