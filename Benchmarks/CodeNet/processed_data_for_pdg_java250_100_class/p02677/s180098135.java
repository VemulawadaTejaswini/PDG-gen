public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int m = sc.nextInt();
		double Mangle = (m*360.0)/60.0;
		double Hangle = (h*60.0+m)*360.0/(12.0*60.0);
		double MHangle = 0;
		if(Hangle-Mangle>180) {
			MHangle = 360-(Hangle-Mangle);
		}else {
			MHangle = Hangle-Mangle;
		}
		double cosA = Math.cos(MHangle*(Math.PI/180.0));
		double answer = Math.sqrt((a*a)+(b*b)-(2*a*b*cosA));
		System.out.println(answer);
	}
}
