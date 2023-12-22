import java.util.Scanner;
class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int N = sc.nextInt(),A[] = new int[N],M=0,m;
		for(int i=0;i<N;i++) {
			A[i] = sc.nextInt();
			M = Math.max(M,A[i]);
		}
		m=A[0];
		for(int i=0;i<N;i++) if(A[i]!=M) m=Math.max(m,A[i]);
		for(int i=0;i<N;i++) System.out.println(A[i]==M?m:M);
	}
}