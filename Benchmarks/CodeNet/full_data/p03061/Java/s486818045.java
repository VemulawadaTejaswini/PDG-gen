import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n]; int[] G = new int[n];
		int[] GL = new int[n]; int[] GR = new int[n];

		for(int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
      
      		Arrays.parallelSort(a);

		GL[0] = 0; GR[n-1] = 0;

		for(int i = 1; i < n; i++) {
			GL[i] = gcm(GL[i-1], a[i-1]);
			GR[n-i-1] = gcm(GR[n-i],a[n-i]);
		}

		for(int i =0; i < n; i++)
			G[i] = gcm(GR[i],GL[i]);

		Arrays.parallelSort(G);

		System.out.println(G[n-1]);

		sc.close();
	}

	public static int gcm(int a, int b) {
		if(a == 0 || b == 0) return Math.max(a, b);
		if(a < b)  {
			return gcm(b, a);
		}else {
			if(a%b == 0) {
				return b;
			}else {
				return gcm(b, a%b);
			}
		}
	}
}