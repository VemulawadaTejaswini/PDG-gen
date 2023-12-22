import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		long a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		long x = sc.nextInt(), y = sc.nextInt();
		long ans = Long.MAX_VALUE;
		for(int i = 0; i <= Math.max(x, y); i++) {
			long xx = x-i;
			if(xx < 0) {
				xx = 0;
			}
			long yy = y-i;
			if(yy < 0) {
				yy = 0;
			}
			ans = Math.min(ans, a*xx+b*yy+c*2*i);
		}
		System.out.println(ans);
	}
}