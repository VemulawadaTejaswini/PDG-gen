import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n];
		for(int i = 0; i < n; i++) p[i] = sc.nextInt() - 1;
		int ans = 0;
		for(int i = 0; i < n - 1; i++) {
			if(p[i] == i) {
				ans++;
				p = swap(p, i);
			}
		}
		System.out.println(ans);
	}

	static int[] swap(int[] p, int pos) {
		int w = p[pos];
		p[pos] = p[pos + 1];
		p[pos + 1] = w;
		return p;
	}

}
