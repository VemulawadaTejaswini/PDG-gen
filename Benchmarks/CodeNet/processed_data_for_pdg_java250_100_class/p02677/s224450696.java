public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double h  = sc.nextInt();
			double m = sc.nextInt();
			double radius = (h / 12 + m/(60*12) - m /60) * Math.PI * 2.0;
			double ans = Math.sqrt(Math.pow(a, 2) + Math.pow(b,2) - 2*a*b*Math.cos(radius));
			System.out.println(ans);
		}
	}
}
