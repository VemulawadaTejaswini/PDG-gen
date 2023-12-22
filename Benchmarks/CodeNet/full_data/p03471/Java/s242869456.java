import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long y = sc.nextLong();
		String ans = "-1 -1 -1";

		y /= 1000;

		//10 5 1でy/1000を作れるか
		for(long man = 0; man <= n; man++) {
			for(long higuti = 0; higuti <= n; higuti++) {
				for(long sen = 0; sen <= n; sen++) {
					if(man+higuti+sen==n&&10*man+5*higuti+sen==y) {
						System.out.println(man+" "+higuti+" "+sen);
						return;
					}
					if(10*man > y) {
						System.out.println(ans);
						return;
					}
				}
			}
		}

		System.out.println(ans);
	}
}
