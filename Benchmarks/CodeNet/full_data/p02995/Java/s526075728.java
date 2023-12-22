import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		long a = Long.parseLong(str.split(" ")[0]);
		long b = Long.parseLong(str.split(" ")[1]);
		long c = Long.parseLong(str.split(" ")[2]);
		long d = Long.parseLong(str.split(" ")[3]);

		 a -= 1;

		long an = (a - a/c - a/d + (a/(lcm(c, d))));
		long bn = (b - b/c - b/d + (b/(lcm(c, d))));

		System.out.println(bn - an);


	}

	static long lcm (long a, long b) {
		long temp;
		long c = a;
		c *= b;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return (long)(c/b);
	}
}
