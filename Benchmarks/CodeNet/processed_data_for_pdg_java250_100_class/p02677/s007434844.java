public class Main{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double A = s.nextDouble();
        double B = s.nextDouble(); 
        double H = s.nextDouble();
        double M = s.nextDouble();
        double radb = Math.toRadians((M*360)/60);
        double rada = Math.toRadians((360*H/12)+(360*M/720));
        double ans =
        		Math.sqrt(A*A + B*B - 2*A*B*Math.cos(rada-radb));
        System.out.println(ans);
	}
}
