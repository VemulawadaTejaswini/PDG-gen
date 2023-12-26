public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			int K = scan.nextInt();
			int Q = scan.nextInt();
			int[] A = new int[Q];
			int[] point = new int[N];
			String[] kuria = new String[N];
			for(int i =0;i<Q;i++) {
				A[i] = scan.nextInt();	
			}
			for(int i =0;i<Q;i++) {
				point[A[i]-1]++;
			}
			for(int i = 0;i<N;i++) {
				point[i]=point[i]+K-Q;
				if(point[i]>0) {
					kuria[i] = "Yes";
				}else{
					kuria[i] = "No";
				}
			}
			for(int i = 0;i<N;i++) {
				System.out.println(kuria[i]);
			}
		}
	}
}
