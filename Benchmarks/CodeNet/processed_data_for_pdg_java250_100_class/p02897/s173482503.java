public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int numE = (N+1)/2;
		float p = (float)numE/N;
		System.out.printf("%.7f", p);
	}
}
