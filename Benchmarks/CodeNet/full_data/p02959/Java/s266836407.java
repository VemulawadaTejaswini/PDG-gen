import java.util.*;

public class Main {
    public static void main(String args[] ) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n+1];
		int[] b = new int[n];
		int count = 0;
		
		for (int i = 0; i<n+1; i++) {
			a[i] = sc.nextInt();
		}
		
		for (int i = 0; i<n; i++) {
			b[i] = sc.nextInt();
		}
		
		for (int j = 0; j<n; j++) {
			if (b[j] < a[j]+a[j+1]) {
				count+=b[j];
			} else if(b[j] > a[j]+a[j+1]) {
				count+=(a[j]+a[j+1]);
			}
		}
		System.out.println(count);
	}
}