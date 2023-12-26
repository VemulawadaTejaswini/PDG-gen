public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		sc.close();
		int[] B = new int[N];
		for(int i=0;i<N;i++) {
			B[A[i]-1]=i+1;
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++) {
			sb.append(B[i]);
			sb.append(" ");
		}
		String ans = sb.toString();
		System.out.println(ans);
	}
}
