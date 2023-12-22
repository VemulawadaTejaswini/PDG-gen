import java.util.*;

public class Main {
	
	static int change = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		
		int[] L = new int[N];
		
		int ans = 0;
		
		for(int i = 0 ; i < N ; i++) {
			L[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j < N ; j++) {
				if (i == j) {
					continue;
				}
				for(int k = 0 ; k < N ; k++) {
					if (i == j || j == k || i == k) {
						continue;
					}
					if ((L[i] < L[j] + L[k]) && (L[j] < L[k] + L[i]) && (L[k] < L[i] + L[j])) {
						//System.out.println(i+ " " + j+ " " + k);
						ans++;
					}
				}
			}
		}
		
		System.out.println(ans/6);
		
	}

}
