public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int H = sc.nextInt();
		int M = sc.nextInt();
		sc.close();
		double answer = 0.00;
		double omega = 6*M - 30*H - 0.5*M ;
		if(omega >= 0) {
			if(omega >= 180) {
				omega = 360 - omega;
			}else {
			}
		}else {
			if(omega <= -180) {
				omega = 360 + omega;
			}else {
			}
		}
		double radian = Math.toRadians(omega);
		answer = A*A + B*B -2*A*B*Math.cos(radian);
		answer = Math.sqrt(answer);
		System.out.println(answer);
	}
}
