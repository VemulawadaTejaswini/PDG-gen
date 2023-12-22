import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int max = 0;
		int ans_i = 0;
		int ans_j = 0;
		
		for (int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);
		for (int i=n-1;i >= 0;i--) {
			int a_i = a[i];
			for (int j=i-1;j >= 0;j--) {
				int a_j = a[j];
				int tmp = comb(a_i, a_j);
				if (max < tmp) {
					max = tmp;
					ans_i = a_i;
					ans_j = a_j;
				}
			}	
		}
		
		if (ans_i > ans_j) {
			System.out.println(ans_i + " " + ans_j);			
		} else {
			System.out.println(ans_j + " " + ans_i);
		}
	}
	
	static int comb(int i, int k) {
		k = i < k ? i : k;
		if (k == 0) {
			return 1;
		} else {
			return comb(i-1,k-1) * i/k;
		}
	}
}