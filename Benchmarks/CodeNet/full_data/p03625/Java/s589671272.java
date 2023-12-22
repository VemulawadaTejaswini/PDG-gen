import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static long rectangle(int a[]) {
		long s;
		int height = 0, len = 0;
		int n = a.length;
		
		for(int i = n - 1; i > 0; --i) {
			System.out.println(a[i] + " " + len + " " + height);
			if(a[i] == a[i - 1]) {
				if(len == 0)
				len = a[i];
				else {
					if(height == 0)
						height = a[i];
					else break;
				}
				--i;
			}
		}
		
		s = len * height;
		return s;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, a[];
		
		n = sc.nextInt();
		a = new int[n];
		for(int i = 0; i < n; ++i)a[i] = sc.nextInt();
		
		sc.close();
		
		Arrays.sort(a);
		long ans = rectangle(a);
		
		System.out.println(ans);
	}

}
