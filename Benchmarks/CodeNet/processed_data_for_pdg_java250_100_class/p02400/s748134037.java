public class Main {
	public static void main(String[] args){
		double ce, cf;
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		double r = Double.parseDouble(a);
		ce = Math.pow(r,2)*Math.PI;
		cf = 2*r*Math.PI;
		System.out.printf("%f %f",ce,cf);
	}
}
