public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double H = sc.nextDouble();
		double M = sc.nextDouble();
		double theta_a = 30*(H+M/60);
		double theta_b = 360*(M/60);
		double theta_ab = Math.abs(theta_a-theta_b);
		double C = Math.sqrt(Math.pow(A,2)+Math.pow(B,2)-2*A*B*Math.cos(theta_ab/180*Math.PI));
		System.out.println(C);
	}
}
