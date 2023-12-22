import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		for (int i=0;i<q;i++) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			long rt = (long) Math.floor(Math.sqrt(a*b));
			long ans = 0;
			if (rt*(rt+1) < a*b) {
				ans = 2*rt-1;
			} else if (rt*rt < a*b){
				ans = 2*rt-2;
			} else {
				ans = 2*rt-3;
				if(rt == a && rt == b) {
					ans++;
				}
			}
			System.out.println(ans);
		}

	}

}
