import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner ipt = new Scanner(System.in);
		int a = ipt.nextInt(), b = ipt.nextInt(), c = 0, ans = 0;
		while (true) {
			if (b == 1)
				break;
			ans++;
			if (ans != 1)
				c += (a - 1);
			else
				c = a;
			if (c >= b)
				break;
		}
		System.out.println(ans);
		ipt.close();
	}
}
