import java.util.*;

public class Main {

     public static void main(String []args){

		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] t = new int[n];
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			t[i] = in.nextInt();
			a[i] = in.nextInt();
		}
		
		long tt = t[0];
		long aa = a[0];
		long base = 1;
		
		for (int i = 1; i < n; i++) {
			while (base * t[i] < tt || base * a[i] < aa) {
				base++;
			}
			tt = base * t[i];
			aa = base * a[i];
		}

		while (1 < base && tt <= (base - 1) * t[n - 1] && aa <= (base - 1) * a[n - 1]) {
			base--;
		}

		System.out.println(base * t[n - 1] + base * a[n - 1]);
	}
}
