public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double M = sc.nextInt();
		double[] A = new double[N];
		double sum = 0;
		int count = 0;
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
			sum += A[i];
		}
		for(int i=0; i<N; i++) {
			if( 1/(4*M) <= A[i]/sum ) {
				count++;
			}
		}
		System.out.println(count >= M?"Yes":"No");
		sc.close();
	}
}
