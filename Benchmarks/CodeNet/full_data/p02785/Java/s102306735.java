import java.util.*;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N=sc.nextInt(),K=sc.nextInt();
      	long ans=0;
		long[] H = new long[N];
		for(int i = 0;i<N;i++) {
			H[i]=sc.nextInt(); 
		}
		Arrays.sort(H);
		for(int i = 0;i<N-K;i++) {
			ans+=H[i];
		}
		System.out.println(ans);
	}
}