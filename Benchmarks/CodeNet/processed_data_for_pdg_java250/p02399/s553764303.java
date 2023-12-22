public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(); 
		int b = scan.nextInt(); 
		int d = a / b;
		int r = a % b;
		double A = a;
		double B = b;
		double f = A / B;
		System.out.println(d +  " " + r + " " + String.format("%.5f", f));
	}
}
