import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i,j,k;
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int[] a = new int[n];
		for(i=0; i<n; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		Arrays.sort(a);
		int b;
		int c;
		for(i = 0; i < m; i++) {
			b = Integer.parseInt(sc.next());
			c = Integer.parseInt(sc.next());
			for(j=0;j<b;j++) {
				if(a[j] < c) {
					a[j] = c;
				} else {
					break;
				}
			}
			if(j == b) {
				k=0;
				for(;j<n;j++) {
					if(a[j] < c) {
						a[k] = a[j]; 
						a[j] = c;
					} else {
						break;
					}
					k++;
				}
			}
		}
		sc.close();
		sc = null;
		long sum = 0;
		for(i=0; i<n; i++) {
			sum += a[i];
		}
		System.out.println(sum);
	}
}
