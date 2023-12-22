import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long h = sc.nextLong();
		long w = sc.nextLong();
		long res = (h / 2 + h % 2) * (w / 2 + w % 2);
		--h;
		--w;
		res += (h / 2 + h % 2) * (w / 2 + w % 2);
		;
		System.out.println(res);
	}
}
