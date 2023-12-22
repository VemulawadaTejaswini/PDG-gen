import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		// input
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		// judge
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(a[i] == a[j]) {
					System.out.println("NO");
					return;
				}
			}
		}
		System.out.println("YES");
	}
}