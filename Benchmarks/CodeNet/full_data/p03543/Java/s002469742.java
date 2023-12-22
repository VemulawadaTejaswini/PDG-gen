import java.util.Scanner;

public class Main {

	static int a[] = new int[4];

	public static int seven(int s) {
		int ans = a[0], e = s;
		if(s >= 8)return -1;
		for (int i = 0; i < 3; ++i) {
			int tmp = 1 & e;
			if (tmp == 1)
				ans += a[i + 1];
			else
				ans -= a[i + 1];
			e = e >> 1;
		}
		if (ans == 7)
			return s;
		else
			return (seven(++s));
	}

	public static String make(int s) {
		String ans = Integer.toString(a[0]);
		int e = s;
		for (int i = 0; i < 3; ++i) {
			if ((e & 1) == 1)
				ans += "+";
			else
				ans += "-";
			e = e >> 1;
			ans += Integer.toString(a[i + 1]);
		}

		ans += "=7";
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.next();
		sc.close();
		for (int i = 0; i < 4; ++i) {
			a[i] = Integer.parseInt(in.substring(i,  i + 1));
		}
		int s = seven(0);
		System.out.println(make(s));

	}

}
