import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		int answer = -1;

		for (int i = 0; i <= 1000; i++) {
			int aExp = i * 8 / 100;
			int bExp = i * 10 / 100;

			if (a == aExp && b == bExp) {
				answer = i;
				break;
			}
		}

		print(answer);
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}
