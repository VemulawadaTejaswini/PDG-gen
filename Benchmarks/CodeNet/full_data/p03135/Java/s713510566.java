public class A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 勉強に必要な時間
		double T;
		// B世界での時間が進む速度の倍数
		double X;

		T = sc.nextDouble();
		X = sc.nextDouble();

		double t = T / X;

		System.out.println(t);

	}

}