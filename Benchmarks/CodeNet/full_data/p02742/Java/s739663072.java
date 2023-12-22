import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long h = sc.nextLong();
		long w = sc.nextLong();
		sc.close();

		if (h == 1 || w == 1) {
			print(1);
			return;
		}

		print((h * w + 1) / 2);
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}
