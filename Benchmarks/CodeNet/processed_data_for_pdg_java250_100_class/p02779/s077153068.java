public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			int[] A  = new int[N];
			for(int i=0;i<N;i++) {
				A[i] = scan.nextInt();
			}
			Arrays.sort(A);
			int ok = 1;
			for(int k = 0;k<N-1;k++) {
				if(A[k] == A[k+1]) {	
					ok=0;
					break;
				}
			}
			System.out.println(ok==1?"YES":"NO");
		}
	}
}
