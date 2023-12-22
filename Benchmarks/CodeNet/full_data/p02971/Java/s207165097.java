import java.util.Scanner;
class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int N = sc.nextInt(),A[] = new int[N],M=0,m=0,i;
		boolean f=false;
		for(i=0;i<N;i++) {
			A[i]=sc.nextInt();
			M=Math.max(M,A[i]);
		}
		for(i=1;i<N;i++) if(A[i-1]!=A[i]) {
			f=true;
			break;
		}
		if(f) {
			for(i=0;i<N;i++) if(A[i]!=M) m=Math.max(m,A[i]);
			for(i=0;i<N;i++) System.out.println(A[i]==M?m:M);
		}else for(i=0;i<N;i++) System.out.println(M);
	}
}