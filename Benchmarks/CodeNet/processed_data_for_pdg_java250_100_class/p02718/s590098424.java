public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int A[] = new int [N];
		for(int i=0;i<N;i++) {
			A[i] = sc.nextInt();
		}
		double sum = 0.0;
		for(int j=0;j<N;j++) {
			sum += A[j];
		}
		boolean ok[] = new boolean[N];
		Arrays.fill(ok, true);
		double hantei = sum/(4*M);
		for(int k=0;k<N;k++) {
			if(A[k]<hantei) {
				ok[k] = false;
			}
		}
		int count = 0;
		for(int l=0;l<N;l++) {
			if(ok[l]) {
				count ++;
			}
		}
		if(count>=M) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
