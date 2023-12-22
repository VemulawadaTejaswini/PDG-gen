import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int s = 0;

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			int l, r;
			for (l = i - 1; l >= 0; l--) {
				if (a[l] < a[i]) break;
			}
			l++;
			for (r = i + 1; r < n; r++) {
				if (a[r] < a[i]) break;
			}

			int m = tri(r - l) - tri(i - l) - tri(r - (i + 1));
			s += m * a[i];
		}

		System.out.println(s);
	}

	public static int tri(int x){
		return x * (x + 1) / 2;
	}
}
