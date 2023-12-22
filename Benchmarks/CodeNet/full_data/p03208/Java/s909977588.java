import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		int[] h = new int[n];
		for(i=0; i<n; i++) {
			h[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		sc = null;
		Arrays.sort(h);
		int min = 1000000000;
		int dif;
		for(i=0; i<n-k+1; i++) {
			dif = h[i + k-1] - h[i];
			if(min > dif) min = dif;
		}
		System.out.println(min);
	}
}