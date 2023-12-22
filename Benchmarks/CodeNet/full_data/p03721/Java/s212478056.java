import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, a[], b[];
		int n2 = 1000000;
		long count[];
		long k;
		n = sc.nextInt();
		k = sc.nextLong();
		
		a = new int[n];
		b = new int[n];
		count = new long[n2];
		
		for(int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			count[a[i]] += b[i];
		}
		
		sc.close();
		
		Arrays.sort(a);
		int tmp = a[0];
		long sum = count[a[0]];
		
		for(int i = 1; i < n; ++i) {
			if(a[i] != a[i - 1])
			sum += count[a[i]];
			if(sum >= k) {
				tmp = a[i];
				break;
			}
		}
		
		System.out.println(tmp);
	}

}
