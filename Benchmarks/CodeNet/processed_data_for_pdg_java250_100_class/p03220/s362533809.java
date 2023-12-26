public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double T = sc.nextDouble();
		double A = sc.nextDouble();
		List<Double> Hi = new ArrayList<>();
		for (int i = 1; i <= N; i++) {
			double H = sc.nextInt();
			Hi.add(H);
		}
		List<Double> X = new ArrayList<Double>();
		List<Double> XX = new ArrayList<Double>();
		for (Double d : Hi) {
			Double dd = Math.abs(A - (T - d * 0.006));
			X.add(dd);
			XX.add(dd);
		}
		Collections.sort(X);
		int ii = 1;
		for (Double d : XX) {
			if (d == X.get(0)) {
				break;
			}
			ii++;
		}
		System.out.print(ii);
	}
}
