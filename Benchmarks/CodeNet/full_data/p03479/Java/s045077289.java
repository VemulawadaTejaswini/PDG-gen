import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong(), y = sc.nextLong();
		sc.close();
		long ans = 0;
		long n = y / x;
		for(int i = 0; i < y; ++i) {
			long tmp = (long)Math.pow(2,  i);
			if(tmp > n) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}

}
