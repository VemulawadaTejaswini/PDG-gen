public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a = scan.nextInt();
		double b = scan.nextInt();
		int h = scan.nextInt();
		int m = scan.nextInt();
		double a_w = (30 * h) + (0.5 * m);
		double b_w = 6 * m;
		double w = 0;
		double ans = 0;
		if(a_w >= b_w) {
			w = a_w - b_w;
		}else {
			w = b_w - a_w;
		}
		if(w > 180) {
			w = 360 - w;
		}
		ans = Math.sqrt(Math.pow(a , 2) + Math.pow(b , 2) - (2 * a * b * Math.cos(Math.toRadians(w))));
		System.out.printf("%.20f" , ans);
	}
}
