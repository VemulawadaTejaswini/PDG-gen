public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int t = sc.nextInt();
		double v = t + 0.5;
		int p = 0;
		p = (int)v / a;
		int r = 0;
		r = (int)p * b;
		System.out.println(r);
	}
}
