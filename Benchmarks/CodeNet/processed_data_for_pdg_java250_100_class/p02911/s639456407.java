public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q = sc.nextInt();
		int A[] = new int[Q];
		for(int i=0; i<Q; i++) {
			A[i] =sc.nextInt();
		}
		int point[] = new int[N];
		Arrays.fill(point, K-Q);
		for(int i=0; i<Q; i++) {
			point[A[i]-1]++;
		}
		for(int i=0; i<N; i++) {
			if(point[i]<=0) {
				System.out.println("No");
			}else {
				System.out.println("Yes");
			}
		}
	}
}
