import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		char[] s = sc.next().toCharArray();
		int[] a = new int[n];
		for (int i = 1; i < n; i++) {
			if(s[i-1]=='A'&&s[i]=='C') a[i] += 1;
			a[i] += a[i-1];
		}
		int l = 0, r = 0;
		for (int i = 0; i < q; i++) {
			l = Integer.parseInt(sc.next())-1;
			r = Integer.parseInt(sc.next())-1;
			if(l == 0) {
				System.out.println(a[r]);
			}else {
				n = (s[l]=='C'&&s[l-1]=='A')?1:0;
				System.out.println(a[r]-a[l-1]-n);
			}
		}
		sc.close();
	}
}