import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		long a = Long.parseLong(str.split(" ")[0]);
		long b = Long.parseLong(str.split(" ")[1]);
		long c = Long.parseLong(str.split(" ")[2]);
		long d = Long.parseLong(str.split(" ")[3]);

		long ans = 0;

		long anti_c = (long)(b/c) - (long)((a-1)/c);
		long anti_d = (long)(b/d) - (long)((a-1)/d);

		if(c==d) {
				System.out.println(b-a+1-anti_c);
				return;
		}

		long cd = c*d/gcd(c,d);
		long anti_cd = (long)(b/cd) - (long)((a-1)/cd);

		System.out.println(b-a+1-anti_c-anti_d+anti_cd);

	}

	public static long gcd(long c, long d) {
		long temp=0;
		while(d%c!=0) {
			temp = d%c;
			d = c;
			c = temp;
		}
		return c;
	}

}
