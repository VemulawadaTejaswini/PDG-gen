import java.util.Scanner;

public class Main {

	static int[] fact = new int[9];


	public static void main(String[] args) {
		fact[1] = 1;
		for(int i = 2; i <= 8; i++)
			fact[i] = fact[i-1] * i;

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n];
		for(int i = 0; i < n; i++)
			p[i] = sc.nextInt();

		int[] q = new int[n];
		for(int i = 0; i < n; i++)
			q[i] = sc.nextInt();

		int ans = Math.abs(getPosi(p) - getPosi(q));
		System.out.println(ans);
        return;
    }

	static private int getPosi(int[] x) {

			int l = x.length;
			int p = 1;

			for(int i = 0; i < l; i++) {
				p += fact[l-i-1] * (x[i]-1);
				for(int j = i+1; j < l; j++) {
					if(x[j] > x[i])
						x[j]--;
				}
			}
		return p;

	}

}

