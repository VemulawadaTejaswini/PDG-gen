import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long h = sc.nextLong();
		sc.close();

		long hp = h;
		long num = 1;
		long attack = 0;

		while (hp > 0) {
			attack = attack + num;
			num = num * 2;
			hp = hp / 2;
		}

		print(attack);
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}
