class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double pi = Math.PI;
		double menseki = r * r * pi;
		double ensyu = 2 * r * pi;
		System.out.printf("%.6f %.6f",menseki,ensyu);
	}
}
