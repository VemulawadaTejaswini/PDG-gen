public class Main {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int d = a / b;
		int r = a % b;
		double f = (double)a / (double)b;
		System.out.print( String.format("%d %d %f", d, r, f) );
	}
}
