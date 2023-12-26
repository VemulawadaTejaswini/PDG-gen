public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double N = sc.nextDouble();
		double odd = Math.ceil(N/2);
		double probability = odd / N;
		System.out.println(probability);
		sc.close();
	}
}
