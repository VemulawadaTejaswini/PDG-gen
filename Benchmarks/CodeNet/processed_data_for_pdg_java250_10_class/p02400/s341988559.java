public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r =  sc.nextDouble();
		double pi = Math.PI;
		double area = Math.pow(r, 2) * pi; 
		double Cir =2 * pi * r; 
		System.out.printf("%.5f %.5f\n",area,Cir);
	}
}
