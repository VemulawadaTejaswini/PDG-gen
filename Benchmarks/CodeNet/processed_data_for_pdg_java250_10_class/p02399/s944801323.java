public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		int d = (int) (a/b);
		int r = (int) (a%b);
		double f = a/b;
		String str = String.format("%.7f", f);
		sc.close();
		System.out.println(d + " " + r +" " + str);
	}
}
