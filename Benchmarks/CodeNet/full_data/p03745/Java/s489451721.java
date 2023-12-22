import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0; i<N; i++)
			A[i] = sc.nextInt();
		
		int ans = 1;
		int type=0;
		for(int i=1; i<N; i++) {
			int nextType = A[i-1]==A[i] ? 0 : (A[i-1]<A[i] ? 1 : -1);
			if(type==0) {
				type = nextType;
			} else {
				if(type*nextType<0) {
					ans++;
					type = 0;
				}
			}
		}
		
		System.out.println(ans);
		sc.close();
	}
}
