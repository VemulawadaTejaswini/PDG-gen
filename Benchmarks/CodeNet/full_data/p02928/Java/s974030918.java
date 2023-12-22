import java.lang.reflect.Array;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
//		int[] b = new int[n*k];
		
		long count = 0;
		long countb = 0;
		
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i]>a[j]) {
					count++;
				}
			}
		}
		
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			if (a[a.length-1]>a[i]) {
				countb++;
			}
		}
//		System.out.println(count);
		
		long countc = 0;
//		for (int i = k; i > 1; i--) {
//			countc = countc + countb * (k-1);
//		}
		if (k!=1) {
			countc = ((countb * (k-1)) * (1 - (long)Math.pow((double)countb*(-1),(k-1)))) / (1 - (countb*(-1)));
		}
	
		
		count = (count * k) + countc;
		count = count % ((long)Math.pow(10,9) + 7);
		System.out.println(count);
		
		sc.close();
	}
}