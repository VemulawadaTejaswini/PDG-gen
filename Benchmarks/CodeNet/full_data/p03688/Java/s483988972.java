import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] a = new int[N];
		for(int i=0; i<N; i++)
			a[i] = sc.nextInt();
		Arrays.sort(a);
		
		System.out.println(isPossible(a) ? "Yes" : "No");
		
		sc.close();
	}
	
	static boolean isPossible(int[] a) {
		int N = a.length;
		if(a[0]+1 < a[N-1]) {
			return false;
			
		} else if(a[0]==a[N-1]) {
			return a[0]*2 <= N || a[0] == N-1;
			
		} else {
			int uniq = 0;
			for(int i=0; i<N; i++)
				if(a[i]==a[0])
					uniq++;
			
			return uniq < a[N-1] && uniq + (a[N-1]-uniq)*2 <= N;
		}
	}
}
