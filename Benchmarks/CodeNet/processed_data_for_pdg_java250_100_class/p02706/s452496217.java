public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); 
		int M = sc.nextInt(); 
		int A[] = new int[M];
		int sum = 0; 
		int result = 0; 
		for(int i=0; i<M; i++) {
			A[i] = sc.nextInt();
			sum += A[i];
		}
		result = N - sum;
		if(result < 0) {
			result = -1;
		}
		System.out.print(result);
	}
}
