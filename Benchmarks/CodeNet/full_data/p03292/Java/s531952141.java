import java.util.Scanner;

public class Main {

	public static int Compraison(int a, int b) {

		if (a < b)
			return a;
		else
			return b;
	}

	public static int TaskCalc(int a, int b, int c) {

		int sum = 0;

		sum += Math.abs(b - a);
		sum += Math.abs(c - b);

		return sum;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int cost;

		cost = TaskCalc(a, b, c);
		cost = Compraison(cost, TaskCalc(a, c, b));
		cost = Compraison(cost, TaskCalc(b, a, c));
		cost = Compraison(cost, TaskCalc(b, c, a));
		cost = Compraison(cost, TaskCalc(c, a, b));
		cost = Compraison(cost, TaskCalc(c, b, a));

		System.out.println(cost);

		sc.close();
	}

}
