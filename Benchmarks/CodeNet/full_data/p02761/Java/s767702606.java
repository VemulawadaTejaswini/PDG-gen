import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] v = new int[N];
		Arrays.fill(v, -1);
		
		for(int i=0; i<M; i++) {
			int s = sc.nextInt()-1;
			int c = sc.nextInt();
			
			if(v[s]<0) {
				v[s] = c;
			} else if(v[s]!=c) {
				System.out.println(-1);
				sc.close();
				return;
			}
		}
		if(N>1 && v[0]==0) {
			System.out.println(-1);
			sc.close();
			return;
		}
		for(int i=0; i<N; i++) {
			System.out.print(v[i]>=0 ? v[i] : 0);
		}
		System.out.println();
		sc.close();
	}
}
