import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N,Q;
		N=sc.nextInt();
		Q=sc.nextInt();
		sc.nextLine();
		String S = sc.nextLine();
		String subs;
		for(int i = 0;i<Q;i++) {
			int l,r;
			l=sc.nextInt();
			r=sc.nextInt();
			subs=S.substring(l-1,r);
			int ans=0;
			for(int k=1;k<subs.length();k++) {
				if(subs.charAt(k)=='C' && subs.charAt(k-1)=='A') {
					ans++;
				}
			}
			System.out.println(ans);
		}
	}
}
