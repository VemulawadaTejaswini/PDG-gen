import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = 0;
		int q = 0;
		int[] usedp = new int[n];
		for (int i = 0; i < n; i++) {
			usedp[i] = 0;
		}
		int[] usedq = new int[n];
		for (int i = 0; i < n; i++) {
			usedq[i] = 0;
		}
		for (int i = 0; i < n-1; i++) {
			int a = sc.nextInt();
			int b = 0;
			for (int j = 0; j < a-1; j++) {
				if(usedp[j] == 0) b++;
			}
			p += b*fact(n-i-1);
			usedp[a-1] = 1;
		}
		sc.next();
		for (int i = 0; i < n-1; i++) {
			int a = sc.nextInt();
			int b = 0;
			for (int j = 0; j < a-1; j++) {
				if(usedq[j] == 0) b++;
			}
			q += b*fact(n-i-1);
			usedq[a-1] = 1;
		}
		p++;q++;
		System.out.println(Math.abs(p-q));
		sc.close();
	}
	private static int fact(int n) {
	    int a = 1;
		while(n != 0) {
			a = a*n;
			n = n-1;
		}
		return a;
	}
}